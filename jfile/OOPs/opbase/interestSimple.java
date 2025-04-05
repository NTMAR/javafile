import java.io.*;

class Siple{
   static double interest(double p,double t,double r){
      return (p * r * t  / 100);
    }
}

class interestSimple{
  public static void main(String [] args) throws IOException{
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     System.out.println("Enter principle amount");
     double x = Double.parseDouble(br.readLine());
     System.out.println("Enter time");
     double y = Double.parseDouble(br.readLine());
     System.out.println("Enter rate");
     double z = Double.parseDouble(br.readLine());
     System.out.println("Simple interest is "+ Siple.interest(x,y,z));
  }
}