import java.io.*;
class bestGreater{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,b,c;
        System.out.println("Enter three number. ");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
      if(a>b){
              if(a>c)
                System.out.println(a+" is a greater.");
              else
                System.out.println(c+" is a greater.");
            }   
        else{
            if(b>c)
                System.out.println(b+" is a greater.");
            else
                System.out.println(c+" is greater."); 
        }
   }
}