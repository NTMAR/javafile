import java.io.*;
class quizGameThird{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a;
        System.out.println("                                                 ***********Hi...This is Quiz game***********");
        System.out.println("There are three levels.");
        System.out.println("Level 1 has 5 Question.");
        System.out.println("Level 2 has 3 Question.");
        System.out.println("Level 3 has 2 Question.");
        System.out.println("Get ready for quiz.");
        System.out.println("Enter 5 to start quiz.");
        a=Integer.parseInt(br.readLine());
        if(a==5){
            int aOne,aTwo,aThree,aFour,aFive;
            System.out.println("                                                       +++++WELCOME+++++");
            System.out.println("                                                             LEVEL 1.");
            System.out.println("Q1.2+2 is");
            aOne=Integer.parseInt(br.readLine());
            System.out.println("Q2.Square of 12 is ");
            aTwo=Integer.parseInt(br.readLine());
            System.out.println("Q3.Square root of 64");
            aThree=Integer.parseInt(br.readLine());
            System.out.println("Q4.Product of 2 and 6 is ");
            aFour=Integer.parseInt(br.readLine());
            System.out.println("Q5.Cube root of 729.");
            aFive=Integer.parseInt(br.readLine());
            if(aOne==4&&aTwo==144&&aThree==8&&aFour==12&&aFive==9){
                int aSix;
                  System.out.println("                                                Congrats You Entered In");
                  System.out.println("                                                       LEVEL 2.");
                  System.out.println("Q6.What is the Next prime number after 7 is");
                  aSix=Integer.parseInt(br.readLine());
                  if(aSix==11){
                  int aSeven;  
                  System.out.println("Q7.How many Years in a Decade.");
                  aSeven=Integer.parseInt(br.readLine());
                       if(aSeven==10){
                             int aEight;
                             System.out.println("Q8.121 divided by 11");
                             aEight=Integer.parseInt(br.readLine());
                            if(aEight==11){
                                int aNine;
                                System.out.println("                                                Congrats You Entered In");
                                System.out.println("                                                     LEVEL 3.");
                                System.out.println("Q9.60 Times of 8.");
                                aNine=Integer.parseInt(br.readLine());
                                if(aNine==480){
                                    int aTen;
                                    System.out.println("Q10.How many Months make century.");
                                    aTen=Integer.parseInt(br.readLine());
                                    if(aTen==1200)
                                        System.out.println("                                             You win The Quiz.");
                                    else
                                    System.out.println("You are so close to won!!Best of Luck for Next Tume.\nQ10:-Answer is wrong");
                                }
                                else{
                                    int aTen;
                                    System.out.println("Q10.How many Months make century.");
                                    aTen=Integer.parseInt(br.readLine());
                                    if(aTen==1200)
                                    System.out.println("You are so close to won!!Best of Luck for Next Tume.\nQ9:-Answer is wrong");
                                    else
                                    System.out.println("You Cleared level 1 and 2!!Best Luck for Next Time.");
                                }
                            }
                            
                            else 
                                System.out.println("You Give Correct Answer of Q6 and Q7\nYou Clered Level 1.");
                        }
                      else {
                        int aEight;
                        System.out.println("Q8.121 divided by 11");
                        aEight=Integer.parseInt(br.readLine());
                           if(aEight==11)
                             System.out.println("Answer of Q6 and Q8 are Correct.\nYou Clered Level 1.");
                           else 
                             System.out.println("You Give Correct Answer of Q6\nYou Clered Level 1.");
                    }
                  }
                    else {
                    int aSeven;  
                    System.out.println("Q7.How many Years in a Decade.");
                    aSeven=Integer.parseInt(br.readLine());
                    if(aSeven==10){
                        int aEight;
                        System.out.println("Q8.121 divided by 11");
                        aEight=Integer.parseInt(br.readLine());
                         if(aEight==11)
                            System.out.println("Answer of Q7 and Q8 are correct.\nYou Clered Level 1.");
                         else 
                         System.out.println("You Give Correct Answer of Q7\nYou Clered Level 1.");
                    }
                    else {
                        int aEight;
                        System.out.println("Q8.121 divided by 11");
                        aEight=Integer.parseInt(br.readLine());
                        if(aEight==11)
                            System.out.println("You Give Correct answer of Q8\nYou Clered Level 1.");
                        else 
                        System.out.println("All anwer are Wrong!!Best of Luck for Next Time.\nYou Clered Level 1 only.");
                    }
                }     
            }
            else 
            System.out.println("Sorry! Retry again.");
        }
        else 
        System.out.println("You entered other than 5.");   
    }     
}

       