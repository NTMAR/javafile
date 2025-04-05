import java.io.*;
class CountAdAry{
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
           {
            System.out.println(i+" Index= "+arr[i]);
            count+=1;
           }
     } 
     if(count==0)
       System.out.println("Data not found");
     else
     System.out.println(data+" is present "+count+" times");   
   }
 }