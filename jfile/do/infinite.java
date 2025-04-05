import java.io.*;
class infinite{
    public static void main(String []args)
        throws IOException{
       int no;
       no=1;
       while(no>0){
        System.out.println(no);
       if (no==10) 
           break;      
        no=no+1;
      }    
    }
  }