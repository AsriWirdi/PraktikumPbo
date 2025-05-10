package Soal7_12.test;

public class Main {
    public static void main(String[] args) {
        Bumi bumi = new Bumi();
        bumi.buka();
        bumi.baca();
        bumi.tutup();
        bumi.getStringInfoState();
        System.out.println();


        Durian durian = new Durian("Durian", "Manis");
        durian.makanBuah();
        durian.getStringInfoState();
        System.out.println();


        Espon espon = new Espon("Espon", 50);
        espon.cetak();
        espon.isiTinta();
        espon.getStringInfoState();
        System.out.println();

        
        Kucing kucing = new Kucing("Kucing", "Putih");
        kucing.tidur();
        kucing.makan();
        kucing.getStringInfoState();
    }
}
