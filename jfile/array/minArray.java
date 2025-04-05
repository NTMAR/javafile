import java.io.*;
class minArray{
      public static void main(String[]args)
       throws IOException{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      int arr[]= new int[10];
     int a,min;
     for(a=0;a<10;a++){
       System.out.print("Enter=");
       arr[a]=Integer.parseInt(br.readLine());
     }
      min=arr[0];
      for(a=0;a<10;a++)
      {
          if(arr[a]<min){
              min=arr[a];
           }
      }
     System.out.println(min);
 }
}