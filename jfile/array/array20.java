import java.io.*;

class array20 {
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr[] = new char[100];
        int i, space = 0, line = 0;
        System.out.println("enter sentence:");
        for (i = 0; i < 100; i++) {
            arr[i] = (char) br.read();
            if (arr[i] == '0')
                break;
            if (((int) arr[i] >= 65 && (int) arr[i] <= 90) || ((int) arr[i] >= 97 && (int) arr[i] <= 122))
                i++;
            else {
                if (arr[i - 1] == (char) 32) {
                    arr[i - 1] = arr[i];
                    i--;
                }
            }
        }
        System.out.println("sentence is:");
        for (i = 0; i < 100; i++) {
            if (arr[i] == '0')
                break;
            System.out.print(arr[i]);
        }
        for (i = 0; i < 100; i++) {
            if (arr[i] == (char) 32)
                space++;
            if (arr[i] == (char) 13)
                line++;
            if (arr[i] == '0')
                break;
        }
        System.out.println("\nno of words= " + (space + line));
        System.out.println("no of lines= " + line);
    }
}