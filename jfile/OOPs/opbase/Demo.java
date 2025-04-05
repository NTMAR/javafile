import java.io.*;

class Next {
   char sas[] = new char[50];
   int i, x, y, cnt = 0, wrd = 1, ece, vu = 0, cons, m, inp, alp = 0;

   void Input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a sentence");
      for (i = 0; i < 50; i++) {
         sas[i] = (char) br.read();
         if (sas[i] == '0')
            break;
      }
      do {
         Ask();
      } while (inp == 0);
   }

   void Ask() throws IOException {
      BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("1.Show Sentence" + "\n2.Reverse Sentence" + "\n3.Total words"
            + "\n4.Present Consonant and Vowels" + "\n5.Symbol present" + "\nEnter your choice");
      ece = Integer.parseInt(BR.readLine());
      switch (ece) {
         case 1:
            Disp();
            break;
         case 2:
            reverse();
            break;
         case 3:
            Tword();
            break;
         case 4:
            vowel();
            break;
         case 5:
            symb();
            break;
         default:
            System.out.println("Enter Wrong number");
      }
      System.out.println("Enter 0 for Continue and 1 for Exit");
      inp = Integer.parseInt(BR.readLine());
   }

   void Disp() {
      for (i = 0; i < 50; i++) {
         System.out.print(sas[i]);
         if (sas[i] == '0')
            break;
      }
      System.out.print("\n");
   }

   void reverse() {
      for (i = 0; i < 50; i++) {
         if (sas[i] == '0')
            break;
         cnt += 1;
      }
      for (x = cnt; x >= 0; x--)
         System.out.print(sas[x]);
      System.out.print("\n");
   }

   void Tword() {
      for (x = 0; x < 50; x++) {
         if (sas[x] == '0')
            break;
         if (sas[x] == (char) 32)
            wrd += 1;
      }
      System.out.println("Word=" + wrd);
   }

   void vowel() {
      for (m = 0; m < 50; m++) {
         if ((int) sas[m] >= 65 && (int) sas[m] <= 90 || (int) sas[m] >= 97 && (int) sas[m] <= 122)
            alp += 1;
      }
      for (y = 0; y < 50; y++) {
         switch (sas[y]) {
            case 'a':
               vu += 1;
               break;
            case 'A':
               vu += 1;
               break;
            case 'e':
               vu += 1;
               break;
            case 'E':
               vu += 1;
               break;
            case 'i':
               vu += 1;
               break;
            case 'I':
               vu += 1;
               break;
            case 'o':
               vu += 1;
               break;
            case 'O':
               vu += 1;
               break;
            case 'u':
               vu += 1;
               break;
            case 'U':
               vu += 1;
               break;
            default:
               System.out.print("");
         }
         if (sas[y] == '0')
            break;
      }
      System.out.println("Vowels are=" + vu);
      cons = alp - vu;
      System.out.println("Consontent=" + cons);

   }

   void symb() {
      for (y = 0; y < 50; y++) {
         if ((int) sas[y] >= 65 && (int) sas[y] <= 90 || (int) sas[y] >= 97 && (int) sas[y] <= 122)
            System.out.print("");
         else
            System.out.print(sas[y]);
         if (sas[y] == '0')
            break;
      }
      System.out.print("\n");
   }
}

class Demo {
   public static void main(String[] args) throws IOException {
      Next net = new Next();
      net.Input();
   }
}