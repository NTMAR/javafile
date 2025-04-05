import java.io.*;
class tochangeLowUpp
{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
    char enteredAlphabet,alphabet;
    System.out.println("Enter alphabet.");
    enteredAlphabet=(char)br.read();
    if((int)enteredAlphabet>=65&&(int)enteredAlphabet<=90)
      {
        alphabet=(char)(enteredAlphabet+32);
        System.out.println(alphabet+" is Lower case.");
      }
      else 
      {
        alphabet=(char)(enteredAlphabet-32);
        System.out.println(alphabet+" is Upper case.");
      }

    }
}
