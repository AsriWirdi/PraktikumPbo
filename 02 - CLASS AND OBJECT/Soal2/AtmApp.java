package Soal2;

import Soal1.Atm;

import java.util.Random;

public class AtmApp {
  public static void main(String[] args) {
    // Membuat 30 objek Atm
    Atm[] daftarAtm = new Atm[30];

    // Daftar bank yang bisa dipilih secara acak
    Random rd = new Random();
    String[] bankList = {"BRI", "BSI", "MANDIRI", "BANKSULSELBAR", "BCA"};

    for (int i = 0; i < 30; i++) {
      // Memilih saldo, setor dan tarik secara acak
      String bankAcak = bankList[rd.nextInt(bankList.length)];
      int saldoAcak = rd.nextInt(10_000_000, 50_000_000);
      int setorAcak = rd.nextInt(1_000_000, 5_000_000);
      int tarikAcak = rd.nextInt(1_000_000, 5_000_000);

      daftarAtm[i] = new Atm(bankAcak, saldoAcak);
      System.out.println((i + 1) + ". Bank: " + bankAcak);
      daftarAtm[i].cekSaldo();
      daftarAtm[i].setorTunai(setorAcak);
      daftarAtm[i].tarikTunai(tarikAcak);
      daftarAtm[i].cekSaldo();

      System.out.println();
    }
  }
}
