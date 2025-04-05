import java.io.*;
class checkingDigitPalindrome{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int number;
        System.out.println("Enter any positive number to check palindrome or not.");
        number = Integer.parseInt(br.readLine());
        if(number>=0&&number<=9){
            System.out.println("Checking is not possible.");
        }
        if(number>=10&&number<=99){
            System.out.println("Checking is not possible.");
        }
        if(number>=100&&number<=999){
            int first=0,second=0,last=0,Backup,Reverse_sum=0;
            Backup=number;
            last=number%10;
            number=number/10;
            second=number%10;
            number=number/10;
            first=number;
            Reverse_sum=(last*100)+(second*10)+(first*1);
            if(Backup==Reverse_sum){
                System.out.println("It is palindrome number.");
            }
            else{
                System.out.println("It is not palindrome number.");
            }
            if(number>=1000){
                System.out.println("You Enterd more than 3 digit number");
            }


        }
    }
}