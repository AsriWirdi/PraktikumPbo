
public class Mahasiswa extends Manusia {
    // fields
    private String nim;

    // getter
    public String getNama() {
        return super.getNama();
    }

    public String getAlamat() {
        return super.getAlamat();
    }

    public String getNim() {
        return nim;
    }

    // setter
    public void setNama(String nama) {
        super.setNama(nama);
    }

    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        String info = "Nama: " + nama + "\nNim: " + nim + "\nAlamat: " + alamat;
        return info;
    }

}
