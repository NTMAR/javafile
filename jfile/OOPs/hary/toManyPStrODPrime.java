import java.io.*;

class Next {
    int z;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number");
        z = Integer.parseInt(br.readLine());
    }
}

class Pos extends Next {
    void isPos() {
        if (z > 0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");
    }
}

class OddEven extends Next {
    void isEnOd() {
        if (z % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

class Prime extends Next {
    int a;

    void isPri() {
        a = 2;
        while (a < z) {
            if (z % a == 0) {
                break;
            }
            a += 1;
        }
        if (a == z)
            System.out.println("Prime Number.");
        else
            System.out.println("Not Prime Number.");
    }
}

class Arm extends Next {
    int sm, rm, a;

    void isAmStog() {
        a = z;
        if (z > 99 && z < 1000) {
            while (z > 0) {
                rm = z % 10;
                sm = sm + (rm * rm * rm);
                z = z / 10;
            }
            if (sm == a)
                System.out.println(a + " is ArmStrong nuumber");
            else
                System.out.println(a + " is not ArmStrong number");
        } else
            System.out.println("Enter 3 digit number");
    }
}

class Palin extends Next {
    int bc, digit, rv;

    void isPlinDm() {
        bc = z;
        while (z > 0) {
            digit = z % 10;
            rv = (rv * 10) + digit;
            z = z / 10;
        }
        if (bc == rv)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not Palindrome.");
    }
}

class toManyPStrODPrime {
    public static void main(String[] args) throws IOException {
        Pos ptive = new Pos();
        OddEven ev = new OddEven();
        Prime me = new Prime();
        Arm fan = new Arm();
        Palin lin = new Palin();
        ptive.input();
        ptive.isPos();
        ev.input();
        ev.isEnOd();
        me.input();
        me.isPri();
        fan.input();
        fan.isAmStog();
        lin.input();
        lin.isPlinDm();
    }
}
