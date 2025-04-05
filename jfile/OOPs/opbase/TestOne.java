import java.io.*;
class ShowOne{
        int a;
        char b;
        double c;
        String d;
}
class TestOne{
   public static void main(String[] args){
      Show obj= new Show();
      System.out.println("Before assigning value");
      System.out.println("a="+obj.a+"\nb="+obj.b+"\nc="+obj.c+"\nd="+obj.d);
      obj.a=23;
      obj.b='a';
      obj.c=12.21;
      obj.d="NITISH";
      System.out.println("After assigning value");
      System.out.println("a="+obj.a+"\nb="+obj.b+"\nc="+obj.c+"\nd="+obj.d);
   }
}