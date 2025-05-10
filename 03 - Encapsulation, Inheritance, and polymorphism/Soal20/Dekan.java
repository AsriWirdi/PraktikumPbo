package Soal20;

public class Dekan extends Manusia{
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    
    @Override
    public String getNama(){
        return nama;
    }

    @Override
    public String getJenisKelamin(){
        return jenisKelamin;
    }

}
