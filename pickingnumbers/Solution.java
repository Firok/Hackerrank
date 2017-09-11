/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickingnumbers;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] b = new int[n * 2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k = 2 * i;
                if (a[i] == a[j] || a[i] == a[j] + 1) {
                    b[k]++;
                }
                if (a[i] == a[j] || a[i] == a[j] - 1) {
                    b[k + 1]++;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if (b[i] > b[0]) {
                b[0] = b[i];
            }
        }
        System.out.println(b[0]);
    }

}
