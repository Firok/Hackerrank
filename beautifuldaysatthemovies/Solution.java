/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifuldaysatthemovies;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        for (int l = i; l <= j; l++) {
            String s1 = String.valueOf(l);
            String s2 = new StringBuilder(s1).reverse().toString();
            int rev = Integer.parseInt(s2);
            int abs = Math.abs(l - rev);

            if (abs % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
