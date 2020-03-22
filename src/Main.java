import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        System.out.println("Fibonacci sum of 6 is " + fibonacci(Integer.valueOf(number)));
    }

    private static long fibonacci(long n) {
        long sum = 0;
        // Recursion
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);

        /*if(n == 0 || n == 1) {
            return n;
        }

        return (n-1) + (n-2);*/
    }
}
