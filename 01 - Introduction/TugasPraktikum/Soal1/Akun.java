package Soal1;

// 9. Soal1.Akun
class Akun {
  // States
  String akun, username, password;

  Akun(String akun, String username, String password) {
    this.akun = akun;
    this.username = username;
    this.password = password;
  }

  // Behaviors
  void login(String password) {
    if (password.equals(this.password)) {
      System.out.println("Login ke akun " + akun + "...");
    } else {
      System.out.println("anda salah memasukkan password, silahkan coba lagi");
    }
  }

  void logout() {
    System.out.println("Logout ke akun " + akun + "...");
  }

  void UbahPassword(String passwordBaru) {
    this.password = passwordBaru;
  }
}
