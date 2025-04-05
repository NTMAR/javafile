import java.io.*;
class Next{
       int a, b, c;

      Next(int x,int y){
         a = x;
         b = y;
         c =0;
      }

      void Sum(){
        c = a+b;
        System.out.println("the addation is "+c);
      }
}
class parametMethodCon{
    public static void main(String[] args) throws IOException{
        Next net = new Next(10,20);
        net.Sum();
    }
}