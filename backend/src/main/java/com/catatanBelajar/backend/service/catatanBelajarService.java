package com.catatanBelajar.backend.service;

import com.catatanBelajar.backend.model.catatanBelajar;

import java.util.List;
import java.util.Optional;

public interface catatanBelajarService {
    List<catatanBelajar> findAllcatatanBelajar();

    Optional<catatanBelajar> findById(Long id_catatan);

    catatanBelajar saveCatatan(catatanBelajar catatanBelajar);

    catatanBelajar updateCatatan(catatanBelajar catatanBelajar);

    void deleteCatatan(Long id_catatan);
}
