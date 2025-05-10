package Soal1;

// 4. Soal1.Mahasiswa
class Mahasiswa {
  // States
  String nama, jurusan;
  final String NIM;

  Mahasiswa(String nama, String NIM, String jurusan) {
    this.nama = nama;
    this.NIM = NIM;
    this.jurusan = jurusan;
  }

  // Behaviors
  void belajar() {
    System.out.println(nama + "Sedang Belajar");
  }

  void absen() {
    System.out.println(nama + "Sedang Absen");
  }

  void ujian() {
    System.out.println(nama + "Sedang Ujian");
  }
}
