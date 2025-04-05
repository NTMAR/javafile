import java.io.*;
class seriesYesNoTwo {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int s,e,ch;
        e=0;
        s=1;
        for(ch=1;ch==1;){
            e+=10;
            for(;s<=e;s+=1){
                System.out.println(s);
            }
             System.out.println("Enter 1 to Continue and Enter 2 Exit.");
             ch=Integer.parseInt(br.readLine());
        }
        
    }
}
