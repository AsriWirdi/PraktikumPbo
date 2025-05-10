package Soal7_12.test;

import Soal7_12.paket3.Laptop;
import Soal7_12.paketInterface.MyInterface;

public class Lenovo extends Laptop implements MyInterface {

    // constructor
    public Lenovo(String merek, int ram) {
        this.merek = merek;
        this.ram = ram;
    }

    @Override
    public void nyalakan() {
        System.out.println("Laptop Dinyalakan");
    }

    @Override
    public void bukaApp(String app) {
        System.out.println("Membuka aplikasi " + app);
    }

    @Override
    public void matikan() {
        System.out.println("Laptop Dimatikan");
    }

    @Override
    public String getStringInfoState() {
        return "Merek Laptop: " + merek + "\nRam: " + ram;
    }
}
