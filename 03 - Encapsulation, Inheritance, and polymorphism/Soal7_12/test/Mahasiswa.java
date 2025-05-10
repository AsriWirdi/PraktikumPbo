package Soal7_12.test;

import Soal7_12.paket2.Manusia;
import Soal7_12.paketInterface.MyInterface;

public class Mahasiswa extends Manusia implements MyInterface {
    // constructor
    public Mahasiswa(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public String getStringInfoState() {
        return "Nama Mahasiswa: " + nama + "\nAlamat Mahasiswa: " + alamat;
    }
}
