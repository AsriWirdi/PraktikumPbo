package Soal2;

import Soal1.Printer;

public class PrinterApp {
  public static void main(String[] args) {

    // Membuat 30 objek Printer
    Printer[] daftarPrinter = new Printer[30];

    String[][] dataPrinter = {
            {"Canon PIXMA G2010", "Dokumen Hitam Putih", "85"},
            {"Epson L3110", "Foto Warna", "70"},
            {"HP DeskJet 2336", "Dokumen Warna", "90"},
            {"Brother DCP-T420W", "Laporan", "65"},
            {"Canon PIXMA MG2570S", "Foto", "40"},
            {"Epson L121", "Invoice", "55"},
            {"HP Smart Tank 519", "Surat", "60"},
            {"Brother HL-L2321D", "Buku", "80"},
            {"Canon imageCLASS MF3010", "Dokumen Kantor", "50"},
            {"Epson EcoTank L3250", "Poster", "75"},
            {"HP LaserJet Pro M15w", "Slip Gaji", "35"},
            {"Canon PIXMA E410", "Kartu Nama", "65"},
            {"Brother MFC-T920DW", "Proposal", "78"},
            {"Epson L805", "Foto Berkualitas Tinggi", "45"},
            {"HP Ink Tank 315", "Kwitansi", "72"},
            {"Canon MAXIFY MB5170", "Formulir", "69"},
            {"Epson L5290", "Transkrip Nilai", "81"},
            {"HP LaserJet MFP M28w", "Nota", "48"},
            {"Brother HL-1210W", "E-Ticket", "66"},
            {"Canon SELPHY CP1300", "Foto Cetak Cepat", "39"},
            {"Epson WF-2851", "Flyer", "58"},
            {"HP ENVY 6075", "Majalah", "71"},
            {"Brother DCP-T310", "Surat Lamaran", "64"},
            {"Canon PIXMA TR4570S", "Laporan Proyek", "86"},
            {"Epson L6160", "Kartu Ucapan", "79"},
            {"HP DeskJet Ink Advantage 2776", "Surat Pribadi", "88"},
            {"Brother HL-2130", "Berita", "52"},
            {"Canon i-SENSYS MF643Cdw", "Brosur", "61"},
            {"Epson L360", "Sertifikat", "74"},
            {"HP Laser 107w", "Dokumen Rahasia", "33"}
    };

    for (int i = 0; i < 30; i++) {

      daftarPrinter[i] = new Printer(dataPrinter[i][0],Integer.parseInt(dataPrinter[i][2]));
      System.out.println((i + 1) + ". Printer: " + dataPrinter[i][0]);
      daftarPrinter[i].isiTinta();
      daftarPrinter[i].cetak(dataPrinter[i][1]);

      System.out.println();
    }
  }
}
