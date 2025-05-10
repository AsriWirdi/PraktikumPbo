package Soal7_12.test;

import Soal7_12.paket8.Printer;
import Soal7_12.paketInterface.MyInterface;

public class Espon extends Printer implements MyInterface {
    // constructor
    public Espon(String merek, int tintaLevel) {
        this.merek = merek;
        this.tintaLevel = tintaLevel;
    }

    @Override
    public void cetak() {
        System.out.println("mencetakk...");
    }

    @Override
    public void isiTinta() {
        System.out.println("Mengisi tinta...");
        this.tintaLevel = 100;
        System.out.println("tinta sudah penuh");
    }

    @Override
    public String getStringInfoState() {
        return "Merek Printer: " + merek + "\nTinta Level: " + tintaLevel;
    }

}
