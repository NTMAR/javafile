import java.io.*;
class NextAlpha{
    public static void main(String [] args) throws IOException{
     BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
       char x = (char)read.read();
       System.out.println("Enter any char or number");
       if((int)x >= 65 && (int)x <= 90 || (int)x >= 97 && (int)x <= 122)
         System.out.println("It is aphabet");
        else
         System.out.println("It is number");
  }
}