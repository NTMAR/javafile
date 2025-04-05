import java.io.*;
class CountAry{
    public static void main(String[]args)
      throws IOException{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      int arr[]=new int[10];
      int i,count=0,data;
      for(i=0;i<10;i++)
     {
        System.out.print("Enter "+(i+1)+" element=");
        arr[i]=Integer.parseInt(br.readLine());
     }
     System.out.println("Stored Elements in array");
     for(i=0;i<10;i++)
      System.out.println(arr[i]);
     System.out.print("Enter any number=");
       data=Integer.parseInt(br.readLine());
     for(i=0;i<10;i++)
     {
         if(arr[i]==data)
            count+=1;
     } 
     System.out.println(data+" is present "+count+" times");   
   }
 }