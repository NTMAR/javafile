import java.io.*;

class SeriesThStop extends Thread {
    int i;

    public void run() {
        for (i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SeriesThStop seriesTh = new SeriesThStop();
        seriesTh.start();
        try {
            seriesTh.join(5200);
        } catch (Exception e) {
        }
        if (seriesTh.isAlive()) {
            System.out.println("Thread is Alive");
        } else {
            System.out.println("Thread is not Alive");
        }
    }
}