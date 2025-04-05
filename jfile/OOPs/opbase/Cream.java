import java.io.*;
class Cream{
   public static void main(String []args) throws IOException{
    int i=0;
    int j=2;
    j=i++ + i++ + --i + i++;
    System.out.println(i);
       System.out.println(j);
 }
}