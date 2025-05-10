package Soal1;

// 7. Soal1.Pegawai
class Pegawai {
  // States
  String nama, jabatan;
  int gaji;

  Pegawai(String nama, String jabatan) {
    this.nama = nama;
    this.jabatan = jabatan;
  }

  // Behaviors
  void kerja() {
    System.out.println(nama + " sedang bekerja...");
  }

  void TerimaGaji(int gaji) {
    this.gaji = gaji;
    System.out.println(nama + " Menerima Gaji Rp." + gaji);
  }
}
