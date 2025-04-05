import java.io.*;
class Disp{

    int a, b, c;

    Disp(int x, int y){
       a = x;
       b = y;
       c = 0;
    }

    void Sum(){
      c = a + b;
      System.out.println("the addation is "+c);
    }
}

class  InitiaForeCon{
        public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter any number");
        int z = Integer.parseInt(br.readLine());
        System.out.println("Enter any number");
        int w = Integer.parseInt(br.readLine());
        Disp obj = new Disp(z,w);
        Disp objOne = new Disp();
        obj.Sum();
 }
}