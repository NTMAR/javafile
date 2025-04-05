/*
 *  b b b b A
 *  b b b B A
 *  b b C B A
 *  b D C B A
 *  E D C B A
 */
import java.io.*;
class spaceFifteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=65;m<=69;m++){
                for(space=69;space>=m;space--)
                     System.out.print(" ");
                for(n=m;n>=65;n--)
                     System.out.print((char)n);
                System.out.print("\n");
            }
        }
}

