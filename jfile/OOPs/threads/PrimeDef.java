import java.io.*;

class PrimeDef extends Thread {
    int a, b;

    public void run() {
        System.out.println("Prime Number are");
        for (a = 1; a <= 50; a++) {
            for (b = 2; b < a; b++) {
                if (a % b == 0) {
                    break;
                }
            }
            if (b == a) {
                try {
                    Thread.sleep(500);
                    System.out.println(a);
                } catch (Exception e) {

                }
            }
        }
    }

    public static void main(String[] args) {
        PrimeDef pr = new PrimeDef();
        pr.start();
    }
}