package com.catatanBelajar.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<catatanBelajar> findAllcCatatanBelajars() {
        return catatanbelajarService.findAllcatatanBelajar();
    }

    @GetMapping("/{id}")
    public catatanBelajar findcatatanBelajarByid(@PathVariable("id") Long id) {
        return catatanbelajarService.findById(id);
    }

    public catatanBelajar saveCatatan(@RequestBody catatanBelajar catatanbelajar) {
        return catatanbelajarService.saveCatatan(catatanbelajar);
    }

    public catatanBelajar updateCatatanBelajar(@RequestBody catatanBelajar catatanbelajar) {
        return catatanbelajarService.updateCatatan(catatanbelajar);
    }
}
