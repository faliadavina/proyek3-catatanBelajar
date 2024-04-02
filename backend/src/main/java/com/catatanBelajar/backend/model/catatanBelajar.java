package com.catatanBelajar.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "catatanbelajar")
public class catatanBelajar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catatan")
    private long id_catatan;

    @Column(name = "judul_catatan")
    private String judul_catatan;

    @Column(name = "isi_catatan")
    private String isi_catatan;

    @Column(name = "id_tag")
    private String id_tag; // Menambahkan kolom Id_tag

    @Column(name = "id_akun")
    private String id_akun; // Menambahkan kolom id_akun

    @Column(name = "privasi")
    private Privasi privasi; // Menggunakan enum Privasi untuk kolom privasi

    public enum Privasi {
        PUBLIC,
        PRIVATE
    }

    public catatanBelajar() {
    }

    public catatanBelajar(Long id_catatan, String judul_catatan, String isi_catatan, String id_tag, String id_akun,
            Privasi privasi) {
        this.id_catatan = id_catatan;
        this.judul_catatan = judul_catatan;
        this.isi_catatan = isi_catatan;
        this.id_tag = id_tag;
        this.id_akun = id_akun;
        this.privasi = privasi;
    }

    public long getId_catatan() {
        return id_catatan;
    }

    public void setId_catatan(Long id_catatan) {
        this.id_catatan = id_catatan;
    }

    public String getJudul_catatan() {
        return judul_catatan;
    }

    public void setJudul_catatan(String judul_catatan) {
        this.judul_catatan = judul_catatan;
    }

    public String getIsi_catatan() {
        return isi_catatan;
    }

    public void setIsi_catatan(String isi_catatan) {
        this.isi_catatan = isi_catatan;
    }

    public String getId_tag() {
        return id_tag;
    }

    public void setId_tag(String id_tag) {
        this.id_tag = id_tag;
    }

    public String getId_akun() {
        return id_akun;
    }

    public void setId_akun(String id_akun) {
        this.id_akun = id_akun;
    }

    public Privasi getPrivasi() {
        return privasi;
    }

    public void setPrivasi(Privasi privasi) {
        this.privasi = privasi;
    }

}
