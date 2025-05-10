package Soal7_12.paket1;

public abstract class Kendaraan {
    protected String merek, warna;
    protected int kecepatan;

    protected abstract void nyalakanMesin();
    protected abstract void gas();
    protected abstract  void matikanMesin();

}
