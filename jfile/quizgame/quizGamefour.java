import java.io.*;

class quizGamefour {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a;
        System.out.println(
                "                                                 ***********Hi...This is Quiz game***********");
        System.out.println("There are three levels.");
        System.out.println("Level 1 has 5 Question.");
        System.out.println("Level 2 has 3 Question.");
        System.out.println("Level 3 has 2 Question.");
        System.out.println("Get ready for quiz.");
        System.out.println("Enter 5 to start quiz.");
        a = Integer.parseInt(br.readLine());
        if (a == 5) {
            int aOne;
            System.out.println("                                                       +++++WELCOME+++++");
            System.out.println("                                                             LEVEL 1.");
            System.out.println("Q1.2+2 is");
            aOne = Integer.parseInt(br.readLine());
            if (aOne == 4) {

            } else {
                int aTwo;
                System.out.println("Q2.Square of 12 is ");
                aTwo = Integer.parseInt(br.readLine());
                if (aTwo == 144) {
                    int aThree;
                    System.out.println("Q3.Square root of 64");
                    aThree = Integer.parseInt(br.readLine());
                    if (aThree == 8) {
                        int aFour;
                        System.out.println("Q4.Multiplication of 2 and 6 is ");
                        aFour = Integer.parseInt(br.readLine());
                        if (aFour == 12) {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q2 and Q3 and Q4 and Q5 are Correct\nAnswer of Q1 is Wrong.");
                            else
                                System.out.println(
                                        "Answer of Q2 and Q3 and Q4 are Correct\nAnswer of Q1 and Q5 are Wrong.");
                        } else {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q2 and Q3 And Q5 are Correct\nAnswer of Q1 and Q4 are Wrong.");
                            else
                                System.out.println(
                                        "Answer of Q2 and Q3 are Correct\nAnswer of Q1 and Q4 and Q5 are Wrong.");
                        }
                    } else {
                        int aFour;
                        System.out.println("Q4.Multiplication of 2 and 6 is ");
                        aFour = Integer.parseInt(br.readLine());
                        if (aFour == 12) {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q4 and Q5 are Correct\nAnswer of Q1 and Q2 and Q3 are Wrong.");
                            else
                                System.out.println(
                                        "Answer of Q4 is Correct\nAnswer of Q1 and Q2 and Q3 and Q5 are Wrong.");
                        } else {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q1 and Q5 are Correct\nAnswer of Q2 and Q3 and Q4 are Wrong.");
                            else
                                System.out.println(
                                        "Answer of Q2 is Correct\nAnswer of Q1 and Q3 and Q4 and Q5 are Wrong.");
                        }

                    }
                } else {
                    int aThree;
                    System.out.println("Q3.Square root of 64");
                    aThree = Integer.parseInt(br.readLine());
                    if (aThree == 8) {
                        int aFour;
                        System.out.println("Q4.Multiplication of 2 and 6 is ");
                        aFour = Integer.parseInt(br.readLine());
                        if (aFour == 12) {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q3 and Q4 and Q5 are Correct\nAnswer of Q1 and Q2 are Wrong.");
                            else
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q5 are Wrong\nAnswer of Q3 and Q4 are Correct.");
                        } else {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q4 are Wrong\nAnswer of Q3 and Q5 are Correct.");
                            else
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q5 are Wrong\nAnswer of Q3 and Q4 are Correct.");
                        }
                    } else {
                        int aFour;
                        System.out.println("Q4.Multiplication of 2 and 6 is ");
                        aFour = Integer.parseInt(br.readLine());
                        if (aFour == 12) {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q3 and are Wrong\nAnswer of  Q4 and Q5 are Correct.");
                            else
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q3 and Q5 are Wrong\nAnswer of  Q4 is Correct.");
                        } else {
                            int aFive;
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            if (aFive == 9)
                                System.out.println(
                                        "Answer of Q1 and Q2 and Q3 and Q4 are Wrong\nAnswer of Q5 is Correct.");
                            else
                                System.out.println("Retry again.");
                        }
                    }
                }
            }

        } else
            System.out.println("You Entered other than 5.");
    }
}