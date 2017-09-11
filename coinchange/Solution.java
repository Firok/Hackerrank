/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for (int coins_i = 0; coins_i < m; coins_i++) {
            coins[coins_i] = in.nextInt();
        }

        System.out.println(makeChange(coins, n));
    }

    public static long makeChange(int[] coins, int money) {
        long[] result = new long[money + 1];
        result[0] = (long) 1;
        for (int coin : coins) {
            for (int j = coin; j < result.length; j++) {

                result[j] += result[j - coin];
            }
        }
        return result[money];
    }

}
