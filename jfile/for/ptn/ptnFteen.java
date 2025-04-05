/*
 * 1 1 1 1 1 
 * 2 2 2 2
 * 3 3 3
 * 4 4
 * 5
 */
import java.io.*;
class ptnFteen{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--)
                 System.out.print(" "+i);
            System.out.print("\n");
        }
    }
}
