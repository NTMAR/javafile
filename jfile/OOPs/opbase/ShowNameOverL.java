import java.io.*;
class Next {
    
       void disp(int x){
           System.out.println("Nitish kumar");
       }
       
       void disp(char x){
            System.out.println("name");
       }
}
class ShowNameOverL{
    public static void main(String [] args) {
      Next net = new Next();
      net.disp('A');
    }
}