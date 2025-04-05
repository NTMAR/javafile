import java.io.*;

class nacciseriesNext {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a = 0, b = 0, c=0, upto = 0, diff;
        System.out.println("" + "Enter Two Consecutive number to create or print fibonacci series.");
        System.out.print("" + "1st=");
        a = Integer.parseInt(br.readLine());
        System.out.print("" + "2nd=");
        b = Integer.parseInt(br.readLine());
        diff=b-a;
        if (diff == 1 || diff == -1) {
            if (a > b) {
                a = a + b;
                b = a - b;
                a = a - b;
            }
            System.out.println("" + "Enter number upto where you want to print the series.");
            upto = Integer.parseInt(br.readLine());
            if (upto > b) {
              System.out.print(a+"\n"+b+"\n");
                c=a+b;
                while (c <= upto) {
                    System.out.println(c);
                    a=b;
                    b=c;
                    c=a+b;

                }
            } else
                System.out.println("" + "Not possible.");
        }
        else 
        System.out.println("" + "You not enter consecutive number.");
    
    }
}
