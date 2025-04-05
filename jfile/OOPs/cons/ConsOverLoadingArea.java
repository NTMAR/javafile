import java.io.*;

class Frank {
    int a, b, c;
    double r;

    Frank(int x) {
        a = x;
        r = 0;
    }

    Frank(int x, int y) {
        a = x;
        b = y;
        c = 0;
    }

    Frank(int x, int y, char p) {
        a = x;
        b = y;
        c = 0;
    }

    void CirArea() {
        r = 3.14 * a * a;
        System.out.println("Area of circle=" + r);
    }

    void rectArea() {
        c = a * b;
        System.out.println("Area of recatangle=" + c);
    }

    void triArea() {
        c = (a * b) / 2;
        System.out.println("Area of triangle=" + c);
    }
}

class ConsOverLoadingArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, r;
        System.out.println("Enter radious of circle");
        r = Integer.parseInt(br.readLine());
        Frank circle = new Frank(r);
        circle.CirArea();
        System.out.println("Enter len of recatangle");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter wid of recatangle");
        b = Integer.parseInt(br.readLine());
        Frank react = new Frank(a, b);
        react.rectArea();
        System.out.println("Enter height of triagle");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter base of triangle");
        b = Integer.parseInt(br.readLine());
        Frank tri = new Frank(a, b, 'a');
        tri.triArea();
    }
}