package Soal12;

public class Main {
  public static void main(String[] args) {
    SpaceCraft kotak = new SpaceCraft(0,0);

    kotak.infoPosisi();

    // gerakkan SpaceCraft
    kotak.up(); // y -1 -> (0, -1)
    kotak.right(); // x + 1 -> (1, -1)
    kotak.down(); // y + 1 -> (1, 0)

    kotak.infoPosisi();

  }
}
