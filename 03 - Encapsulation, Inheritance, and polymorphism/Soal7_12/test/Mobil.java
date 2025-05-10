package Soal7_12.test;

import Soal7_12.paket1.Kendaraan;
import Soal7_12.paketInterface.MyInterface;

public class Mobil extends Kendaraan implements MyInterface {
    // constructor
    public Mobil(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    @Override
    public String getStringInfoState() {
        return "Merek Mobil: " + merek + "\nWarna Mobil: " + warna;
    }

    @Override
    public void nyalakanMesin() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void matikanMesin() {

    }
}
