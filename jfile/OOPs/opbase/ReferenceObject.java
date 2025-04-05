import java.io.*;

class Next {
    int a;

    Next(){
        a = 0;
    }
}
class ReferenceObject{
    public static void main(String[] args)  throws IOException{
        Next net = new Next();
        System.out.println(net);
    }
}