package com.catatanBelajar.backend.service;

import com.catatanBelajar.backend.model.catatanBelajar;

import java.util.List;

public interface catatanBelajarService {
    List<catatanBelajar> findAllcatatanBelajar();

    catatanBelajar findById(Long id_catatan);

    catatanBelajar saveCatatan(catatanBelajar catatanBelajar);

    catatanBelajar updateCatatan(catatanBelajar catatanBelajar);

    void deleteCatatan(Long id_catatan);
}
