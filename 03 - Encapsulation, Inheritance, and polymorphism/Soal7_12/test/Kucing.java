package Soal7_12.test;

import Soal7_12.paket4.Hewan;
import Soal7_12.paketInterface.MyInterface;

public class Kucing extends Hewan implements MyInterface {
    // constructor
    public Kucing(String jenisHewan, String warna){
        this.jenisHewan = jenisHewan;
        this.warna = warna;
    }

    @Override
    public void tidur(){
        System.out.println("Kucing sedang tidur...");
    }

    @Override
    public void makan(){
        System.out.println("Kucing sedang Makan...");
    }

    @Override
    public String getStringInfoState(){
        return "Jenis Hewan: " + jenisHewan + "\nWarna: " + warna;
    }
}
