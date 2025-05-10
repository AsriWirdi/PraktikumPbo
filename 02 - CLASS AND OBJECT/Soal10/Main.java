package Soal10;
import Soal8dan9.Kendaraan.*;
import Soal7.*;
import Soal8dan9.Atm.*;
import Soal8dan9.Buah.*;
import Soal8dan9.Buku.*;
import Soal8dan9.Film.*;
import Soal8dan9.Hewan.*;
import Soal8dan9.Laptop.*;
import Soal8dan9.Mahasiswa.*;
import Soal8dan9.Pekerjaan.*;
import Soal8dan9.Smartphone.*;

public class Main {
  public static void main(String[] args) {

    // Atm
    Atm bri = new BRI();
    Atm bsi = new BSI();

    // Buah
    Buah durian = new Durian();
    Buah jeruk = new Jeruk();

    // Buku
    Buku dilan1990 = new Dilan1990();
    Buku laskarPelangi = new LaskarPelangi();

    // Film
    Film joker = new Joker();
    Film parasite = new Parasite();

    // Hewan
    Hewan anjing = new Anjing();
    Hewan kucing = new Kucing();

    // Kendaraan
    Kendaraan mobil = new Mobil();
    Kendaraan motor = new Motor();

    // Laptop
    Laptop asus = new Asus();
    Laptop lenovo = new Lenovo();

    // Mahasiswa
    Mahasiswa asriWirdi = new AsriWirdi();
    Mahasiswa raraOktaviana = new RaraOktaviana();

    // Pekerjaan
    Pekerjaan uiux = new UIUX();
    Pekerjaan webDeveloper = new WebDeveloper();

    // Smartphone
    Smartphone iphone = new Iphone();
    Smartphone samsung = new Samsung();
  }
}
