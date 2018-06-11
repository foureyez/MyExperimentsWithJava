package com.problem.array;

public class MinCoins {
    public static void main(String[] args) {
        int coins[] = {9, 6, 5, 1};
        int amount = 11;

        findMinCoinsRequired(coins, amount);
        findMinCoinsRequired1(coins, amount);
    }

    private static void findMinCoinsRequired(int[] coins, int amount) {
        int sum = 0;
        int coinCount = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int j = i;
            int subCoinCount = 1;
            sum = coins[i];

            while (sum != amount) {
                if (sum + coins[j] > amount) {
                    j++;
                } else {
                    sum += coins[j];
                    subCoinCount++;
                }
            }

            if (subCoinCount < coinCount) {
                coinCount = subCoinCount;
            }
        }

        System.out.println(coinCount);
    }

    private static void findMinCoinsRequired1(int[] coins, int amount) {
            
    }
}
