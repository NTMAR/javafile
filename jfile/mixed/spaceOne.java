/*
 * 1 2 3 4 5
 *   2 3 4 5
 *     3 4 5
 *       4 5
 *         5
 */
import java.io.*;
class  spaceOne{
    public static void main(String[] args) {
        int i,j,space;
          for(i=1;i<=5;i++){
            for(space=1;space<i;space++)
                   System.out.print(" ");
            for(j=i;j<=5;j++)
                 System.out.print(j);
            System.out.print("\n");
          }
    }
}