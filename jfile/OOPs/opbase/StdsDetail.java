import java.io.*;

class Student {
   int roll;
   String name;
   String clgNam;

   Student(int roll, String name, String clgNam) {
      this.roll = roll;
      this.name = name;
      this.clgNam = clgNam;
   }

   void disPlay() {
      System.out.println("Roll no = " + roll + "Name = " + name + " College Name = " + clgNam);
   }
}

class StdsDetail {
   public static void main(String[] args) throws IOException {
      Student std1 = new Student(1, "Sonu", "Snu");
      Student std2 = new Student(2, "Harsh", "Snu");
      Student std3 = new Student(3, "Abhi", "Snu");
      Student std4 = new Student(4, "Nitish", "Snu");
      Student std5 = new Student(5, "Piyush", "Snu");
      std1.disPlay();
      std2.disPlay();
      std3.disPlay();
      std4.disPlay();
      std5.disPlay();

   }
}