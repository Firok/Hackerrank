/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savetheprisoner;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static int saveThePrisoner(int n, int m, int s) {
        // Complete this function
        int result = m + s - 1;
        result = result % n == 0 ? n : result % n;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }

}
