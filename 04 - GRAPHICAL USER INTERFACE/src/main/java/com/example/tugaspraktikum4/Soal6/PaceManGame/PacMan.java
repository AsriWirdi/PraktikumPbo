package com.example.tugaspraktikum4.Soal6.PaceManGame;

public class PacMan {
  private int x, y;
  private int dx, dy;

  public PacMan(int x, int y) {
    this.x = x;
    this.y = y;
    this.dx = 0;
    this.dy = 0;
  }

  public void setDirection(int dx, int dy) {
    this.dx = dx;
    this.dy = dy;
  }

  public void move() {
    x += dx;
    y += dy;
  }

  public int getX() { return x; }
  public int getY() { return y; }
}
