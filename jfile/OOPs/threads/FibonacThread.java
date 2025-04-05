import java.io.*;

class th extends Thread {
    int i = 0, j = 1, s = 0;

    public void run() {
        i = 0;
        j = 1;
        s = 0;
        System.out.println("fibonacci series upto 100");
        while (s <= 100) {
            try {
                Thread.sleep(300);
                System.out.print(s + " ");
            } catch (Exception e) {
            }
            i = j;
            j = s;
            s = i + j;
        }
    }
}

class FibonacThread {
    public static void main(String args[]) throws IOException {
        th obj = new th();
        obj.start();
    }
}