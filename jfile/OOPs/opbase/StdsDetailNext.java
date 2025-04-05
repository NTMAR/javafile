import java.io.*;

class Student {
   int roll;
   String name;
   static String clgNam = "Snu";

   Student(int roll, String name) {
      this.roll = roll;
      this.name = name;
   }

   void disPlay() {
      System.out.println("Roll no = " + roll + " Name = " + name + " College Name = " + clgNam);
   }
}

class StdsDetailNext {
   public static void main(String[] args) throws IOException {
      Student std1 = new Student(1, "Sonu");
      Student std2 = new Student(2, "Harsh");
      Student std3 = new Student(3, "Abhi");
      Student std4 = new Student(4, "Nitish");
      Student std5 = new Student(5, "Piyush");
      std1.disPlay();
      std2.disPlay();
      std3.disPlay();
      std4.disPlay();
      std5.disPlay();

   }
}