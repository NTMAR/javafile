import java.io.*;
class  Nxt{
   int x;

     void input() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter any integer number");
         x = Integer.parseInt(br.readLine());
     }
}

class Ample extends Nxt{
    
   int check(){
      if(x > 0) {
          System.out.println("Number is positive");
         return (0);
       }
      else{
         System.out.println("Number is negative");
         return (1);
      }
   }
}

class Pos extends Ample {
    int z;

     void table(){
         z = 1;
         do{
              System.out.println(x +" x "+ z + " = "+ x*z);
              z ++; 
         }while(z <= 10);
     }
}

class NagPosTab{
    public static void main(String [] args) throws IOException {
       Pos vet = new Pos();
       vet.input();
       int y =  vet.check();
       if(y == 0)
         vet.table();
   }
}









