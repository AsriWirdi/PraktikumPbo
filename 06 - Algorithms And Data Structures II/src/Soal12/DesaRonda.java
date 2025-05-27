package Soal12;

class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class DesaRonda {

  public static int findMeetingPlace(Point[] houseLocations, Point kakekHouse, int D) {
    int minTotalDistance = Integer.MAX_VALUE;
    int bestIndex = -1;

    for (int i = 0; i < houseLocations.length; i++) {
      Point candidate = houseLocations[i];

      // Hitung jarak dari si kakek ke kandidat tempat kumpul
      int distanceToKakek = manhattanDistance(candidate, kakekHouse);

      // Jika bolak-balik lebih dari D, skip kandidat ini
      if (distanceToKakek * 2 > D) {
        continue;
      }

      // Hitung total jarak dari kandidat ke semua rumah
      int totalDistance = 0;
      for (Point other : houseLocations) {
        totalDistance += manhattanDistance(candidate, other);
      }

      // Simpan kandidat dengan total jarak paling kecil
      if (totalDistance < minTotalDistance) {
        minTotalDistance = totalDistance;
        bestIndex = i;
      }
    }

    return bestIndex; // -1 jika tidak ada rumah yang cukup dekat untuk si kakek
  }

  // Fungsi untuk menghitung jarak Manhattan antara 2 titik
  private static int manhattanDistance(Point a, Point b) {
    return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
  }

  // Simulasi main
  public static void main(String[] args) {
    Point[] rumah = {
            new Point(0, 0),
            new Point(1, 3),
            new Point(2, 2),
            new Point(5, 1)
    };

    Point kakek = new Point(0, 0);
    int D = 8; // Si kakek hanya bisa jalan 4 unit sekali jalan (8 bolak-balik)

    int result = findMeetingPlace(rumah, kakek, D);
    if (result != -1) {
      System.out.println("Tempat kumpul terbaik di rumah ke-" + result +
              " (lokasi: " + rumah[result].x + "," + rumah[result].y + ")");
    } else {
      System.out.println("Tidak ada rumah yang cukup dekat untuk si kakek.");
    }
  }
}
