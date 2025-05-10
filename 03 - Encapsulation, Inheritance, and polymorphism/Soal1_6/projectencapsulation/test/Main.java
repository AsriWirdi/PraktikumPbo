import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Mahasiswa> mhs = new ArrayList<>();

    String[] namaMhs = {
        "Asri Wirdi", "Muhammad Iqwal", "Muh rifai", "Muhammad Pajri", "Muhammad Aydil", "Arjuna", "Ibnu", "Koiri",
        "Fahmi", "Daud", "Septian", "Nafis", "Aswar", "Irgi", "Jupri", "Yusnul", "Tiara", "Maryam", "Zahra", "Fatmawati"
    };

    String[] niMhs = {
        "D0224325", "D0224025", "D0224007", "D0224001", "D0224002", "D0224003", "D0224004", "D0224005", "D0224006",
        "D0224007", "D0224008", "D0224009", "D02240010", "D02240011", "D02240012", "D02240013", "D02240014",
        "D02240015", "D02240016", "D02240017"
    };

    // buat 20 objek simpan ke dalam arrry list
    for (int i = 0; i < 20; i++) {
      mhs.add(new Mahasiswa());
      mhs.get(i).setNim(niMhs[i]);
      mhs.get(i).setAlamat("Majene");
      mhs.get(i).setNama(namaMhs[i]);
    }

    // tampilkan info 20 objek dari array list
    for (Mahasiswa m : mhs) {
      System.out.println(m);
      System.out.println();
    }

  }
}