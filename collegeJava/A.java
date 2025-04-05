class A{
    int i;
    A(int j){ //constructor
     i=j;
     System.out.println("What");
    }
   public static void main(String []args){
         A obj = new A(20);
         System.out.println(obj.i);
   }
 }