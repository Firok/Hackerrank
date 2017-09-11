/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayleftrotation;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for (int i = 0; i < k; i++) {
            int dummy = a[0];
            for (int j = 1; j < n; j++) {
                a[j - 1] = a[j];
            }
            a[n - 1] = dummy;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }

        System.out.println();

    }

}
