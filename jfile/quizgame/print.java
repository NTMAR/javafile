import java.io.*;
class print {
    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println("" + "-------------------");
        while (i <= 9) {
            System.out.print(i + "/");
            i = i + 1;
            System.out.print(i);
            if (i < 9)
                System.out.print("" + "+");
            i = i + 1;
        }
        System.out.print("" + "\n");
        System.out.print("" + "-------------------");

    }
}