import java.io.*;

class DesiFloatingSlice extends Thread {
    int slash, k;

    public void run() {
        k = 0;
        try {
            for (slash = 1; slash <= 300; slash++) {

                for (int x = 1; x <= k; x++) {
                    Thread.sleep(100);
                    System.out.print(" ");
                }
                if (slash % 2 == 1) {
                    Thread.sleep(100);
                    System.out.print("/"+"\b");
                } else {
                    Thread.sleep(100);
                    System.out.print("\\"+"\b");
                }
                k = (slash % 2 == 0) ? (1) : (0);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DesiFloatingSlice desiFloatingSlice = new DesiFloatingSlice();
        desiFloatingSlice.start();
    }
}