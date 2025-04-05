import java.io.*;

class Next{
   int a, b, z;

   void input() throws IOException {
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("Enter 1st number");
      a = Integer.parseInt(br.readLine());
      System.out.println("Enter 2nd number");
      b = Integer.parseInt(br.readLine());
   }
}

class Add extends Next{
    void sum(){
        z = a + b;
        System.out.println("Sum is "+ z);
     }
}

class Sub extends Next{
   void minus(){
       z = a - b;
       System.out.println("Subtration is "+ z);
    }
}

class Mull extends Next{
  void multi(){
      z = a * b;
     System.out.println("Product is "+ z);
  }
}

class Divi extends Next{
  void divide(){
     z = a / b;
     System.out.println("Division is "+z);
  }
}

class Ream extends Next{
  void mod(){
     z = a % b;
     System.out.println("Remainder is "+z);
  }
}

class herarDMAS{
   public static void main(String [] args) throws IOException{
     Add plus = new Add();
     Sub min = new Sub();
     Mull pro = new Mull();
     Divi  dif = new Divi();
     Ream rem = new Ream();
     plus.input();
     plus.sum();
     min.input();
     min.minus();
     pro.input();
     pro.multi();
     dif.input();
     dif.divide();
     rem.input();
     rem.mod();
 }
}









