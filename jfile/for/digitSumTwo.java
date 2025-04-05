import java.io.*;
class digitSumTwo {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,no,sum;
        System.out.println("Enter a number.");
        no=Integer.parseInt(br.readLine());
        sum=0;
        for(i = 1; i < no; i += 1){
            sum=sum+(no%10);
            no /= 10;
        }
        for(int a=1;a<=9;a+=1){
            if(a==no)
               sum=sum+a;
        }
        System.out.println("Sum of Digit = "+sum);
    }
}
