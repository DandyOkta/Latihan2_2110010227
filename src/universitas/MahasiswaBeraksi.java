/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author acer
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa dandy = new Mahasiswa(" 2110010227"," Muhammad Dandy Oktavian Nisfi"," TI");
        System.out.println("NPM : "+dandy.npm);
        System.out.println("Nama : "+dandy.nama);
        System.out.println("Prodi : "+dandy.prodi);
        
        System.out.println("getDetail : "+dandy.getDetail());
    }
}
