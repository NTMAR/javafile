import java.io.*;

class Next {
    char arr[];
    int k;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new char[10];
        System.out.println("Enter xender Write boy for 'b' and girls for 'g'");
        for (k = 0; k < 10; k++) {
            arr[k] = (char) br.read();
        }
    }
}

class Male extends Next {
    int by, p;

    void bnum() {
        for (p = 0; p < 10; p++) {
            if (arr[p] == (char) 98 || arr[p] == (char) 66)
                by++;
        }
        System.out.println("Numb of boys " + by);
    }
}

class Female extends Next {
    int rl, j;

    void gnum() {
        for (j = 0; j < 10; j++) {
            if (arr[j] == (char) 103 || arr[j] == (char) 71) // here 103(ASCII of small g ) and here 71(ASCII of capital// G)
                rl++;
        }
        System.out.println("Numb of Girl " + rl);
    }
}

class ContBoyGirl {
    public static void main(String[] args) throws IOException {
        Male le = new Male();
        Female fe = new Female();
        le.input();
        le.bnum();
        fe.input();
        fe.gnum();
    }
}