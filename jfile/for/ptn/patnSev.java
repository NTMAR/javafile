/*
 * A
 * B A
 * C B A
 * D C B A
 * E D C B A
 */
import java.io.*;
class patnSev{
    public static void main(String[] args) {
        int i,j;
        for(i=65;i<70;i++){
            for(j=i;j>=65;j--)
              System.out.print(" "+(char)j);
         System.out.print("\n");
        }
    }
}