package Soal20;

public abstract class Manusia {
    String nama;
    String jenisKelamin;

    // method abstract
    protected abstract void setNama(String nama);
    protected abstract void setJenisKelamin(String jenisKelamin);
    protected abstract String getNama();
    protected abstract String getJenisKelamin();
}
