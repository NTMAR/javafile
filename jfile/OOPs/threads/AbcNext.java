import java.io.*;

class AbcNext implements Runnable{
   public void run(){
     System.out.println("My first thread is running");
   }

   public static void main(String [] args){
     AbcNext ab = new AbcNext();
     Thread t = new Thread(ab);
     t.start();
   }
}