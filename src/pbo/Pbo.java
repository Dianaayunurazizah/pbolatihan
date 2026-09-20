/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

/**
 *
 * @author Acer
 */
public class Pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan lth = new Latihan("123", "ANNA", "AKUTANSI");
        lth.setNama("Diana");
        System.out.println("NAMA :" + lth.getNama());
        
        
        
        hamid h = new hamid("12345", "Hamid", "SI", "Semi");
        System.out.println("Nama : " + h.getNama() + "\nNIM : " + h.getNim() + "\nProdi : " + h.getProdi() + "\nAlamat : " + h.getAlamat());
    }
    
}
