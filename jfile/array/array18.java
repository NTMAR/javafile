import java.io.*;

class array18 {
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[] = new char[10];
        int i, count = 0;
        System.out.println("enter any word");
        for (i = 0; i < 10; i++) {
            arr[i] = (char) br.read();
            if (arr[i] == (char) 13)
                break;
        }
        System.out.println("word is:");
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i]);
            if (arr[i] == (char) 13)
                break;
            else
                count++;
        }
        System.out.println("\n");
        int capital = 0, small = 0, sentence = 0, toggle = 0;
        for (i = 0; i < count; i++) {
            if ((int) arr[i] >= 65 && (int) arr[i] <= 90)
                capital++;
            if ((int) arr[i] >= 97 && (int) arr[i] <= 122)
                small++;
            if (i == 0) {
                if ((int) arr[i] >= 65 && (int) arr[i] <= 90)
                    sentence++;
            } else {
                if ((int) arr[i] >= 97 && (int) arr[i] <= 122)
                    sentence++;
            }
            if (((int) arr[i] >= 65 && (int) arr[i] <= 90) || ((int) arr[i] >= 97 && (int) arr[i] <= 122))
                toggle++;
        }
        if (capital == count)
            System.out.println("word is in capital letter");

        else if (small == count)
            System.out.println("word is in small letter");

        else if (sentence == count)
            System.out.println("word is in sentence letter");

        else if (toggle == count)
            System.out.println("word is in toggle letter");
    }
}