import java.io.*;
class PTTeighteen{
          public static void main(String[]args)
             throws IOException{
                 int i,j,space;
                   i=5;
             do{
                  space=i;
                  do{
                      if(space>1)
                          System.out.print("  ");
                         space--;
                    }while(space>1);
                     j=i;
                   do{
                        System.out.print(" "+i);
                           j++;
                     }while(j<=5);
                       System.out.print("\n");
                         i--;
               }while(i>=1);
 }
}