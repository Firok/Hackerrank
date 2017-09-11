/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumsubarraysum;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static long maximumSum(long[] a, long m) {
        // Complete this function
        int n = a.length;
        long max = 0;

        TreeSet<Long> prefix = new TreeSet<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + a[i] % m) % m;
            SortedSet<Long> set = prefix.tailSet(sum + 1);
            Iterator<Long> itr = set.iterator();
            if (itr.hasNext()) {
                max = Math.max(max, (sum - itr.next() + m) % m);
            }

            max = Math.max(max, sum);
            prefix.add(sum);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextLong();
            }
            long result = maximumSum(a, m);
            System.out.println(result);
        }
        in.close();
    }

}
