import java.io.*;
class factorize{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);
        int no,d;
        d=2;
        System.out.println("Enter any number.");
        no=Integer.parseInt(br.readLine());
        System.out.println("Prime factorization are.");
        while(no>1){
            if(no%d==0){
                System.out.print(d);
                no=no/d;
                if(d<=no)
                System.out.print(""+"x");
                d=2;
            }
            else 
            d=d+1;
        }
    }
}
