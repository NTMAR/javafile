import java.io.*;
class NextCal{
    int no;
         void input() throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter any number");
             no=Integer.parseInt(br.readLine());
         }
         void Area(){
           System.out.println("Area of circle="+(3.14*no*no));
    
         }
           void Square(){
           System.out.println("Square of number="+(no*no));
        
         }
           void Cube(){
           System.out.println("Cube of number="+(no*no*no));
         }   
}
class MainSquareNext{
      public static void main(String[]args) throws IOException{
        NextCal ect = new NextCal();
         ect.input();
         ect.Area();
         ect.Square();
         ect.Cube();
     }
}