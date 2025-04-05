import java.io.*;

class printMtwo {
    public static void main(String[] args) {
        int i, j;
        i = 1;j = 2;
        while (i <= 9) {
            System.out.print(i + "/" + j);
            if (i < 9)
                System.out.print("" + "+");
            j = j + 2;
            i = i + 2;
        }
    }
}