import java.io.*;

class BinaryPri extends Thread
{
    public static void main(String [] args){
    int i,j;
    for(i=0; i<=270; i++)
    {
        for(j=0; j<=270; j++)
        {
            if((i+j)%2==0)
            {
                try{
                Thread.sleep(1);
                System.out.printf("0");
                } catch (Exception e){}
            }
            else
            {
                try{
                Thread.sleep(1);
                System.out.printf("1");
                } catch (Exception e){}
            }
        }
        System.out.printf("\n");
    }
 }
}






    