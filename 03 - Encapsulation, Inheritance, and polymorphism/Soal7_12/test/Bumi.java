package Soal7_12.test;

import Soal7_12.paket9.Buku;
import Soal7_12.paketInterface.MyInterface;

public class Bumi extends Buku implements MyInterface{
    {
    judul = "Bumi";
    penulis = "Tere Liye";
    jumlahHalaman = 440;
    }
    
    @Override
    public void buka(){
        System.out.println("Buku " + judul + " dibuka..."); 
    }

    @Override
    public void baca(){
        System.out.println("Buku " + judul + " dibaca...");
    }

    @Override
    public void tutup(){
        System.out.println("Buku " + judul + " ditutup...");
    }

    @Override
    public String getStringInfoState(){
        return "";
    }

}
