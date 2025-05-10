package Soal13;

public class AnimasiRunnable implements Runnable{

    @Override
    public void run(){
        String teks = " Asri Wirdi ";
        try{
            while (true) {
                System.out.println("\r" + teks);
                teks = teks.substring(1) + teks.charAt(0);
                Thread.sleep(70);
            }
        } catch (InterruptedException e){
            System.out.println("Runnable dihentikan.");
        }
    }

    public static void main(String[] args) {
        Runnable animasi = new AnimasiRunnable();
        Thread thread = new Thread(animasi);
        thread.start();
    }
}
