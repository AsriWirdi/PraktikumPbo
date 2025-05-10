package Soal7_12.test;

import Soal7_12.paket5.Buah;
import Soal7_12.paketInterface.MyInterface;

public class Durian extends Buah implements MyInterface {
    // constructor
    public Durian(String namaBuah, String rasaBuah) {
        this.namaBuah = namaBuah;
        this.rasaBuah = rasaBuah;
    }

    @Override
    public void makanBuah() {
        System.out.println("Memakan Buah " + namaBuah);
    }

    @Override
    public String getStringInfoState() {
        return "Nama Buah: " + namaBuah + "\nRasa Buah: " + rasaBuah;
    }

}
