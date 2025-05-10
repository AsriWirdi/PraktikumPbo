package Soal8dan9.Atm;

import Soal7.Atm;

public class BRI extends Atm {
  private int saldoBri;

  // constructor overloading
  public BRI(){

  }

  public BRI(String bank){
    this.bank = bank;

  }
  public BRI(String bank, int saldo) {
    this.bank = bank;
    this.saldo = saldo;
  }

  // method Overriding
  @Override
  public void cekSaldo() {
    System.out.println("Saldo Anda: Rp " + saldoBri);
  }

  @Override
  public void tarikTunai(int jumlah) {
    if (saldoBri >= jumlah) {
      saldoBri -= jumlah;
      System.out.println("Anda menarik Rp " + jumlah);
    } else {
      System.out.println("Saldo tidak cukup");
    }
  }

  @Override
  public void setorTunai(int jumlah) {
    saldoBri += jumlah;
    System.out.println("Anda menyetor Rp " + jumlah);
  }

  // getter
  int getSaldoBri() {
    return saldoBri;
  }

  // setter
  void setSaldoBri(int saldoBri) {
    this.saldoBri = saldoBri;
  }

}
