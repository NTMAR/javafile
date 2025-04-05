import java.io.*;

class quizGameTwo {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, aOne=0, aTwo, aThree, aFour, aFive;
        int aSix, aSeven, aEight;
        int aNine, aTen;
        int wrong = 0;
        System.out.println("\t\t\t\t\t" + "***********Hi...This is Quiz game***********");
        System.out.println("\t\t\t\t\t\t" + "There are three levels.");
        System.out.println("\t\t\t\t\t\t" + "Level 1 has 5 Question.");
        System.out.println("\t\t\t\t\t\t" + "Level 2 has 3 Question.");
        System.out.println("\t\t\t\t\t\t" + "Level 3 has 2 Question.");
        System.out.println("\t\t\t\t\t\t" + "Get ready for quiz.");
        System.out.println("" + "Enter 5 to start quiz.");
        try {
            a = Integer.parseInt(br.readLine());
        } catch (NumberFormatException ne) {
            System.out.println("Enter 5 only to start the game");
            a = Integer.parseInt(br.readLine());
        }
        if (a == 5) {
            System.out.println("\t\t\t\t\t" + "+++++WELCOME+++++");
            System.out.println("\t\t\t" + "You will Get 2 Chance If Answer is Wrong In Each Level.");
            System.out.println("\t\t\t\t\t\t" + "LEVEL 1.");
            try {
                try {
                    System.out.println("Q1.91 + 91 is");
                    aOne = Integer.parseInt(br.readLine());
                } catch (NumberFormatException ne) {
                    System.out.println("Q1.91 + 91 is");
                    aOne = Integer.parseInt(br.readLine());
                }
            } catch (NumberFormatException fe) {
                System.out.print("Better luck \nnext time");
                wrong = 2;
            }
            while (aOne != 182) {
                wrong = wrong + 1;
                if (wrong == 3)
                    break;
                System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                try {
                    try {
                        System.out.println("Q1.91 + 91 is");
                        aOne = Integer.parseInt(br.readLine());
                    } catch (NumberFormatException ne) {
                        System.out.println("Q1.91 + 91 is");
                        aOne = Integer.parseInt(br.readLine());
                    }
                } catch (NumberFormatException fe) {
                    System.out.print("Better luck \nnext time");
                }
            }
            if (wrong != 3) {
                System.out.println("Q2.Sqaure of 12 is ");
                aTwo = Integer.parseInt(br.readLine());
                while (aTwo != 144) {
                    wrong = wrong + 1;
                    if (wrong == 3)
                        break;
                    System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                    System.out.println("Q2.Sqaure of 12 is ");
                    aTwo = Integer.parseInt(br.readLine());
                }
                if (wrong != 3) {
                    System.out.println("Q3.Square root of 64");
                    aThree = Integer.parseInt(br.readLine());
                    while (aThree != 8) {
                        wrong = wrong + 1;
                        if (wrong == 3)
                            break;
                        System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                        System.out.println("Q3.Square root of 64");
                        aThree = Integer.parseInt(br.readLine());
                    }
                    if (wrong != 3) {
                        System.out.println("Q4.Multiplication of 2 and 6 is ");
                        aFour = Integer.parseInt(br.readLine());
                        while (aFour != 12) {
                            wrong = wrong + 1;
                            if (wrong == 3)
                                break;
                            System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                            System.out.println("Q4.Multiplication of 2 and 6 is ");
                            aFour = Integer.parseInt(br.readLine());
                        }
                        if (wrong != 3) {
                            System.out.println("Q5.Cube root of 729.");
                            aFive = Integer.parseInt(br.readLine());
                            while (aFive != 9) {
                                wrong = wrong + 1;
                                if (wrong == 3)
                                    break;
                                System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                System.out.println("Q5.Cube root of 729.");
                                aFive = Integer.parseInt(br.readLine());
                            }
                            /* level 2 start */
                            if (wrong != 3) {
                                wrong = 0;
                                System.out.println("\t\t\t\t\t\t" + "LEVEL 2.");
                                System.out.println("Q1.What is the Next prime number after 7 is");
                                aSix = Integer.parseInt(br.readLine());
                                while (aSix != 11) {
                                    wrong = wrong + 1;
                                    if (wrong == 3)
                                        break;
                                    System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                    System.out.println("Q1.What is the Next prime number after 7 is");
                                    aSix = Integer.parseInt(br.readLine());
                                }
                                if (wrong != 3) {
                                    System.out.println("Q2.How many Months make century");
                                    aSeven = Integer.parseInt(br.readLine());
                                    while (aSeven != 1200) {
                                        wrong = wrong + 1;
                                        if (wrong == 3)
                                            break;
                                        System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                        System.out.println("Q2.How many Months make century");
                                        aSeven = Integer.parseInt(br.readLine());
                                    }
                                    if (wrong != 3) {
                                        System.out.println("Q3.121 divided by 11");
                                        aEight = Integer.parseInt(br.readLine());
                                        while (aEight != 11) {
                                            wrong = wrong + 1;
                                            if (wrong == 3) {
                                                break;
                                            }
                                            System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                            System.out.println("Q3.121 divided by 11");
                                            aEight = Integer.parseInt(br.readLine());
                                        }
                                        /* level 3 */
                                        if (wrong != 3) {
                                            wrong = 0;
                                            System.out.println("\t\t\t\t\t\t" + "LEVEL 3.");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            while (aNine != 480) {
                                                wrong = wrong + 1;
                                                if (wrong == 3)
                                                    break;
                                                System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                                System.out.println("Q1.60 Times of 8.");
                                                aNine = Integer.parseInt(br.readLine());
                                            }
                                            if (wrong != 3) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                while (aTen != 10) {
                                                    wrong = wrong + 1;
                                                    if (wrong == 3)
                                                        break;
                                                    System.out.println("\t\t\t\t\t" + "You Give Wrong Answer.");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                }
                                                if (wrong != 3)
                                                    System.out.println("\t\t\t\t\t" + "You win the Quiz.");
                                                else
                                                    System.out.println("\t\t\t\t\t" + "You Cleared Level 1 and Level 2");
                                            } else
                                                System.out.println("\t\t\t\t\t" + "You Lost!!!");
                                        } else
                                            System.out.println("\t\t\t\t\t" + "You Lost!!!");
                                    } else
                                        System.out.println("\t\t\t\t\t" + "You Lost!!!");
                                } else
                                    System.out.println("\t\t\t\t\t" + "You Lost!!!");
                            } else
                                System.out.println("\t\t\t\t\t" + "You Lost!!!");
                        } else
                            System.out.println("\t\t\t\t\t" + "You Lost!!!");
                    } else
                        System.out.println("\t\t\t\t\t" + "You Lost!!!");
                } else
                    System.out.println("\t\t\t\t\t" + "You Lost!!!");
            } else
                System.out.println("\t\t\t\t\t" + "You Lost!!!");
        } else
            System.out.println("\t\t\t\t\t" + "You Enter Other than 5.");
    }
}
