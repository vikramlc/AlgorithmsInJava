public class Main {

    public static void main(String[] args) {
        System.out.println("Factorial of 7 is " + factorial(7));
    }

    private static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
