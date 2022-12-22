package com.backend.backend.Repositories;

import com.backend.backend.Entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM request WHERE EXTRACT(MONTH FROM fecha) = :mes")
    ArrayList<Request> findByMes(@Param("mes") Integer mes);
}
