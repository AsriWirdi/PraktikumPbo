package Soal7_12.test;

import Soal7_12.paket10.KipasAngin;
import Soal7_12.paketInterface.MyInterface;

public class Miyako extends KipasAngin implements MyInterface {
    public Miyako (String merek, int kecepatan){
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    @Override
    public void nyalakan(){
        System.out.println("Kipas Angin " + merek + " dinyalakan");
    }

    @Override
    public void matikan(){
        System.out.println("Kipas Angin " + merek + " dimatikan");
    }

    @Override
    public void aturKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
        System.out.println("Atur kecepatan kipas menjadi " + kecepatan);
    }

    @Override
    public String getStringInfoState(){
        return "Merek Kipas Angin: " + merek + "\nKecepatan Kipas Angin: " + kecepatan;
    } 

}


