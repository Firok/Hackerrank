/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lonelyinteger;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        System.out.println(lonelyInteger(a));
    }

    public static int lonelyInteger(int[] a) {
        int result = 0;
        for (int i : a) {
            result ^= i;
        }
        return result;
    }

}
