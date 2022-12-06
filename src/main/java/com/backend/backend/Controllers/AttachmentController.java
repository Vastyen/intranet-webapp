package com.backend.backend.Controllers;

import com.backend.backend.Entities.Attachment;
import com.backend.backend.ResponseData;
import com.backend.backend.Services.AttachmentService;
import com.backend.backend.Services.AttachmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;

@Controller
@CrossOrigin("*")
@RequestMapping("/pappers")
public class AttachmentController {
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private AttachmentServiceImpl attachmentServiceImp;

    public AttachmentController(AttachmentService attachmentService, AttachmentServiceImpl attachmentServiceImp) {
        this.attachmentService = attachmentService;
        this.attachmentServiceImp = attachmentServiceImp;
    }

    @PostMapping("/upload")
    public ResponseData uploadFile(@RequestParam("file")MultipartFile file) throws Exception {
        Attachment attachment = null;
        String downloadURl = "";
        attachment = attachmentService.saveAttachment(file);
        downloadURl = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/download")
                .path(attachment.getId())
                .toUriString();

        return new ResponseData(attachment.getFileName(),
                downloadURl,
                file.getContentType(),
                file.getSize());
    }

    @GetMapping("/download/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) throws Exception {
        Attachment attachment = null;
        attachment = attachmentService.getAttachment(fileId);
        return  ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(attachment.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + attachment.getFileName()
                                + "\"")
                .body(new ByteArrayResource(attachment.getData()));
    }
    @CrossOrigin("*")
    @GetMapping("/all")
    public ResponseEntity<ArrayList<Attachment>> listarTodos() {
        ArrayList<Attachment> lista = attachmentServiceImp.listarTodos();
        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        attachmentServiceImp.borrarPorId(id);
        return ResponseEntity.ok("Borrado");
    }


}