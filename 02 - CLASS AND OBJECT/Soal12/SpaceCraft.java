package Soal12;

// sistem kartesius (matematika)
/*   y ↑
     |
     |
     |
     |___________→ x
   (0,0)
*/

// up() -> y = y + 1
// down() -> y = y - 1


// sistem koordinat layar (Komputer/grafik)
// Di JavaFX (dan GUI pada umumnya), semakin besar nilai Y, objek semakin turun ke bawah layar.
/* (0,0) _____________→ x
       |
       |
       ↓
       y
*/
// up() -> y = y - 1
// down() -> y = y + 1

public class SpaceCraft {
  // untuk menyimpan nilai posisi x dan y
  private int xPos, yPos;

  // constructor untuk menentukan posisi awal
  public SpaceCraft(int xPos, int yPos) {
    this.xPos = xPos;
    this.yPos = yPos;
  }

  // Method untuk bergerak ke atas (y turun)
  public void up(){
    yPos = yPos - 1;
  }

  // method untuk bergerak ke bawah (y naik)
  public void down(){
    yPos = yPos + 1;
  }

  // method untuk bergerak ke kiri (x turun)
  public void left(){
    xPos = xPos - 1;
  }

  // method untuk bergerak ke kanan (x naik)
  public void right(){
    xPos = xPos + 1;
  }

  // method untuk info posisi saat ini
  public void infoPosisi(){
    System.out.println("xPos: " + xPos + " yPos: " + yPos);
  }
}
