import java.io.*;

class Args{
 public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number");
    int y = Integer.parseInt(br.readLine());
    System.out.println("Number of arguments:"+args.length);
    System.out.println("Arguments:");
    for(String arg : args){
       System.out.println(args);
    }
    
    if(args.length > 0){
      int x = Integer.parseInt(args[0]);
      System.out.println("Value multiplied by 2:"+(x * 2));
    }
  }
}