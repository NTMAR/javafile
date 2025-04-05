import java.io.*;
class printDivi{
    public static void main(String[] args) {
        int i;
            for(i=2;i<=10;i+=1){
            System.out.print("1/"+i);
            if(i<=9)
            System.out.print("+");
        }
    }
}
