import java.io.*;

class DesiFloatingNext extends Thread {
    int slash, k;

    public void run() {
        k = 0;
        try {
            for (slash = 1; slash <= 300; slash++) {

                for (int x = 1; x <= k; x++) {
                    Thread.sleep(1);
                    System.out.print(" ");
                }
                if (slash % 2 == 1) {
                    Thread.sleep(1);
                    System.out.print("/"+"\b");
                } else {
                    Thread.sleep(1);
                    System.out.print("\\"+"\b");
                }
                if (slash % 2 == 0) {
                    k = 1;
                } else {
                    k = 0;
                }
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DesiFloatingNext desiFloatingSlice = new DesiFloatingNext();
        desiFloatingSlice.start();
    }
}