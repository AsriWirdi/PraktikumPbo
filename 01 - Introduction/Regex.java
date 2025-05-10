import java.util.regex.*;

class Regex {
    public static void main(String[] args) {
        // 1. Regex angka saja
        String angka = "123456";
        System.out.println(angka.matches("\\d+"));
        // \\d = digit(0-9)
        // + = satu atau lebih digit

        // 2. Regex Huruf Saja
        String huruf = "BelajarRegex";
        System.out.println(huruf.matches("[a-zA-Z]+"));
        // [a-zA-Z] = huruf besar atau kecil.
        // + = satu atau lebih

        // 3. Regex Huruf & angka (alphanumerik)
        String text = "abcd123";
        System.out.println(text.matches("[a-zA-Z0-9]"));

        // 4. Regex spesifik Jumlah
        String kode = "1234";
        System.out.println(kode.matches("\\d{4}"));
        // \\d{4} = harus tepat 4 digit

        // 5. Regex Nomor HP Indonesia
        String hp = "085212521125";
        System.out.println(hp.matches("^08\\d{8,11}$"));
        // ^08 = harus diawali 08
        // \\d{8,11} = lalu 8-11 digit angka
        // $ = sampai akhir string

        // 6. Regex Nama lengkap (hanya huruf dan spasi)
        String nama = "Asri Wirdi";
        System.out.println(nama.matches("^[a-zA-Z]+$"));

        // Bonus : cek Awalan dan Akhiran
        // cek awalan :
        System.out.println("Halo Dunia".matches("^Halo.*"));
        // ^Halo = harus di awali "Halo"
        // .* = karakter bebas setelahnya

        // cek akhiran
        System.out.println("Belajar Java".matches(".*\\Java$"));
        // .* = bebas di depan
        // \\java$ = diakhiri dengan Java

        // MINI LATIHAN
        // 1. Buat regex untuk password minimal 8 karakter, berisi huruf dan angka
        String password = "IniPassword02";
        System.out.println(password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"));

        // 2. Validasi NIK Indonesia : 16 digit angka
        String nik = "76012300435123456";
        System.out.println(nik.matches("^\\d{16}"));

        // 3. Ambil semua angka dari kalimat seperti “Umur saya 23 dan adik saya 17”
        // buat pola regex untuk angka

        String kalimat = "Umur saya 23 dan adik saya 17";
        Pattern p = Pattern.compile("\\d+"); // cocokkan angka berturut turut
        // Matcher m = p.matcher(kalimat); // Matcher untuk mencocokkan dengan text

        // loop untuk menemukan semua angka
        // while (m.find()){
        // Menampilkan hasil angka yang ditemukan
        // System.out.println(m.group);
        // }

    }
}