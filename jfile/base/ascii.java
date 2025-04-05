import java.io.*;
class ascii{
    public static void main(String[] args) 
    throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int start,end;
        System.out.print("Start no=");
        start=Integer.parseInt(br.readLine());
        System.out.print("End=");
        end=Integer.parseInt(br.readLine());
        System.out.println("ASCII\t\t\t"+"CHARACTER");
        if(start>end){
            while(end<=start){
               System.out.println(end+"\t\t\t"+(char)end); 
               end=end+1;
            }
        }
       // else 
        while(end>=start){
            System.out.println(start+"\t\t\t"+(char)start); 
            start=start+1;
         }
        
    }
}