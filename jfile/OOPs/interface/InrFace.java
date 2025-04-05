import java.io.*;

interface Hello {
   public abstract void show();
}

class Check implements Hello {
   public void show() {
      System.out.println("Hello World");
   }
}

class InrFace {
   public static void main(String[] args) throws IOException {
      Check obj = new Check();
      obj.show();
   }
}