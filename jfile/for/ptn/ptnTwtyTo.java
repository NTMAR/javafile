/*
 * A B C D E
 * A B C D
 * A B C 
 * A B 
 * A
 */
import java.io.*;
class ptnTwtyTo{
    public static void main(String[] args) {
        int p,r;
        for(p=69;p>=65;p--){
            for(r=65;r<=p;r++)
               System.out.print(" "+(char)r);
            System.out.print("\n");
        }
    }
}