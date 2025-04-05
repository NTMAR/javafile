/*
 * A B C D E
 *   b c d e
 *     C D E
 *       d e
 *         E
 */
import java.io.*;
class spaceTwo{
    public static void main(String[] args) {
        int a,b,space;
        for(a=65;a<=69;a++){
            for(space=65;space<a;space++)
                System.out.print(" ");
             for(b=a;b<=69;b++)
                 if(a==66)
                 System.out.print((char)(b+32));
                 else if(a==68)
                    System.out.print((char)(b+32));
                  else 
                    System.out.print((char)b);
            System.out.print("\n");
        }
    }
}