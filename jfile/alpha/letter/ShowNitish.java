import java.io.*;

class Nitish extends Thread {
    int i, j;

    void nLetter() throws Exception {
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j) {
                    Thread.sleep(500);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    void iLetter() throws Exception {
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 7 || j == 3) {
                    Thread.sleep(500);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    void tLetter() throws Exception {
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || j == 3) {
                    Thread.sleep(500);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    void sLetter() throws Exception {
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 5; j++) {
                if ((i == 1 && j > 1 && j < 5) || (i == 4 && j > 1 && j < 5) || (i == 7 && j > 1 && j < 5)
                        || (j == 1 && (i > 1 && i < 4)) || (j == 5 && (i > 4 && i < 7))) {
                    Thread.sleep(500);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    void hLetter() throws Exception {
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 4) {
                    Thread.sleep(500);
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}

class ShowNitish {
    public static void main(String[] args) throws Exception {
        Nitish nitish = new Nitish();
        nitish.nLetter();
        System.out.print("\n");
        nitish.iLetter();
        System.out.print("\n");
        nitish.tLetter();
        System.out.print("\n");
        nitish.iLetter();
        System.out.print("\n");
        nitish.sLetter();
        System.out.print("\n");
        nitish.hLetter();
    }
}