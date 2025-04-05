import java.io.*;

class arrLoop {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter " + i + " Index element=");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Stored elements are.");
        for (i = 0; i < 5; i++)
            System.out.println("[" + i + "]" + "=" + arr[i]);
    }
}