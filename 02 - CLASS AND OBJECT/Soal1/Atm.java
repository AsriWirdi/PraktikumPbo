package Soal1;

public class Atm {
  // 10. Atm

  // Bagan
  /*+----------------------------+
    |            ATM             |
    +----------------------------+
    | - bank: String             |
    | - saldo: double            |
    +----------------------------+
    | +cekSaldo(): void          |
    | +tarikTunai(double): void  |
    | +setorTunai(double): void  |
    +----------------------------+
*/

  String bank;
  private int saldo;

  public Atm(String bank, int saldo) {
    this.bank = bank;
    this.saldo = saldo;
  }

  public void cekSaldo() {
    System.out.println("Saldo Anda: Rp " + saldo);
  }

  public void tarikTunai(int jumlah) {
    if (saldo >= jumlah) {
      saldo -= jumlah;
      System.out.println("Anda menarik Rp " + jumlah);
    } else {
      System.out.println("Saldo tidak cukup");
    }
  }

  public void setorTunai(int jumlah) {
    saldo += jumlah;
    System.out.println("Anda menyetor Rp " + jumlah);
  }
}
