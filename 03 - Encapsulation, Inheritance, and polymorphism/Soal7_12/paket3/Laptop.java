package Soal7_12.paket3;

public abstract class Laptop {
    protected String merek;
    protected int ram;

    abstract protected void nyalakan();
    abstract protected void bukaApp(String app);
    abstract protected void matikan();


}
