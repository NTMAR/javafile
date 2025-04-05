import java.io.*;

class Next {
    int a;

    Next(){
        a = 0;
    }
    /* Show Address of object in ram */
    void Show(){
        System.out.println("Reference of object="+this);
    }
}
class ReferObjNext{
    public static void main(String[] args)  throws IOException {
        Next net = new Next();
        net.Show();
        System.out.println("Reference of object="+net);
    }
}