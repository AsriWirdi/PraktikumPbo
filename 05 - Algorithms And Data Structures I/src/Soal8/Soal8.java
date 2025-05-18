package Soal8;

import java.util.HashMap;

public class Soal8 {
  public static void main(String[] args) {
    HashMap<String,String> mhs = new HashMap<>();
    mhs.put("D0224325","ASRI WIRDI");
    mhs.put("D0224025","MUHAMMAD IQWAL");
    mhs.put("D0224007","MUH RIFAI");
    mhs.put("D0224022","TIARA RAMADHANI");
    mhs.put("D0224352","MUHAMMAD PAJRI");

    System.out.println(mhs.get("D0224352"));
  }
}
