import java.io.*;

class State {
    int sm, r, a;

    // @ overloading
    void disp(int no) {
        a = no;
        sm = 0;
        r = 0;
        while (no > 0) {
            r = no % 10;
            sm = (sm * 10) + r;
            no = no / 10;
        }
        if (a == sm)
            System.out.println(a+" is palindrome number");
        else 
           System.out.println(a+" is not palindrome number");
    }

    // @ overloading
    void disp(int No, char x) {
        a = No;
        sm = 0;
        r = 0;
        while (No > 0) {
            r = No % 10;
            sm = sm + (r * r * r);
            No = No / 10;
        }
        if (sm == a)
            System.out.println("Number is Armstrong = " + a);
        else 
            System.out.println(a+" is not Armstrong number");
    }

    // @ overloading
    void disp(char x,int n) {
        a = 1;
        r = 0;
        while (a <= n) {
            if (n % a == 0) {
                r = r + 1;
            }
            a = a + 1;
        }
        if (r == 2)
            System.out.println(n+" is Prime Number.");
        else 
          System.out.println(n+" is not prime number");
    }
}

class OverLoadArmPalinPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        State eat = new State();
        int x = 1, w = x, no;
        System.out.println("Enter any number");
        no = Integer.parseInt(br.readLine());
        System.out.println("________");
        eat.disp(no);
        eat.disp(no, 'A');
        eat.disp('A',no);
    }
}