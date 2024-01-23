import java.util.Arrays;
public class Customer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        int[] coins = {1, 2, 5};
        int amount = 11;
        customer.isTransactionPossible(coins, amount);
    }
    public void isTransactionPossible(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        Arrays.sort(coins);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin: coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                } else {
                    break;
                }
            }
        }
        System.out.println(dp[amount] <= amount ? "Yes" : "No");
    }
}
