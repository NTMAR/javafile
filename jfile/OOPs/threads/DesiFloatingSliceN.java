wimport java.io.*;

class DesiFloatingSliceN extends Thread {
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
        DesiFloatingSliceN desiFloatingSlice = new DesiFloatingSliceN();
        desiFloatingSlice.start();
    }
}