package Soal7_12.test;

import Soal7_12.paket7.Sepeda;
import Soal7_12.paketInterface.MyInterface;

public class Scott extends Sepeda implements MyInterface {
    // constructor
    public Scott(String merek, String warna, int kecepatan) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    @Override
    public void kayuh() {
        System.out.println("Sepeda  dikayuh");
    }

    @Override
    public void rem() {
        System.out.println("Sepeda direm...");
    }

    @Override
    public String getStringInfoState() {
        return "Merek Sepeda: " + merek + "\nWarna Sepeda: " + warna + "\nKecepatan Sepeda: " + kecepatan;
    }

}
