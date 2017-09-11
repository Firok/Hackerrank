/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function

        if (x2 > x1 && v2 > v1) {
            return "NO";
        }

        int jump = 0;
        int s1 = x1, s2 = x2;
        while (s2 > s1) {
            s1 += v1;
            s2 += v2;
            jump++;

            if (s1 == s2) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
