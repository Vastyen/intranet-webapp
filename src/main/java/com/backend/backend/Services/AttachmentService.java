package com.backend.backend.Services;

import com.backend.backend.Entities.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;
    Attachment getAttachment(String fileId) throws Exception;

}