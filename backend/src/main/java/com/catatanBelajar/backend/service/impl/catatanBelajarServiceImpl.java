package com.catatanBelajar.backend.service.impl;

import org.springframework.stereotype.Service;
import com.catatanBelajar.backend.model.catatanBelajar;
import com.catatanBelajar.backend.repo.catatanBelajarRepo;
import com.catatanBelajar.backend.service.catatanBelajarService;

import java.util.List;
import java.util.Optional;

@Service
public class catatanBelajarServiceImpl implements catatanBelajarService {

    private final catatanBelajarRepo catatanbelajarRepo;

    public catatanBelajarServiceImpl(catatanBelajarRepo catatanbelajarRepo) {
        this.catatanbelajarRepo = catatanbelajarRepo;
    }

    @Override
    public List<catatanBelajar> findAllcatatanBelajar() {
        return catatanbelajarRepo.findAll();
    }

    @Override
    public Optional<catatanBelajar> findById(Long id) {
        return catatanbelajarRepo.findById(id);
    }

    @Override
    public catatanBelajar saveCatatan(catatanBelajar catatanBelajar) {
        return catatanbelajarRepo.save(catatanBelajar);
    }

    @Override
    public catatanBelajar updateCatatan(catatanBelajar catatanbelajar) {
        return catatanbelajarRepo.save(catatanbelajar);
    }

    @Override
    public void deleteCatatan(Long id) {
        catatanbelajarRepo.deleteById(id);
    }
}
