import java.util.Scanner;
public class Main
{
    static int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount you wish to see the possible combination of coins of: ");
        double totalAmount = sc.nextDouble();
        totalAmount*=100;
        int result = countWays(totalAmount, 0);
        System.out.println("Total number of ways to make " + totalAmount/100 + " euros: " + result);
    }
    static int countWays(double amount, int coinIndex) {
        if (amount == 0) {
            return 1;
        }  
        if (amount < 0 || coinIndex >= coins.length) {
            return 0;
        }
        return countWays(amount - coins[coinIndex], coinIndex)
                + countWays(amount, coinIndex + 1);
    }
}