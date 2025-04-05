import java.io.*;
class Next {
            int res;

      void Act(int x,int y){
             res = 2*x+2*y;
         System.out.println("Perimeter of Rectangle = "+res);
      }
       
      void Act(char s,int y,int z){
             res = y*z/2;
         System.out.println("Area of rectangle = "+res);
      }
}
class callAreaOrLoad {
    public static void main(String [] args) throws IOException{
     BufferedReader show = new BufferedReader (new InputStreamReader (System.in));
      Next net = new Next();
      System.out.println("Enter len ");
      int x = Integer.parseInt(show.readLine());
      System.out.println("Enter wid ");
      int y = Integer.parseInt(show.readLine());
      net.Act(x,y);
      System.out.println("Enter base ");
      int z = Integer.parseInt(show.readLine());
      System.out.println("Enter Height");
      int w = Integer.parseInt(show.readLine());
      net.Act('a',z,w);
  }
}