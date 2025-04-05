import java.io.*;

class NmethreadNext extends Thread {
    int no;

    public void run() {
        for (no = 1; no <= 5; no++) {
            try {
                Thread.sleep(600);
                System.out.print(no);
                if (no < 5) {
                    Thread.sleep(600);
                    System.out.print("+");
                }
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        NmethreadNext read = new NmethreadNext();
        read.start();
        System.out.println("Thread Name is " + read.getName());
    }
}