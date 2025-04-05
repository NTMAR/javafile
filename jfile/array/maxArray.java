import java.io.*;
class maxArray{
      public static void main(String[]args)
       throws IOException{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      int arr[]= new int[10];
     int a,max;
     max=0;
     for(a=0;a<10;a++){
       System.out.print("Enter=");
       arr[a]=Integer.parseInt(br.readLine());
     }
      for(a=0;a<10;a++)
      {
          if(arr[a]>max){
              max=arr[a];
           }
      }
     System.out.println(max);
 }
}