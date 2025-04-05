import java.io.*;
class table{
    public static void main(String[] args)
    throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n,a;
        System.out.println("Enter any number.");
        n=Integer.parseInt(br.readLine());
        for(a=1;a<=10;a+=1)
            System.out.println(n+"x"+a+"="+n*a); 
    }
}