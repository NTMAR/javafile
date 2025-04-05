import java.io.*;
class printPattern{
    public static void main(String[] args) {
        int i;
        for(i=1;i<=9;i+=1){
            System.out.print(i+"/");
            i+=1;
            System.out.print(i);
            if(i<9)
            System.out.print("+");
        }
    }
}
