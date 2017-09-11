/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandarray;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static String solve(int[] a) {
        // Complete this function

        if (a.length == 1) {
            return "YES";
        }

        int sum = 0, sumLeft = 0, sumRight = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                continue;
            }

            sumLeft += a[i - 1];

            sumRight = sum - (a[i] + sumLeft);

            if (sumLeft == sumRight) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int a0 = 0; a0 < T; a0++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }

}
