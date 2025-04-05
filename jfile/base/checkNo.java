import java.io.*;

class checkNo
{
    public static void main(String[] args)
    throws IOException
     {
       char ch;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Character");
       ch=(char)br.read();
       
       if((int)ch>=48 && (int)ch<=57){
       System.out.println("IT IS NUMBER:--"+ch);
       }
       else if((int)ch>=65 && (int)ch<=90 ||(int)ch>=97 && (int)ch<=122 )
    System.out.println("IT IS ALPHABET:--"+ch);

    else{
    System.out.println ("IT IS SYMBOL "+ch);
    }
    
    }
}