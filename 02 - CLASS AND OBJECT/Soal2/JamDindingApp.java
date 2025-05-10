package Soal2;

import Soal1.JamDinding;

public class JamDindingApp {
  public static void main(String[] args) {

    // Membuat 30 objek JamDinding
    JamDinding[] daftarJamDinding = new JamDinding[30];

    String[] merekJamDinding = {
            "Seiko",
            "Casio",
            "Citizen",
            "Rhythm",
            "Quartz",
            "Adzan Clock",
            "Skmei",
            "Seagull",
            "Lemnos",
            "Ajanta",
            "Omega",
            "Rolex",
            "Swiza",
            "Mito",
            "Advance",
            "Panasonic",
            "Doxa",
            "Timex",
            "Jago",
            "Sevilla",
            "Timezone",
            "Tomori",
            "Eiger",
            "Galaxy",
            "Hario",
            "Lacoste",
            "Kenko",
            "Namco",
            "Maspion",
            "A-One"
    };


    for (int i = 0; i < 30; i++) {

      daftarJamDinding[i] = new JamDinding(merekJamDinding[i]);
      System.out.println((i + 1) + ". Jam Dinding: " + merekJamDinding[i]);
      daftarJamDinding[i].nyalakan();
      daftarJamDinding[i].matikan();

      System.out.println();
    }
  }
}
