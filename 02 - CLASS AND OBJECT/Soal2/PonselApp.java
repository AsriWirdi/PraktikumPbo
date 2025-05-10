package Soal2;

import Soal1.Ponsel;

public class PonselApp {
  public static void main(String[] args) {

    // Membuat 30 objek Ponsel
    Ponsel[] daftarPonsel = new Ponsel[30];

    String[][] dataHP = {
            {"Samsung", "081234567890", "Halo, apa kabar?"},
            {"Xiaomi", "082198765432", "Sudah makan belum?"},
            {"Oppo", "081345678901", "Jangan lupa meeting jam 10."},
            {"Vivo", "083812345678", "Selamat ulang tahun!"},
            {"Realme", "081223344556", "Sampai ketemu nanti sore."},
            {"Apple", "089912345678", "Tolong kirim filenya ya."},
            {"Huawei", "085612345678", "Saya sedang dalam perjalanan."},
            {"Infinix", "081777888999", "Besok libur kan?"},
            {"Asus", "082233445566", "Jangan lupa bawa laptop."},
            {"Lenovo", "083811223344", "Nanti kita zoom ya."},
            {"Nokia", "081899977766", "Saya sudah di lokasi."},
            {"Sony", "082344556677", "Ada kabar gembira nih!"},
            {"ZTE", "081334455667", "Malam ini jadi nonton?"},
            {"Google Pixel", "089933221100", "Besok ujian jam berapa?"},
            {"OnePlus", "081700800900", "Laporan sudah saya kirim."},
            {"Motorola", "083812345987", "Ada PR nggak hari ini?"},
            {"Sharp", "082345678912", "Tolong print dokumennya."},
            {"Meizu", "085677889900", "Ikut rapat online ya."},
            {"HTC", "081234123412", "Sore ini kita latihan."},
            {"LG", "089812348765", "Saya titip absen ya."},
            {"Coolpad", "081245678912", "Lagi di mana nih?"},
            {"Evercoss", "082134567891", "Paket sudah sampai."},
            {"Polytron", "081298765432", "Terima kasih banyak!"},
            {"Advan", "083845612378", "Cek email kamu ya."},
            {"Mito", "085611122233", "Tugas kelompok udah selesai."},
            {"Venera", "081212343434", "Saya izin hari ini."},
            {"Axioo", "082122233344", "Kita kumpul jam berapa?"},
            {"Microsoft Lumia", "081332211445", "Jangan lupa sarapan!"},
            {"Honor", "085633221122", "Lagi OTW ke sana."},
            {"Itel", "081900123456", "Boleh pinjam charger?"}
    };

    for (int i = 0; i < 30; i++) {

      daftarPonsel[i] = new Ponsel(dataHP[i][0]);
      System.out.println((i + 1) + ". SmartPhone: " + dataHP[i][0]);
      daftarPonsel[i].nyalakan();
      daftarPonsel[i].telepon(dataHP[i][1]);
      daftarPonsel[i].kirimPesan(dataHP[i][2]);
      daftarPonsel[i].matikan();

      System.out.println();
    }
  }
}
