import java.io.*;
class Next{
       int l, b, c;

      Next(int x,int y){
         l = x;
         b = y;
      }

      void Area(){
        System.out.println("value of c is "+c);
        c = l*b;
        System.out.println("Area of ractangle is "+c);
      }
}
class MethConArea{
    public static void main(String[] args) throws IOException {
        Next net = new Next(5,10);
        net.Area();
    }
}