import java.io.*;
class Next{
            int reserve,add;
    
       void Act(int base,int exo){
            add = 1;
            reserve = base;
            while(exo!=0){
               base *= add;
               add = reserve;
               exo -=1;
            }
            System.out.println("Final value is "+base);
       }
}
class MultiplayExpo{
    public static void main(String [] args) throws IOException {
       Next net = new Next();
       BufferedReader $ease = new BufferedReader (new InputStreamReader(System.in));
       System.out.println("Enter base number");
       int x = Integer.parseInt($ease.readLine());
       System.out.println("Enter Exponent of number");
       int y = Integer.parseInt($ease.readLine());
       net.Act(x,y);
 }
}