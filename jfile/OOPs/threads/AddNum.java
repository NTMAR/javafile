import java.io.*;

class AddNum extends Thread{
   int a,b,c;
   
   public void run(){
     a = 10;
     b = 20;
     c = a + b;
     System.out.println("Sum is "+c);
   }

   public static void main(String [] args){
      AddNum um = new AddNum();
      um.start();
    }
}