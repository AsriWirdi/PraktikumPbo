public class PersegiPanjang extends BangunDatar implements Geometri {
  double panjag;
  double lebar;

  PersegiPanjang(double panjang, double lebar) {
    this.panjag = panjang;
    this.lebar = lebar;
  }

  @Override
  public void hitungKeliling() {
    this.keliling = panjag * lebar;
  }

  @Override
  public void hitungLuas() {
    this.luas = 0.5 * (panjag + lebar);

  }

  @Override
  public double getKeliling() {
    return keliling;
  }

  @Override
  public double getLuas() {
    return luas;
  }
}
