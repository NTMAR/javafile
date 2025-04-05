import java.io.*;
class CntEvnArray{
       public static void main(String[]args)
        throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int arr[] = new int[10];
          int i,count=0;
          System.out.println("\t\t\tEnter 10 elements");
          for(i=0;i<10;i++)
          {    
              System.out.print("Enter "+i+" index element=");
              arr[i]=Integer.parseInt(br.readLine());
          }
          System.out.println("Numbers of Even number.");
          for(i=0;i<10;i++)
          {
               if(arr[i]%2==0)
                  count+=1;  
          } 
          System.out.println(count); 
       }
    }