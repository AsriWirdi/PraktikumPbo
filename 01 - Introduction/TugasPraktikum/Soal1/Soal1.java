package Soal1;

public class Soal1 {
  public static void main(String[] args) {
    /*
     * SOAL
     * Pilih 10 object di dunia nyata, lakukan identifikasi states dan behaviors
     * dari objects tersebut. Lalu buatlah class untuk masing-masing object
     * tersebut.
     * Kemudian buat sebuah class Main (class yang dilengkapi dengan method
     * main() dan dari method main tersebut buat minimal 10 object (instan
     * class) dari masing-masing class yang telah dibuat serta panggil method
     * method yang tersedia di dalamnya.
     */

    // 1. Soal1.Mobil
    // A. Toyota Avanza
    Mobil toyotaAvanza = new Mobil("Toyota Avanza", "Hitam");
    toyotaAvanza.gas();
    toyotaAvanza.ngerem();
    toyotaAvanza.berhenti();

    // B. Toyota Innova
    Mobil toyotaInnova = new Mobil("Toyota Innova", "Putih");
    toyotaInnova.gas();
    toyotaInnova.ngerem();
    toyotaInnova.berhenti();

    // C. Toyota Fortuner
    Mobil toyotaFortuner = new Mobil("Toyota Fortuner", "Hitam");
    toyotaFortuner.gas();
    toyotaFortuner.ngerem();
    toyotaFortuner.berhenti();

    // D. Toyota Alphard
    Mobil toyotaAlphard = new Mobil("Toyota Alphard", "Putih");
    toyotaAlphard.gas();
    toyotaAlphard.ngerem();
    toyotaAlphard.berhenti();

    // E. Toyota Vios
    Mobil toyotaVios = new Mobil("Toyota Vios", "Hitam");
    toyotaVios.gas();
    toyotaVios.ngerem();
    toyotaVios.berhenti();

    // F. Toyota Yaris
    Mobil toyotaYaris = new Mobil("Toyota Yaris", "Putih");
    toyotaYaris.gas();
    toyotaYaris.ngerem();
    toyotaYaris.berhenti();

    // G. Toyota Camry
    Mobil toyotaCamry = new Mobil("Toyota Camry", "Hitam");
    toyotaCamry.gas();
    toyotaCamry.ngerem();
    toyotaCamry.berhenti();

    // H. Toyota CorollaAltis
    Mobil toyotaCorollaAltis = new Mobil("Toyota Corolla Altis", "Putih");
    toyotaCorollaAltis.gas();
    toyotaCorollaAltis.ngerem();
    toyotaCorollaAltis.berhenti();

    // I. Toyota Rush
    Mobil toyotaRush = new Mobil("Toyota Rush", "Hitam");
    toyotaRush.gas();
    toyotaRush.ngerem();
    toyotaRush.berhenti();

    // J. Toyota Hilux
    Mobil toyotaHilux = new Mobil("Toyota Hilux", "Putih");
    toyotaHilux.gas();
    toyotaHilux.ngerem();
    toyotaHilux.berhenti();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------------------

    // 2. Soal1.Laptop
    // A. Lenovo ThinkPad X1 Carbon
    Laptop lenovoThinkPadX1Carbon = new Laptop("Lenovo ThinkPad X1 Carbon", 16);
    lenovoThinkPadX1Carbon.menyalakan();
    lenovoThinkPadX1Carbon.bukaApp("Vs Code");
    lenovoThinkPadX1Carbon.mematikan();

    // B. Lenovo ThinkPad T14
    Laptop lenovoThinkPadT14 = new Laptop("Lenovo ThinkPad T14", 16);
    lenovoThinkPadT14.menyalakan();
    lenovoThinkPadT14.bukaApp("Vs Code");
    lenovoThinkPadT14.mematikan();

    // C. Lenovo ThinkBook 14
    Laptop lenovoThinkBook14 = new Laptop("Lenovo ThinkBook 14", 16);
    lenovoThinkBook14.menyalakan();
    lenovoThinkBook14.bukaApp("Vs Code");
    lenovoThinkBook14.mematikan();

    // D. Lenovo ideaPad Slim 3
    Laptop lenovoIdeapadSlim3 = new Laptop("Lenovo ideaPad Slim 3", 16);
    lenovoIdeapadSlim3.menyalakan();
    lenovoIdeapadSlim3.bukaApp("Vs Code");
    lenovoIdeapadSlim3.mematikan();

    // E. Lenovo IdeaPad Flex 5
    Laptop lenovoIdeaPadFlex5 = new Laptop("Lenovo IdeaPad Flex 5", 16);
    lenovoIdeaPadFlex5.menyalakan();
    lenovoIdeaPadFlex5.bukaApp("Vs Code");
    lenovoIdeaPadFlex5.mematikan();

    // F. Lenovo Yoga 7i
    Laptop lenovoYoga7i = new Laptop("Lenovo Yoga 7i", 16);
    lenovoYoga7i.menyalakan();
    lenovoYoga7i.bukaApp("Vs Code");
    lenovoYoga7i.mematikan();

    // G. Lenovo Legion 5
    Laptop lenovoLegion5 = new Laptop("Lenovo Legion 5", 16);
    lenovoLegion5.menyalakan();
    lenovoLegion5.bukaApp("Vs Code");
    lenovoLegion5.mematikan();

    // H. Lenovo Legion 7
    Laptop lenovoLegion7 = new Laptop("Lenovo Legion 7", 16);
    lenovoLegion7.menyalakan();
    lenovoLegion7.bukaApp("Vs Code");
    lenovoLegion7.mematikan();

    // I. Lenovo LOQ 15
    Laptop lenovoLOQ15 = new Laptop("Lenovo LOQ 15", 16);
    lenovoLOQ15.menyalakan();
    lenovoLOQ15.bukaApp("Vs Code");
    lenovoLOQ15.mematikan();

    // J. Lenovo Yoga Slim 7
    Laptop lenovoYogaSlim7 = new Laptop("Lenovo Yoga Slim 7", 16);
    lenovoYogaSlim7.menyalakan();
    lenovoYogaSlim7.bukaApp("Vs Code");
    lenovoYogaSlim7.mematikan();

    // -----------------------------------------------------------------------------------------------------------------

    // 3. Soal1.Buku
    // A. Laskar Pelangi
    Buku laskarPelangi = new Buku("Laskar Pelangi", "Andrea Hirata", 529);
    laskarPelangi.bukaHalaman(123);
    laskarPelangi.baca();
    laskarPelangi.tutupBuku();

    // B. Bumi
    Buku bumi = new Buku("Bumi", "Tere Liye", 440);
    bumi.bukaHalaman(145);
    bumi.baca();
    bumi.tutupBuku();

    // C. Negri 5 Menara
    Buku negri5Menara = new Buku("Negri 5 Menara", "Ahmad Faudi", 424);
    negri5Menara.bukaHalaman(57);
    negri5Menara.baca();
    negri5Menara.tutupBuku();

    // D. Perahu Kertas
    Buku perahuKertas = new Buku("Perahu Kertas", "Dee Lestari", 444);
    perahuKertas.bukaHalaman(23);
    perahuKertas.baca();
    perahuKertas.tutupBuku();

    // E. Ayat-ayat Cinta
    Buku ayatAyatCinta = new Buku("Ayat-ayat Cinta", "Habiburrahman EL Shirazy", 418);
    ayatAyatCinta.bukaHalaman(75);
    ayatAyatCinta.baca();
    ayatAyatCinta.tutupBuku();

    // F. Critical Eleven
    Buku criticalEleven = new Buku("Critical Eleven", "Ika Natassa", 344);
    criticalEleven.bukaHalaman(123);
    criticalEleven.baca();
    criticalEleven.tutupBuku();

    // G. Pulang
    Buku pulang = new Buku("Pulang", "Leila S.Chudori", 464);
    pulang.bukaHalaman(123);
    pulang.baca();
    pulang.tutupBuku();

    // H. Cantik Itu Luka
    Buku cantikItuLuka = new Buku("Cantik Itu Luka", "Eka Kurniawan", 523);
    cantikItuLuka.bukaHalaman(55);
    cantikItuLuka.baca();
    cantikItuLuka.tutupBuku();

    // I. Dilan : Dia adalah Dilanku Tahun 1990
    Buku dilan = new Buku("Dilan : Dia adalah Dilanku Tahun 1990", "Pidi Baiq", 332);
    dilan.bukaHalaman(123);
    dilan.baca();
    dilan.tutupBuku();

    // J. Ronggeng Dukuh Paruk
    Buku ronggeng = new Buku("Ronggeng Dukuh Paruk", "Ahmad Tohari", 278);
    ronggeng.bukaHalaman(13);
    ronggeng.baca();
    ronggeng.tutupBuku();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------------------

    // 4. Soal1.Mahasiswa
    // A. Andi Pratama
    Mahasiswa andiPratama = new Mahasiswa("Andi Pratama", "D0224100", "Informatika");
    andiPratama.absen();
    andiPratama.belajar();
    andiPratama.ujian();

    // B. Siti Nurhaliza
    Mahasiswa sitiNurhaliza = new Mahasiswa("Siti Nurhaliza", "D0224101", "Informatika");
    sitiNurhaliza.absen();
    sitiNurhaliza.belajar();
    sitiNurhaliza.ujian();

    // C. Rizky Maulana
    Mahasiswa rizkyMaulana = new Mahasiswa("Rizky Maulana", "D0224102", "Informatika");
    rizkyMaulana.absen();
    rizkyMaulana.belajar();
    rizkyMaulana.ujian();

    // D. Putri Ayu Lestari
    Mahasiswa putriAyuLestari = new Mahasiswa("Putri Ayu Lestari", "D0224103", "Informatika");
    putriAyuLestari.absen();
    putriAyuLestari.belajar();
    putriAyuLestari.ujian();

    // E. Fajar Nugroho
    Mahasiswa fajarNugroho = new Mahasiswa("Fajar Nugroho", "D0224104", "Informatika");
    fajarNugroho.absen();
    fajarNugroho.belajar();
    fajarNugroho.ujian();

    // F. Dewi Anggraini
    Mahasiswa dewiAnggraini = new Mahasiswa("Dewi Anggraini", "D0224105", "Informatika");
    dewiAnggraini.absen();
    dewiAnggraini.belajar();
    dewiAnggraini.ujian();

    // G. Budi Santoso
    Mahasiswa budiSantoso = new Mahasiswa("Budi Santoso", "D0224106", "Informatika");
    budiSantoso.absen();
    budiSantoso.belajar();
    budiSantoso.ujian();

    // H. Melati Wulandari
    Mahasiswa melatiWulandari = new Mahasiswa("Melati Wulandari", "D0224107", "Informatika");
    melatiWulandari.absen();
    melatiWulandari.belajar();
    melatiWulandari.ujian();

    // I. Agus Haryanto
    Mahasiswa agusHaryanto = new Mahasiswa("Agus Haryanto", "D0224108", "Informatika");
    agusHaryanto.absen();
    agusHaryanto.belajar();
    agusHaryanto.ujian();

    // J. Nina Kartika
    Mahasiswa ninaKartika = new Mahasiswa("Nina Kartika", "D0224109", "Informatika");
    ninaKartika.absen();
    ninaKartika.belajar();
    ninaKartika.ujian();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------------------

    // 5. Soal1.Hewan
    // A. Anjing
    Hewan anjing = new Hewan("Anjing", "Guk guk");
    anjing.makan();
    anjing.bersuara();
    anjing.tidur();

    // B. Kucing
    Hewan kucing = new Hewan("Kucing", "Meong");
    kucing.makan();
    kucing.bersuara();
    kucing.tidur();

    // C. Ayam
    Hewan ayam = new Hewan("Ayam", "Kukuruyuk");
    ayam.makan();
    ayam.bersuara();
    ayam.tidur();

    // D. Sapi
    Hewan sapi = new Hewan("Sapi", "Moo");
    sapi.makan();
    sapi.bersuara();
    sapi.tidur();

    // E. Domba
    Hewan domba = new Hewan("Domba", "Mbeek");
    domba.makan();
    domba.bersuara();
    domba.tidur();

    // F. Gajah
    Hewan gajah = new Hewan("Gajah", "Prrrraaaooo");
    gajah.makan();
    gajah.bersuara();
    gajah.tidur();

    // G. Bebek
    Hewan Bebek = new Hewan("Bebek", "Kwek kwek");
    Bebek.makan();
    Bebek.bersuara();
    Bebek.tidur();

    // H. Kuda
    Hewan kuda = new Hewan("Kuda", "Neigh");
    kuda.makan();
    kuda.bersuara();
    kuda.tidur();

    // I. Singa
    Hewan singa = new Hewan("Singa", "Roar");
    singa.makan();
    singa.bersuara();
    singa.tidur();

    // J. Monyet
    Hewan monyet = new Hewan("Monyet", "Ooh ooh aah aah");
    monyet.makan();
    monyet.bersuara();
    monyet.tidur();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------------------

    // 6. Soal1.Game
    // A. Mobile Legends: Bang Bang
    Game mlbb = new Game("Mobile Legends: Bang Bang", 4.1);
    mlbb.memulaiGame();
    mlbb.keluarGame();

    // B. Minecraft (Pocket Edition)
    Game minecraft = new Game("Minecraft (Pocket Edition)", 4.6);
    minecraft.memulaiGame();
    minecraft.keluarGame();

    // C. PUBG Mobile
    Game pubg = new Game("PUBG Mobile", 4.3);
    pubg.memulaiGame();
    pubg.keluarGame();

    // D. Asphalt 9: Legends
    Game asphalt9Legends = new Game(" Asphalt 9: Legends", 4.5);
    asphalt9Legends.memulaiGame();
    asphalt9Legends.keluarGame();

    // E. Clash Royale
    Game clashRoyale = new Game(" Clash Royale", 4.2);
    clashRoyale.memulaiGame();
    clashRoyale.keluarGame();

    // F. Genshin Impact
    Game genshinImpact = new Game(" Genshin Impact", 4.3);
    genshinImpact.memulaiGame();
    genshinImpact.keluarGame();

    // G. Free Fire
    Game epep = new Game("Free Fire", 4.1);
    epep.memulaiGame();
    epep.keluarGame();

    // H. Brain Out
    Game brainOut = new Game("Brain Out", 4.5);
    brainOut.memulaiGame();
    brainOut.keluarGame();

    // I. Hay Day
    Game hayDay = new Game("Hay Day", 4.4);
    hayDay.memulaiGame();
    hayDay.keluarGame();

    // J. Roblox
    Game roblox = new Game("Roblox", 4.4);
    roblox.memulaiGame();
    roblox.keluarGame();
    System.out.println();

    // ------------------------------------------------------------------------------------------------------------------

    // 7. Soal1.Pegawai
    // A. Andi
    Pegawai webDeveloper = new Pegawai("Andi", "Web Developer");
    webDeveloper.kerja();
    webDeveloper.TerimaGaji(8_500_000);

    // B. Data Analyst
    Pegawai dataAnalyst = new Pegawai("Clara Anindya", "Data Analyst");
    dataAnalyst.kerja();
    dataAnalyst.TerimaGaji(9_000_000);

    // C. Project Manager
    Pegawai projectManager = new Pegawai("Daniel Fernando", "Project Manager");
    projectManager.kerja();
    projectManager.TerimaGaji(13_000_000);

    // D. Content Writer
    Pegawai contentWriter = new Pegawai("Ayu Maharani", "Content Writer");
    contentWriter.kerja();
    contentWriter.TerimaGaji(6_000_000);

    // E. System Analyst
    Pegawai systemAnalyst = new Pegawai("Raka Yudhistira", "System Analyst");
    systemAnalyst.kerja();
    systemAnalyst.TerimaGaji(10_500_000);

    // F. Graphic Designer
    Pegawai graphicDesigner = new Pegawai("Intan Permata", "Graphic Designer");
    graphicDesigner.kerja();
    graphicDesigner.TerimaGaji(7_200_000);

    // G. UI/UX Designer
    Pegawai UIUXDesigner = new Pegawai("Samuel Hutapea", "UI/UX Designer");
    UIUXDesigner.kerja();
    UIUXDesigner.TerimaGaji(7_800_000);

    // H. Finance Staff
    Pegawai financeStaff = new Pegawai("Diah Lestari", "Finance Staff");
    financeStaff.kerja();
    financeStaff.TerimaGaji(6_300_000);

    // I. Network Engineer
    Pegawai networkEngineer = new Pegawai("Yoga Saputra", "Network Engineer");
    networkEngineer.kerja();
    networkEngineer.TerimaGaji(8_700_000);

    // J. QA Engineer
    Pegawai QAEngineer = new Pegawai("Vania Meilani", "QA Engineer");
    QAEngineer.kerja();
    QAEngineer.TerimaGaji(8_500_000);

    // -----------------------------------------------------------------------------------------------------------------

    // 8. Soal1.Film
    // A. Avengers: Endgame
    Film avengersEndgame = new Film("Avengers: Endgame", "Aksi, Sci-Fi", 181);
    avengersEndgame.putar();
    avengersEndgame.berhenti();

    // B. Parasite
    Film parasite = new Film("Parasite", "Thriller, Drama", 132);
    parasite.putar();
    parasite.berhenti();

    // C. Interstellar
    Film interstellar = new Film("	Interstellar", "Sci-Fi, Drama", 169);
    interstellar.putar();
    interstellar.berhenti();

    // D. The Conjuring
    Film theConjuring = new Film("The Conjuring", "Horor, Misteri", 112);
    theConjuring.putar();
    theConjuring.berhenti();

    // E. Joker
    Film joker = new Film("Joker", "Drama, Psikologis", 122);
    joker.putar();
    joker.berhenti();

    // F. Dilan 1990
    Film dilan1990 = new Film("Dilan 1990", "Romantis, Drama", 110);
    dilan1990.putar();
    dilan1990.berhenti();

    // G. The Dark Knight
    Film theDarkKnight = new Film("	The Dark Knight", "Aksi, Kejahatan", 152);
    theDarkKnight.putar();
    theDarkKnight.berhenti();

    // H. Laskar Pelangi
    Film laskarPelangii = new Film("Laskar Pelangi", "Drama, Inspiratif", 124);
    laskarPelangii.putar();
    laskarPelangii.berhenti();

    // I. Frozen II
    Film frozenII = new Film("Frozen II", "Animasi, Petualangan", 103);
    frozenII.putar();
    frozenII.berhenti();

    // J. Fast & Furious 9
    Film fastFurious9 = new Film("Fast & Furious 9", "Aksi, Petualangan", 145);
    fastFurious9.putar();
    fastFurious9.berhenti();
    System.out.println();

    // -----------------------------------------------------------------------------------------------------------------

    // 9. Soal1.Akun
    // A. Instagram
    Akun ig = new Akun("Instagram", "andipratama23", "Insta2023!");
    ig.login("Insta2023!");
    ig.UbahPassword("Insta2025!");
    ig.logout();

    // B. Facebook
    Akun fb = new Akun("Facebook", "siti_nurhaliza5", "FBsecure2023");
    fb.login("FBsecure2023");
    fb.UbahPassword("FBsecure2025");
    fb.logout();

    // C. Twitter
    Akun twitter = new Akun("Twitter", "rizky_maulana_19", "Tw!tter2023");
    twitter.login("Tw!tter2023");
    twitter.UbahPassword("Tw!tter2025");
    twitter.logout();

    // D. Amazon
    Akun amazon = new Akun("Amazon", "ninakartika7", "Am@zon2023");
    amazon.login("Am@zon2023");
    amazon.UbahPassword("Am@zon2023");
    amazon.logout();

    // E. Gmail
    Akun gmail = new Akun("Gmail", "putriayulestari@gmail.com", "Gm@il2023");
    gmail.login("Gm@il2023");
    gmail.UbahPassword("Gm@il2025");
    gmail.logout();

    // F. YouTube
    Akun yt = new Akun("YouTube", "fajar_nugroho", "YTpassword2023");
    yt.login("YTpassword2023");
    yt.UbahPassword("YTpassword2025");
    yt.logout();

    // G. Linkedin
    Akun linkedin = new Akun("Linkedin", "dewi.anggraini", "Link@2023");
    linkedin.login("Link@2023");
    linkedin.UbahPassword("Link@2025");
    linkedin.logout();

    // H. Tiktok
    Akun tt = new Akun("Tiktok", "budi_santoso1", "T!kTok@2023");
    tt.login("T!kTok@2023");
    tt.UbahPassword("T!kTok@2025");
    tt.logout();

    // I. Spotify
    Akun spotify = new Akun("Spotify", "melati.wulan1990", "Sp0tify@2023");
    spotify.login("Sp0tify@2023");
    spotify.UbahPassword("Sp0tify@2025");
    spotify.logout();

    // J. Netflix
    Akun netflix = new Akun("Netflix", "agusharyanto32", "N3tflix!2023");
    netflix.login("N3tflix!2023");
    netflix.UbahPassword("N3tflix!2025");
    netflix.logout();
    System.out.println();

    // -----------------------------------------------------------------------------------------------------------------

    // 10. Soal1.Tempat
    // A. Jakarta
    Tempat Jakarta = new Tempat("Jakarta", 661.5, 10.56);
    Jakarta.tampilkanInfo();

    // B. Surabaya
    Tempat surabaya = new Tempat("Surabaya", 326.8, 2.89);
    surabaya.tampilkanInfo();

    // C. Bandung
    Tempat bandung = new Tempat("Bandung", 167.3, 2.44);
    bandung.tampilkanInfo();

    // D. Yogyakarta
    Tempat yogyakarta = new Tempat("Yogyakarta", 32.5, 0.43);
    yogyakarta.tampilkanInfo();

    // E. Medan
    Tempat medan = new Tempat("Medan", 265.1, 2.5);
    medan.tampilkanInfo();

    // F. Semarang
    Tempat semarang = new Tempat("Semarang", 373.7, 1.7);
    semarang.tampilkanInfo();

    // G. Bekasi
    Tempat bekasi = new Tempat("Bekasi", 210.5, 2.5);
    bekasi.tampilkanInfo();

    // H. Denpasar
    Tempat denpasar = new Tempat("Denpasar", 123.9, 0.95);
    denpasar.tampilkanInfo();

    // I. Makassar
    Tempat makassar = new Tempat("Makassar", 175.8, 1.5);
    makassar.tampilkanInfo();

    // J. Indonesia
    Tempat indonesia = new Tempat("Indonesia", 1_905_000, 278);
    indonesia.tampilkanInfo();
    System.out.println();

    // -------------------------------------------------------------------------------------------------------------------

  }
}
