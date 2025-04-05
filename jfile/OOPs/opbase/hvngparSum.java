import java.io.*;

class Add {
    int sum;
    void fnd(int a, int b) {
        sum = a + b;
        System.out.println("Addation=" + sum);
    }
}
class hvngparSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        Add Adi = new Add();
        System.out.println("Enter 1st number");
        x = Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd number");
        y = Integer.parseInt(br.readLine());
        Adi.fnd(x,y);
    }
}