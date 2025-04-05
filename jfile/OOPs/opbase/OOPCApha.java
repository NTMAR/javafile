import java.io.*;
class Next{
            char x;
        void Input() throws IOException{
     BufferedReader $read = new BufferedReader (new InputStreamReader(System.in));
       System.out.println("Enter any char or number");
        x = (char)$read.read(); 
       if((int)x >= 65 && (int)x <= 90 || (int)x >= 97 && (int)x <= 122)
         System.out.println("It is aphabet");
       else
         System.out.println("It is number");
    }
}
class OOPCApham{
    public static void main(String [] args) throws IOException{
     Next net = new Next();
     int i=1;
      while(i<=5){
      net.Input();
      i+=1;
     }
 }
}
