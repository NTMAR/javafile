import java.io.*;
class Next{
            int base,exo,reserve,add;
    
       int Act(int base,int exo){
            add = 1;
            reserve = base;
            while(exo!=0){
               base *= add;
               add = reserve;
               exo -=1;
            }
           return (base);
       }
}
class MultiExpoNext {
    public static void main(String [] args) throws IOException {
       Next net = new Next();
       BufferedReader $ease = new BufferedReader (new InputStreamReader(System.in));
       System.out.println("Enter base number");
       int x = Integer.parseInt($ease.readLine());
       System.out.println("Enter Exponent of number");
       int y = Integer.parseInt($ease.readLine());
       int z = net.Act(x,y);
       System.out.println("Final value is "+z);
 }
}