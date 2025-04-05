import java.io.*;
class seriesYesNoMtwo {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int s,e,ch;
        s=1;
        e=0;
        ch=1;
        while(ch==1){
            e+=10;
            while(s<=e){
                System.out.println(s);
                s+=1;
            }
             System.out.println("Enter 1 to Continue and Enter 2 Exit.");
             ch=Integer.parseInt(br.readLine());
        }
    }
}
