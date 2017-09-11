/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivestaircase;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    private static Map<Integer, Integer> map = new HashMap();

    private static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (!map.containsKey(n)) {
            int count = staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
            map.put(n, count);
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int a0 = 0; a0 < s; a0++) {
            int n = in.nextInt();

            System.out.println(staircase(n));
        }
    }

}
