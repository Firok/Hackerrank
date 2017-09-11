/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangeadvertising;

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
        int like = 5 / 2;
        int res = 5 / 2;
        for (int i = 1; i < n; i++) {
            like *= 3;
            like = like / 2;
            res += like;
        }

        System.out.println(res);
    }
}
