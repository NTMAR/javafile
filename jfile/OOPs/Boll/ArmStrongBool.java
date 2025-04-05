import java.io.*;

class ArmStrongBool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int rem,sum,backup;
        boolean Hold;
        sum = 0;
        System.out.println("Enter only three digit number");
        int num = Integer.parseInt(br.readLine());
        backup = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == backup){
            Hold = true;
        } else {
            Hold = false;
        }
        if(Hold == true){
            System.out.println("This is Armstrong number");
        } else {
            System.out.println("This is not Armstrong number");
        }
    }
}