public class AdditionProgram {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        addition(num1, num2);
    }
    
    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
