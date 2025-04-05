/*
 * E
 * E D
 * E D C 
 * E D C B
 * E D C B A
 */
import java.io.*;
class ptnTen{
    public static void main(String[] args) {
        int i,j;
        for(i=69;i>=65;i--){
            for(j=69;j>=i;j--)
              System.out.print(" "+(char)j);
         System.out.print("\n");
        }
    }
}