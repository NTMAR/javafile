import java.io.*;

class Store {
    int posv;
    char sym;
    double dec;
}
class CopyVal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Store Org = new Store();
        Store Copy = new Store();
        System.out.println("Enter decimal value");
        Org.dec = Double.parseDouble(br.readLine());
        System.out.println("Enter integer value");
        Org.posv = Integer.parseInt(br.readLine());
        System.out.println("Enter one character");
        Org.sym = (char) br.read();
        Copy.dec = Org.dec;
        Copy.posv = Org.posv;
        Copy.sym = Org.sym;
        /* Printing values of 'Org' object */
        System.out.println("Details of 1st object");
        System.out.println("Integer=" + Org.posv + "\nDecimal=" + Org.dec + "\nCharacter=" + Org.sym);
        /* Printing values of 'Copy' object */
        System.out.println("Details of 2nd Object and Copied values  of 1st Object");
        System.out.println("Integer=" + Copy.posv + "\nDecimal=" + Copy.dec + "\nCharacter=" + Copy.sym);
    }
}