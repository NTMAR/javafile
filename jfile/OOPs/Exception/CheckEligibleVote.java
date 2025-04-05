import java.io.*;

class CheckEligibleVote {
    public static void check(int age)  {
        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible for vote");
        }
    }

    public static void main(String[] args) {
        int x = 15;
        check(x);
    }
}