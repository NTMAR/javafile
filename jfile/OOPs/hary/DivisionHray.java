import java.io.*;

class Next {
    int a, b;

    void Input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd number");
        b = Integer.parseInt(br.readLine());
    }
}

class ev extends Next {
    int c;

    void Perform() {
        c = a / b;
        System.out.println("The Division is = " + c);
    }
}

class DivisionHray {
    public static void main(String[] arc) throws IOException {
        ev vet = new ev();
        vet.Input();
        vet.Perform();
    }
}