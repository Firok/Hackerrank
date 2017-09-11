/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleandorange;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static int numApple(int[] apple, int s, int t, int a) {
        int count = 0;
        for (int i = 0; i < apple.length; i++) {
            int add = a + apple[i];

            if (add >= s && add <= t) {
                count++;
            }
        }

        return count;
    }

    static int numOrange(int[] orange, int s, int t, int b) {
        int count = 0;
        for (int i = 0; i < orange.length; i++) {
            int add = b + orange[i];

            if (add >= s && add <= t) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        System.out.println(numApple(apple, s, t, a));
        System.out.println(numOrange(orange, s, t, b));
    }

}
