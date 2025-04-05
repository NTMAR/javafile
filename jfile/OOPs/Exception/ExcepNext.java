import java.io.*;

class ExcepNext {
    public static void main(String[] args) {
        int n;
        n = 2;
        try {
            System.out.println(n / 0);
        } catch (Exception ev) {
            System.out.println("We cannot divide any number by zero");
        } /*
           * In this program if try block generate exception then catch block will execute
           */
    }
}