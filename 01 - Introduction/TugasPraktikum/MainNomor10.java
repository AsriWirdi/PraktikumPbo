public class MainNomor10 {
  /*
  * Buatlah sebuah class Main kemudian di dalam method main( ) di kelas
    tersebut buatlah penggunaan operasi-operasi String: charAt(int index),
    compareTo(), compareToIgnoreCase(), concat(), contains(),
    copyValueOf(), equals(), equalsIgnoreCase(), format(), hashCode(),
    indexOf(), isBlank(), length(), lines(), matches(), repeat(), replace(),
    replaceAll(), replaceFirst(), split(), substring(int beginIndex), substring(int
    beginIndex, int endIndex), toCharArray(), toLowerCase(), toString(),
    toUpperCase(), trim(), valueOf(). Beri penjelasan untuk penggunaan
    masing-masing method, jika terdapat lebih dari satu varian parameter,
    maka buat semua variannya. Misalnya untuk method valueOf( ) ada
    valueOf(double d), valueOf(long l), dll. Maka gunakan semua method
    valueOf( ) tersebut.
  * */

  // Huruf	ASCII
  //A	65
  //B	66
  //C	67
  //D	68
  //E	69
  //F	70
  //G	71
  //H	72
  //I	73
  //J	74
  //K	75
  //L	76
  //M	77
  //N	78
  //O	79
  //P	80
  //Q	81
  //R	82
  //S	83
  //T	84
  //U	85
  //V	86
  //W	87
  //X	88
  //Y	89
  //Z	90
  //91	[
  //92	\
  //93	]
  //94	^
  //95	_
  //96	`
  //a	97
  //b	98
  //c	99
  //d	100
  //e	101
  //f	102
  //g	103
  //h	104
  //i	105
  //j	106
  //k	107
  //l	108
  //m	109
  //n	110
  //o	111
  //p	112
  //q	113
  //r	114
  //s	115
  //t	116
  //u	117
  //v	118
  //w	119
  //x	120
  //y	121
  //z	122

  // A. Akses & Informasi Karakter
  //
  // charAt(int index)
  //Mengambil karakter di posisi tertentu (indeks dimulai dari 0).
  //→ contoh: "Hello".charAt(1) → 'e'
  //
  // length()
  // Mengembalikan panjang (jumlah karakter) string.
  //→ contoh: "Hello".length() → 5
  //
  // toCharArray()
  // Mengubah String menjadi array of char.
  //→ contoh: "Hi".toCharArray() → ['H', 'i']
  //
  // B. Perbandingan String
  //
  // equals(String)
  // Membandingkan dua String secara case-sensitive.
  //→ contoh: "abc".equals("ABC") → false
  //
  // equalsIgnoreCase(String)
  //Seperti equals, tapi abaikan huruf besar kecil.
  //→ contoh: "abc".equalsIgnoreCase("ABC") → true
  //
  // compareTo(String)
  // Bandingkan dua String berdasarkan urutan Unicode.
  //→ contoh: "abc".compareTo("abd") → -1
  //
  // compareToIgnoreCase(String)
  // Seperti compareTo, tapi abaikan kapitalisasi.
  //
  // C. Pencarian & Pengujian
  // contains(CharSequence)
  // Cek apakah substring ada di dalam string.
  //→ contoh: "Hello".contains("ll") → true
  //
  // indexOf(char/String)
  // Mengembalikan indeks pertama dari karakter/substring.
  //→ contoh: "abcabc".indexOf("b") → 1
  //
  //matches(String regex)
  //Cek apakah string cocok dengan pola regex.
  //→ contoh: "abc123".matches("\w+") → true
  //
  //isBlank() (Java 11+)
  //Cek apakah string kosong atau hanya berisi spasi.
  //
  // D. Manipulasi Konten String
  //
  //concat(String)
  //Menggabungkan string.
  //→ contoh: "Hello".concat(" World") → "Hello World"
  //
  //replace(old, new)
  //Ganti semua kemunculan karakter lama ke karakter baru.
  //
  //replaceAll(regex, new)
  //Ganti semua sesuai regex.
  //
  //replaceFirst(regex, new)
  //Ganti hanya kemunculan pertama yang cocok.
  //
  //substring(begin)
  //Ambil substring dari posisi begin hingga akhir.
  //
  //substring(begin, end)
  //Ambil substring dari begin (inklusif) sampai end (eksklusif).
  //
  //split(regex)
  //Memecah string menjadi array berdasarkan delimiter.
  //
  //repeat(n) (Java 11+)
  //Mengulang string sebanyak n kali.
  //→ "abc".repeat(3) → "abcabcabc"
  //
  // E. Transformasi dan Utility
  //
  //toLowerCase(), toUpperCase()
  //Mengubah seluruh huruf menjadi kecil/besar.
  //
  //trim()
  //Menghapus spasi awal dan akhir string.
  //
  //toString()
  //Mengembalikan string itu sendiri. Biasanya dipakai untuk override.
  //
  //format(String format, Object... args)
  //Format string seperti printf di C.
  //→ String.format("%s-%d", "abc", 10) → "abc-10"
  //
  //copyValueOf(char[])
  //Membuat string baru dari array karakter.
  //
  //valueOf(any type)
  //Mengubah berbagai tipe data (int, boolean, char, dll) jadi string.
  //
  //lines() (Java 11+)
  //Mengembalikan Stream<String> dari setiap baris dalam string.
  //
  //hashCode()
  //Menghasilkan nilai hash untuk string (berguna di struktur data seperti HashMap).



  public static void main(String[] args) {
    String str1 = "Pemrograman Java";
    String str2 = "pemrograman java";
    String str3 = "  ";
    String str4 = "Halo\nSelamat\nDatang";

    // chartAt()
    // Mengambil karakter di indeks tertentu
    System.out.println("charAt(2): " + str1.charAt(2)); // Mengambil karakter pada indeks ke-2 (huruf ke-3), yaitu 'r'.

    // compareTo()
    // Membandingkan dua string (case-sensitive)
    // - compareTo() membandingkan dua string secara leksikografis (berdasarkan urutan karakter Unicode).
    // - Perbandingan ini bersifat case-sensitive (huruf besar ≠ huruf kecil)
    // - "P" (huruf pertama dari str1) memiliki kode Unicode 80, sedangkan "p" (huruf pertama dari str2) memiliki kode Unicode 112.
    // - Karena 80 - 112 = -32, maka str1.compareTo(str2) akan menghasilkan nilai negatif, tepatnya -32.

    System.out.println("compareTo(): " + str1.compareTo(str2));

    // compareToIgnoreCase()
    // Sama tapi abaikan huruf besar/kecil
    // - compareToIgnoreCase() adalah metode dari kelas String di Java yang membandingkan dua string dengan mengabaikan perbedaan huruf besar dan kecil (case-insensitive).
    // - Metode ini mengembalikan:
    //    0 jika kedua string sama (tanpa memperhatikan huruf besar/kecil),
    //    < 0 jika str1 secara leksikografis lebih kecil dari str2,
    //    0 jika str1 secara leksikografis lebih besar dari str2.
    // - Dalam kasus di atas:
    //str1 = "Pemrograman Java"
    //str2 = "pemrograman java"
    //Kalau dibandingan tanpa mempedulikan huruf besar kecil, isi string-nya sama persis, jadi:
    //
    // str1.compareToIgnoreCase(str2) menghasilkan 0.
    System.out.println("compareToIgnorCase(): " + str1.compareToIgnoreCase(str2));

    // concat()
    // Menggabungkan string

    System.out.println("concat(): " + str1.concat(" OOP")); // Gabungkan string " OOP" ke str1.

    // contains()
    // Mengecek apakah string mengandung substring
    System.out.println("contains(): " + str1.contains("Java")); // Cek apakah str1 mengandung kata "Java" (true/false).

    // copyValueOf(){
    // Buat String dari array karakter
    char[] chars = {'J', 'a', 'v', 'a'};
    System.out.println("copyValueOf(): " + String.copyValueOf(chars));
    System.out.println("copyValueOf(offset, count): " + String.copyValueOf(chars, 1, 2));
    // Mengubah array chars menjadi string.
    // offset = 1, count = 2 berarti ambil 2 huruf mulai dari indeks ke-1 → "av"


    // equals()
    // Cek apakah dua string identik
    System.out.println("equals(): " + str1.equals(str2));

    // equalsIgnoreCase()
    // Cek identik, abaikan huruf besar/kecil
    System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

    // format()
    // Format string seperti printf
    String formatted = String.format("Nama: %s, Umur: %d", "Asri Wirdi", 19);
    System.out.println("format(): " + formatted);
    // Seperti printf, tetapi hasilnya dikembalikan sebagai string. %s = string, %d = angka.

    // hashCode()
    // Mengembalikan hash code dari string
    System.out.println("hashCode(): " + str1.hashCode()); // Mengembalikan nilai hash (kode unik) dari string.

    // indexOf()
    // Posisi pertama karakter/substring
    System.out.println("indexOf('J'): " + str1.indexOf('J')); // Posisi karakter 'J' pertama kali ditemukan
    System.out.println("indexOf('a',3): " + str1.indexOf('a',3)); // indexOf('a', 3) → mulai pencarian dari indeks ke-3

    // isBlank()
    // True jika kosong atau hanya whitespace
    System.out.println("isBlank(): " + str3.isBlank()); // true karena hanya spasi
    // isBlank() → true jika string kosong atau hanya spasi

    // length()
    // Panjang string
    System.out.println("length(): " + str1.length());

    // lines()
    // 	Pecah string berdasarkan baris (\n)
    System.out.println("Lines(): ");
    str4.lines().forEach(System.out::println); // Pecah string menjadi baris (berdasarkan \n) dan cetak per baris. cetak baris satu-satu

    // matches()
    // Cocokkan dengan pola regex
    System.out.println("matches(\".*Java\"): " + str1.matches(".*Java")); // regex
    // Cocokkan string dengan pola (regex). .*Java artinya string diakhiri dengan "Java".
    // .* : tanda titik(.) cocok dengan karakter apapun, dan tanda bintang(*) menunjukkan bahwa karakter tersebut bisa muncul sebanyak mungkin (termasuk nol kali)

    // repeat()
    // Mengulang string beberapa kali
    System.out.println("repeat(): " + "INFORMATIKA ".repeat(3)); // Mengulang string "Hi " sebanyak 3 kali.
    // kalau countnya 0, outputnya tidak ada (String kosong)
    // kalau countnya <0 akan menghasilkan IllegalArgumentException

    // replace()
    // Ganti karakter/substring
    // bersifat case sensitive
    System.out.println("replace(): " + str1.replace("Java","Python"));

    // replaceAll()
    // Ganti semua berdasarkan regex
    System.out.println("replaceAll(): " + str1.replaceAll("[a-z]","@"));

    // replaceFirst()
    // Ganti hanya yang pertama berdasarkan regex
    System.out.println("replaceFirst(): " + str1.replaceFirst("a","@"));

    // split()
    // Memisahkan string berdasarkan regex
    String[] kata = str1.split(" ");
    System.out.println("split(): ");
    for(String k : kata){
      System.out.println(k);
    }
    // Pecah string jadi array berdasarkan spasi. Cetak satu per satu.

    // substring()
    // Ambil bagian tertentu dari string
    System.out.println("substring(5): " + str1.substring(5)); // substring(5) → dari indeks ke-5 sampai akhir
    System.out.println("substring(0,4): " + str1.substring(0,4)); // substring(0, 4) → dari 0 sampai sebelum 4

    // toCharArray()
    // Mengubah ke array karakter
    char[] arrChar = str1.toCharArray();
    System.out.println("toCharArray(): ");
    for(char c : arrChar){
      System.out.print(c + " "); // menampilkan semua nilai char array
    }
    System.out.println();
    // Ubah string jadi array karakter, lalu cetak satu-satu.

    // toLowerCase()
    // Ke huruf kecil semua
    System.out.println("toLowerCase(): " + str1.toLowerCase());

    // toUpperCase()
    // Ke huruf besar semua
    System.out.println("toUpperCase(): " + str1.toUpperCase());

    // toString()
    //  Menampilkan informasi objek dalam bentuk string yang mudah dibaca
    // Digunakan otomatis saat objek dicetak dengan System.out.println().
    // Kembalikan representasi string (biasanya sama)

    // int i = 100;
    // String s = Integer.toString(i); // outputnya: 100(String)
    System.out.println("toString(): " + str1.toString());

    // trim()
    // Menghapus spasi di awal/akhir
    String str5 = " Halo  ";
    System.out.println("trim(): " + str5.trim() + "'"); // Hapus spasi di awal dan akhir string.

    //valueOf()
    // 	Mengubah berbagai tipe ke string
    int num = 42;
    double pi = 3.14;
    boolean bool = true;
    char ch = 'X';
    Object obj = new Object();
    System.out.println("valueOf(int): " + String.valueOf(num));
    System.out.println("valueOf(double): " + String.valueOf(pi));
    System.out.println("valueOf(boolean): " + String.valueOf(bool));
    System.out.println("valueOf(char): " + String.valueOf(ch));
    System.out.println("valueOf(Object): " + String.valueOf(obj));
    System.out.println("valueOf(char[]): " + String.valueOf(chars));
    System.out.println("valueOf(char[], offset, count): " + String.valueOf(chars,1,2));
    // angka, boolean, char, object → menjadi String
    // array karakter juga bisa


  }
}
