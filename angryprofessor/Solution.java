/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;

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
            int K = scanner.nextInt();
            int count = 0;
            for (int k = 0; k < N; k++) {
                int t = scanner.nextInt();
                if (t <= 0) {
                    count++;
                }
            }
            if (count >= K) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
