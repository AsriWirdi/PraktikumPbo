package Soal11;

public class ImageProcessing {
  // fields
  int[][][] rgb;

  // constructor
  public ImageProcessing(int[][][] rgbImage) {
    this.rgb = rgbImage;
  }

  // Getter & setter
  public int[][][] getRgbImage() {
    return rgb;
  }

  public void setRgbImage(int[][][] rgbImage) {
    this.rgb = rgbImage;
  }

  // methods untuk konversi ke gray scale
  int[][] imgToGray() {
    int tinggi = rgb.length;
    int lebar = rgb[0].length;

    int[][] grayImage = new int[tinggi][lebar];
    for (int i = 0; i < tinggi; i++) {
      for (int j = 0; j < lebar; j++) {
        int r = rgb[i][j][0];
        int g = rgb[i][j][1];
        int b = rgb[i][j][2];

        int gray = (int) (0.299 * r + 0.587 * g + 0.114 * b);
        grayImage[i][j] = gray;
      }
    }
    return grayImage;
  }

  // toString untuk menampilkan RGB
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int[][] row : rgb) {
      for (int[] pixel : row) {
        sb.append("(")
                .append(pixel[0]).append(",")
                .append(pixel[1]).append(",")
                .append(pixel[2]).append(") ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  // getter

  // setter
}
