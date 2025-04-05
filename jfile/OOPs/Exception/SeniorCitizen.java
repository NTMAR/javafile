import java.io.*;

class SeniorCitizen {
    public static void seniorAge(int age) {
        if (age <= 60) {
            throw new ArithmeticException("You are not senior citizen");
        } else {
            System.out.println("You are senior citizen");
        }
    }

    public static void main(String[] args) {
        int x = 33;
        seniorAge(x);
    }
}