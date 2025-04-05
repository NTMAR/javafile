import java.io.*;

class Abc extends Thread{
   public void run(){
     System.out.println("My first thread is running");
   }

   public static void main(String [] args){
     Abc ab = new Abc();
     ab.start();
   }
}