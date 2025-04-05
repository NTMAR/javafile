import java.io.*;
class SumNum{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int number,sum;
        System.out.println("Enter any number.");
        number=Integer.parseInt(br.readLine());
        sum=0;
        do{
            sum=sum+(number%10);
            number = number/10;
        } while(number>0);
        System.out.println("Addation of digit ="+sum);

    }

}
