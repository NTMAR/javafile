import java.io.*;

class NmethreadSet extends Thread {
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
        NmethreadSet read = new NmethreadSet();
        read.start();
        System.out.println("Before changing the of Thread");
        System.out.println("Default Thread Name is " + read.getName());
        read.setName("Nitish");
        System.out.println("After changing the thread name  is " + read.getName());
    }
}