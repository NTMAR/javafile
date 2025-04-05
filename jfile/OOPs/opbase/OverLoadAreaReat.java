import java.io.*;
class Next {
      void call(int x){
        if(x % 2 == 0)
            System.out.println("It is even number");
        else 
         System.out.println("It is odd number");
      }
       
      void call(int x ,int y){
        System.out.println("Area of rectangle = "+x*y);
      }
}
class OverLoadAreaReat{
      public static void main(String[] args) throws IOException {
         BufferedReader $band = new BufferedReader (new InputStreamReader(System.in));
          Next net = new Next();
          int p,len,bred;
          System.out.println("Enter any number");
          p = Integer.parseInt($band.readLine());
          net.call(p);
          System.out.println("Enter length of reactangle");
          len = Integer.parseInt($band.readLine());
          System.out.println("Enter Breadth of reactangle");
          bred = Integer.parseInt($band.readLine());
          net.call(len,bred);
      }
}