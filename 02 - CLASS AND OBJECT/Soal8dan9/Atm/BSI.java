package Soal8dan9.Atm;

import Soal7.Atm;

public class BSI extends Atm {
  private int saldoBsi;


  // constructor overloading
  public BSI() {

  }

  public BSI(String bank) {
    this.bank = bank;

  }

  public BSI(String bank, int saldo) {
    this.bank = bank;
    this.saldo = saldo;
  }

  // method Overriding
  @Override
  public void cekSaldo() {
    System.out.println("Saldo Anda: Rp " + saldoBsi);
  }

  @Override
  public void tarikTunai(int jumlah) {
    if (saldoBsi >= jumlah) {
      saldoBsi -= jumlah;
      System.out.println("Anda menarik Rp " + jumlah);
    } else {
      System.out.println("Saldo tidak cukup");
    }
  }

  @Override
  public void setorTunai(int jumlah) {
    saldoBsi += jumlah;
    System.out.println("Anda menyetor Rp " + jumlah);
  }

  // getter
  int getSaldoBsi() {
    return saldoBsi;
  }

  // setter
  void setSaldoBsi(int saldoBsi) {
    this.saldoBsi = saldoBsi;
  }

}
