import java.io.*;
class AverageNext{
    public static void main(String []args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int total=0,i;
       int av[] = new int[5];
       double average=0;
       System.out.println("\t\t\tEnter 5 integer value");
       for(i=0;i<5;i++){
        System.out.print("Enter "+(i+1)+" integer value");
        av[i]=Integer.parseInt(br.readLine());
       }
       for(i=0;i<5;i++)
         total+=av[i];
       average=total/5;
      System.out.println("Average="+average);
   }
 }