import java.io.*;

class CountNo {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no,count,n;
        System.out.println("Enter a number");
        no = Integer.parseInt(br.readLine());
        count = 0;
        do {
            count += 1;
            no/=10;
        }while(no>0);
        System.out.println("Number of digit are = " + count);
    }
}