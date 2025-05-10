package Soal2;

import Soal1.Headset;

import java.util.Random;


public class HeadsetApp {
  public static void main(String[] args) {
    Random rand = new Random();
    // Membuat 30 objek Headset
    Headset[] daftarHeadset = new Headset[30];

    String[] merekHeadset = {
            "Sony WH-1000XM5",
            "Bose QuietComfort 45",
            "Apple AirPods Max",
            "Sennheiser Momentum 4",
            "JBL Tune 760NC",
            "Anker Soundcore Life Q30",
            "Audio-Technica ATH-M50xBT",
            "Logitech G733",
            "Razer BlackShark V2",
            "SteelSeries Arctis Nova Pro",
            "HyperX Cloud II",
            "Corsair HS80 RGB",
            "Asus ROG Delta",
            "Samsung Galaxy Buds2 Pro",
            "Beats Studio3 Wireless",
            "Marshall Major IV",
            "Skullcandy Crusher Evo",
            "Shure AONIC 50",
            "Philips Fidelio X3",
            "Plantronics BackBeat Go 810",
            "AKG N700NC",
            "Turtle Beach Stealth 600 Gen 2",
            "Bang & Olufsen Beoplay HX",
            "Jabra Elite 85h",
            "Microsoft Surface Headphones 2",
            "Edifier W820NB",
            "Pioneer SE-MS7BT",
            "Bludio T7",
            "Mixcder E10",
            "TaoTronics SoundSurge 90"
    };

    for (int i = 0; i < 30; i++) {
      // volum acak
      int v = rand.nextInt(0,10);

      daftarHeadset[i] = new Headset(merekHeadset[i]);
      System.out.println((i + 1) + ". Headset: " + merekHeadset[i]);
      daftarHeadset[i].sambungkan();
      daftarHeadset[i].aturVolume(v);
      daftarHeadset[i].putuskan();

      System.out.println();
    }
  }
}
