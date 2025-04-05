import java.io.*;

class AddNumStop  extends Thread{
   int a,b,c;
   
   public void run(){
     a = 10;
     b = 20;
     c = a + b;
   //  try{
        Thread.sleep(-1);
  //   } catch (Exception e){
    //   System.out.println("Task is not Working");
    // }
     System.out.println("Sum is "+c);
   }

   public static void main(String [] args){
      AddNumStop um = new AddNumStop();
      um.start();
    }
}