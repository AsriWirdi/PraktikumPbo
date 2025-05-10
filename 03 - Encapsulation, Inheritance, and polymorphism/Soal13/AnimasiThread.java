package Soal13;

public class AnimasiThread extends java.lang.Thread {
    @Override
    public void run() {
        String teks = " Asri Wirdi ";
        try {
            while (true) {
                System.out.println("\r" + teks); // \r untuk menimpa baris sebelumnya
                teks = teks.charAt(teks.length() - 1) + teks.substring(0, teks.length() - 1);
                Thread.sleep(70); // jeda 300 milidetik
            }

        } catch (InterruptedException e) {
            System.out.println("Thread dihentikan.");
        }
    }

    public static void main(String[] args) {
        AnimasiThread animasi = new AnimasiThread();
        animasi.start();
    }
}
