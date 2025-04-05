import java.io.*;
class Next{
    int i;
    static int a = 1;

    int Act(int n){
        return (n);
    }
}
class metodSerFour{
    public static void main(String[] args) throws IOException{
        int i,a;
        Next net = new Next();
        for(i = 1; i < 51; i++){
           a = net.Act(i);
           System.out.println(a);
        }
        
    }
}