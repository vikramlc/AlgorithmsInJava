package CarSell;

import java.util.Arrays;
import java.util.Scanner;

public class CarSell {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        try {
            int t = scanner.nextInt();
            for(int tt=0; tt<t; tt++) {
                int sum = 0;
                int n = scanner.nextInt();
                int prices[] = new int[n];
                for(int i=0; i<n; i++) {
                    prices[i] = scanner.nextInt();
                }
                Arrays.sort(prices);
                int len = prices.length;
                for(int j=len-1; j>=0; j--) {
                    int diff = prices[j] - (len - 1 - j);
                    if(prices[j] > 0 && diff > 0) {
                        sum = (sum + diff) % 1000000007;
                    }
                }

                System.out.println(sum);
            }
        } catch(Exception e) {
            return;
        }
    }
}
