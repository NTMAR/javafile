import java.io.*;
class Next {
    int a,b,c;
     
    void Act(){
        a = 1;
        b = 2;
        System.out.print(a+"\n"+b+"\n");
        c=a+b;
        while (c <= 100) {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
class nacciMethodOne{
    public static void main(String[] args) {
        Next net = new Next();
         net.Act();
    }
}