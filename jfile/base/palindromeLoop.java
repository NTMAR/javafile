import java.io.*;
class palindromeLoop{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int number,digit,backup,reverse=0;
        System.out.println("Enter any number.");
        number=Integer.parseInt(br.readLine());
        backup=number;
        while(number>0){
            digit=number%10;
            reverse=(reverse*10)+digit;
            number=number/10;
        }
        if (backup == reverse) 
         System.out.println("Number is palindrome.");
         else 
         System.out.println("Number is not Palindrome.");

    }
}



