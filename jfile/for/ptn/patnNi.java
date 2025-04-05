/*
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 */
import java.io.*;
class patnNi{
    public static void main(String[] args) {
        int i,j;
        for(i=69;i>=65;i--){
            for(j=i;j<=69;j++)
              System.out.print(" "+(char)j);
         System.out.print("\n");
        }
    }
}