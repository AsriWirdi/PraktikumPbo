package Soal9;

public class Peta {
  static int[][] peta = {
          {1, 1, 0, 0, 0},
          {0, 1, 0, 0, 1},
          {1, 0, 0, 1, 1},
          {0, 0, 0, 0, 0},
          {1, 0, 1, 0, 1}
  };

  static boolean[][] visited;
  static int baris, kolom;

  public static void main(String[] args) {
    baris = peta.length;
    kolom = peta[0].length;
    visited = new boolean[baris][kolom];

    int jumlahJalur = 0;

    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        if (peta[i][j] == 1 && !visited[i][j]) {
          dfs(i, j);
          jumlahJalur++;
        }
      }
    }

    System.out.println("Jumlah jalur yang dapat dilalui: " + jumlahJalur);
  }

  static void dfs(int x, int y) {
    if (y < 0 || x < 0 || y >= baris || x >= kolom || peta[x][y] == 0 || visited[x][y]) {
      return;
    }

    visited[x][y] = true;

    // Arah gerakan: atas, bawah, kiri, kanan
    dfs(x, y - 1); // atas
    dfs(x, y + 1); // bawah
    dfs(x - 1, y); // kiri
    dfs(x + 1, y); // kanan


  }
}
