import java.io.*;

class Next {
     char arr[];
     int i, count;

     void name() throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          arr = new char[20];
          count = 0;
          System.out.println("\tEnter your name\n" + "Enter first name");
          for (i = 0; i < 20; i++) {
               arr[i] = (char) br.read();
               count++;
               if (arr[i] == (char) 32)
                    break;
          }
     }
}

class bubble extends Next {
     int p;

     void last() throws IOException {
          BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter last name");
          for (p = count; p < 20; p++) {
               arr[p] = (char) b.read();
               if (arr[p] == (char) 13)
                    break;
          }
     }
}

class Myname extends bubble {
     int k;

     void userName() {
          for (k = 0; k < 20; k++) {
               System.out.print(arr[k]);
          }
     }
}

class NmeUser {
     public static void main(String[] args) throws IOException {
          Myname bet = new Myname();
          bet.name();
          bet.last();
          bet.userName();
     }
}
