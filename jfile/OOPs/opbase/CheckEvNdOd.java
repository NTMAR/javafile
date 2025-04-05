import java.io.*;
class Next{
        int x;

        int Odd_Even(int a){
           if(a%2==0)
             return (1);
           else 
             return (0);
        }
        
}
class CheckEvNdOd{
      public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        Next net = new Next();
        System.out.println("Enter Any number");
        int w = Integer.parseInt(reader.readLine()); 
        net.x = net.Odd_Even(w);
        if(net.x == 1)
        System.out.println("Even number");
        else 
        System.out.println("Odd number");
     }
}