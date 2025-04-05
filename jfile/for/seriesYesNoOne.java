import java.io.*;

class seriesYesNoOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, upto, decision = 0;
        upto = 10;
        for (a = 1; a <= upto; a += 1) {
            System.out.println(a);
            if (a == upto) {
                System.out.println("" + "Enter 1 to continue and Enter 2 to Exit.");
                decision = Integer.parseInt(br.readLine());
                if (decision == 2)
                    break;
                else
                    upto += 10;
            }
        }
    }

}
