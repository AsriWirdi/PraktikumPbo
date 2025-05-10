package Soal7_12.test;

import Soal7_12.paket6.Smartphone;
import Soal7_12.paketInterface.MyInterface;

public class Samsung extends Smartphone implements MyInterface {
    public Samsung(String merek, int baterai) {
        this.merek = merek;
        this.baterai = baterai;
    }

    @Override
    public void nyalakan() {
        System.out.println("menyalakan " + merek);
    }

    @Override
    public void matikan() {
        System.out.println("mematikan " + merek);
    }

    @Override
    public void telepon() {
        System.out.println("Menelpon...");
    }

    @Override
    public String getStringInfoState() {
        return "Merek Smartphone: " + merek + "\nbaterai Smartphone: " + baterai;
    }

}
