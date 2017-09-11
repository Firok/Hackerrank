/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utopiantree;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int height = 0;
            if (N <= 0) {
                System.out.println(1);
                continue;
            }

            for (int j = 0; j <= N; j++) {
                if (j % 2 == 0) {
                    height += 1;
                } else {
                    height *= 2;
                }
            }
            System.out.println(height);
        }
    }
}
