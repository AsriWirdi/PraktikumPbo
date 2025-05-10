package Soal11;

public class Main {
  public static void main(String[] args) {
    // Data dummy RGB 3x3 (data sembarang)
    int[][][] dummyRGB = {
            {{255, 0, 0}, {0, 255, 0}, {0, 0, 255}},
            {{225, 255, 0}, {0, 225, 255}, {255, 0, 255}},
            {{128, 128, 128}, {64, 64, 64}, {192, 192, 192}},
    };

    ImageProcessing img = new ImageProcessing(dummyRGB);

    System.out.println("RGB Image");
    System.out.println(img);

    int[][] gray = img.imgToGray();
    System.out.println("Grayscale Image");
    for (int[] baris : gray) {
      for (int pixel : baris) {
        System.out.print(pixel + "\t");
      }
      System.out.println();
    }
  }
}
