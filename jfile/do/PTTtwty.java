import java.io.*;
class PTTtwty{
           public static void main(String []args)
           throws IOException{
            int i,j,space;
             i=1; 
            do{
                space=4;
			if(space>=i)
			{
                 do{
          
                          System.out.print("m");
                          space--;
                   }while(space>=i);
			}

                    j=i;
                    do{
                       System.out.print(j);
                       j--;
                      }while(j>=1);
                   System.out.print("\n");
                   i++;
              }while(i<=5);
 }
}