import java.io.*;
class Next{
  char x;
  void Input() throws IOException{
    BufferedReader $read = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Enter any char or number");
    char x = (char)$read.read(); 
      if((int)x >= 65 && (int)x <= 90 || (int)x >= 97 && (int)x <= 122)
        System.out.println("It is aphabet");
      else
      System.out.println("It is number");
    }
}
class AlphaMain{
    public static void main(String [] args) throws IOException{
     Next net = new Next();
      net.Input();
 }
}
