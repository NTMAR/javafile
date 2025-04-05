import java.io.*;
class printTwo {
    public static void main(String[] args) {
        int i;
        int j;
        i = 1;
        j = 2;
        System.out.println("" + "-------------------");
        while (i < 10) {
            System.out.print(i + "/" + j);
            if (i < 9)
                System.out.print("" + "+");
            i  += 1;
            j += 1;
        }
        System.out.print("" + "\n");
        System.out.print("" + "-------------------");

    }
}