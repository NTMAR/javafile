/*
 * b b b b E
 * b b b E D 
 * b b E D C 
 * b E D C B
 * E D C B A
 */
import java.io.*;
class spaceThirteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=69;m>=65;m--){
                for(space=65;space<=m;space++)
                     System.out.print(" ");
                for(n=69;n>=m;n--)
                     System.out.print((char)n);
                System.out.print("\n");
            }
        }
}

