package com.catatanBelajar.backend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catatanBelajar.backend.model.catatanBelajar;
import com.catatanBelajar.backend.service.catatanBelajarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catatanBelajar")
public class catatanBelajarController {

    private final catatanBelajarService catatanbelajarService;

    public catatanBelajarController(catatanBelajarService catatanbelajarService) {
        this.catatanbelajarService = catatanbelajarService;
    }

    @GetMapping
    public List<catatanBelajar> findAllCatatanBelajar() {
        return catatanbelajarService.findAllcatatanBelajar();
    }

    @GetMapping("/{id}")
    public Optional<catatanBelajar> findcatatanBelajarByid(@PathVariable("id") Long id) {
        return catatanbelajarService.findById(id);
    }

    @PostMapping
    public catatanBelajar saveCatatan(@RequestBody catatanBelajar catatanbelajar) {
        return catatanbelajarService.saveCatatan(catatanbelajar);
    }

    @PutMapping("/{id}")
    public catatanBelajar updateCatatanBelajar(@PathVariable("id") Long id,
            @RequestBody catatanBelajar catatanbelajar) {
        catatanbelajar.setId_catatan(id);
        return catatanbelajarService.updateCatatan(catatanbelajar);
    }

    @DeleteMapping("/{id}")
    public void deleteCatatanBelajar(@PathVariable("id") Long id) {
        catatanbelajarService.deleteCatatan(id);
    }
}
