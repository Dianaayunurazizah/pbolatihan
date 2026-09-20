/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author acer
 */
public class classAbib {
 
    String nim;
    String nama;
    String prodi;
    String alamat;

    public classAbib(String nim, String nama, String prodi, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
}
