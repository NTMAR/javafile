import java.io.*;
class Next{
  double Si;
   void Action(int T,double P,double R){
   Si=(P*R*T)/100;
   System.out.println("Simple Interest="+Si);
   }
}
class simpleMain{
  public static void main(String[]args) throws IOException{
   BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
   Next net = new Next();
   int x;
   double y,z;
    System.out.println("Enter principal Amount");
    y=Double.parseDouble(br.readLine());
    System.out.println("Enter rate");
    z=Double.parseDouble(br.readLine());
    System.out.println("Enter time");
    x=Integer.parseInt(br.readLine());
    net.Action(x,y,z);
   }
}