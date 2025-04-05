import java.io.*;

class SeriesTh extends Thread {
    int i;

    public void run() {
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        SeriesTh seriesTh = new SeriesTh();
        seriesTh.start();
        Thread.sleep(2);
        if (seriesTh.isAlive()) {
            System.out.println("Thread is Alive");
        } else {
            System.out.println("Thread is not Alive");
        }
    }
}