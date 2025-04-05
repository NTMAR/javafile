import java.io.*;
class nacciSeries{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a=0,b=1,c=0,output=0,elements=0;
        System.out.println(""+"Enter number of elements you want to print in fibonacci series.");
        elements=Integer.parseInt(br.readLine());
        System.out.println(""+"~~~~~~~~~~~~~~~~~~~~");
        while(c>=0){
            System.out.println(c);
            output +=1;
            if(output==elements)
            break;
            a=b;
            b=c;
            c=a+b;
        }
    }
}