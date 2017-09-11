/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingvalleys;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = scanner.next();

        int level = 0;
        int valley = 0;

        char dummy = 'U';
        boolean down = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'U') {
                level += 1;
            } else if (c == 'D') {
                level -= 1;
            }

            if (!down && level < 0) {
                valley += 1;
                down = true;
            }

            if (level >= 0) {
                down = false;
            }
        }

        System.out.println(valley);
    }

}
