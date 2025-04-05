import java.io.*;

class Next extends Thread {
   int a, value, upto, quotient, i;
   
   void input() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a number.");
       upto = Integer.parseInt(br.readLine());
   }
   public void run(){
       a = 1;
       value = 1;
       quotient = upto / 10;
       for (i = 1; i <= quotient; i += 1) {
          try{
          Thread.sleep(2);
          System.out.printf("%3d ",value);
          } catch (Exception e){
          }
            value += 10;
            if (i == quotient) {
                i = 0;
                a += 1;
                //if (a == 11)
                   // break;
                value = a;
                System.out.print("\n");
            }
        }
   }
}
class seriesUserStop {
    public static void main(String[] args) throws IOException {
         Next net = new Next();
         net.input();
         net.start();
    }
}
