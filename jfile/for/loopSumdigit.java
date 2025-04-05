import java.io.*;
class loopSumdigit{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int number,sum;
        System.out.println("Enter any number.");
        number=Integer.parseInt(br.readLine());
        sum=0;
        for(;number>0;number /=10){
            sum=sum+(number%10);
        }
        System.out.println("Addation of digit ="+sum);

    }

}
