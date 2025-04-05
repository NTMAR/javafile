/*
 * b b b b E
 * b b b D E 
 * b b C D E
 * b B C D E
 * A B C D E
 */
import java.io.*;
class spaceTwelve {
        public static void main(String[] args) {
            int m,n,space;
            for(m=69;m>=65;m--){
                for(space=65;space<=m;space++)
                     System.out.print(" ");
                for(n=m;n<=69;n++)
                     System.out.print((char)n);
                System.out.print("\n");
            }
        }
}
