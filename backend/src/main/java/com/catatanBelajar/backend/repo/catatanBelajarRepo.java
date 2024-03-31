package com.catatanBelajar.backend.repo;

import com.catatanBelajar.backend.model.catatanBelajar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface catatanBelajarRepo extends JpaRepository<catatanBelajar, Long> {

}
