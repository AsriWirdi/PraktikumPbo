package Soal20;

public class Main {
    public static void main(String[] args) {
        Manusia rektor = new Rektor();
        rektor.setNama("Prof . Dr . Muhammad Abdy, S.Si., M.Si");
        rektor.setJenisKelamin("Laki-laki");
        System.out.println("Nama rektor Unsulbar: " + rektor.getNama());
        System.out.println();

        Manusia dekanTeknik = new Dekan();
        dekanTeknik.setNama("Dr. Ir. Hafsah Nirwana, M.T");
        dekanTeknik.setJenisKelamin("Perempuan");
        System.out.println("Nama Dekan Teknik Unsulbar: " + dekanTeknik.getNama());
        System.out.println();

        Manusia wadek1 = new WakilDekan1();
        wadek1.setNama("Ir. Sugiarto Cokrowibowo, S.S., M.T");
        wadek1.setJenisKelamin("Laki-laki");
        System.out.println("Nama Wakil Dekan I Teknik Unsulbar: " + wadek1.getNama());
        System.out.println();

        Manusia wadek2 = new WakilDekan2();
        wadek2.setNama("Nur Adyla S, S.T., M.T");
        wadek2.setJenisKelamin("Perempuan");
        System.out.println("Nama Wakil Dekan II Teknik Unsulbar: " + wadek2.getNama());
        System.out.println();

        Manusia dosenPBO1 = new Dosen();
        dosenPBO1.setNama("Ir. Sugiarto Cokrowibowo, S.Si., MT");
        dosenPBO1.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Dosen PBO I Teknik Unsulbar: " + dosenPBO1.getNama());
        System.out.println();

        Manusia dosenPBO2 = new Dosen();
        dosenPBO2.setNama("A. Amirul Asnan Cirua, S.T., M.Kom");
        dosenPBO2.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Dosen PBO II Teknik Unsulbar: " + dosenPBO2.getNama());
        System.out.println();

        Manusia Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.setNama("Asri Wirdi");
        Mahasiswa1.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Mahasiswa Teknik Informatika Unsulbar: " + Mahasiswa1.getNama());
        System.out.println();

        Manusia Mahasiswa2 = new Mahasiswa();
        Mahasiswa2.setNama("Muhammad Iqwal");
        Mahasiswa2.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Mahasiswa Teknik Informatika Unsulbar: " + Mahasiswa2.getNama());
        System.out.println();

        Manusia Mahasiswa3 = new Mahasiswa();
        Mahasiswa3.setNama("Muh Rifai");
        Mahasiswa3.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Mahasiswa Teknik Informatika Unsulbar: " + Mahasiswa3.getNama());
        System.out.println();

        Manusia Mahasiswa4 = new Mahasiswa();
        Mahasiswa4.setNama("Muhammad Pajri");
        Mahasiswa4.setJenisKelamin("Laki-Laki");
        System.out.println("Nama Mahasiswa Teknik Informatika Unsulbar: " + Mahasiswa4.getNama());
        System.out.println();

    }
}
