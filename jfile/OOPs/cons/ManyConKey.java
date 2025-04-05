import java.io.*;
class Next{
    int a,b,c,d,e;

    Next(){
        a = 0;
        b = 0;
        c = 0;
        d = 400;
        e = 4500;
    }

    Next(int x,int y,int z){
        /* this keyword(from no parametrized constructor) intialize the other value here d and e */
        this ();
        a = x;
        b = y;
        c = z;
    }
}

class ManyConKey{
    public static void main(String[] args) throws IOException {
        Next obj = new Next();
        Next obj1 = new Next(10,20,30);
        System.out.println("d="+obj1.d+"\ne="+obj1.e);
    }
}