import java.io.*;

class tyCatFinExceNext{
  public static void main(String [] args){
    int x[] = new int[]{1,2};
    try{
      System.out.println(5/0);
    } catch (Exception e){
       for(int u = 0; u <= 2; u++)
           System.out.println(x[u]);
       }

      finally{    
            System.out.println(5/0);
            System.out.println("111");
      }
  }
}