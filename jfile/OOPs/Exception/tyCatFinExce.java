import java.io.*;

class Next{
  void act(){
     try{
         try{
            System.out.println(5/0);
         } catch(ArithmeticException ae){
              System.out.println("Exception handled 1st");
              System.out.println(3/0);
           }
     } catch(ArithmeticException a){
       System.out.println("Exception handled 2nd");
     }
  
     finally{
        System.out.println("Always exceute");
       System.out.println(2/0);
     }
  }
}

class tyCatFinExce{
   public static void main(String [] args){
    Next net = new Next();
    net.act();
   }
}