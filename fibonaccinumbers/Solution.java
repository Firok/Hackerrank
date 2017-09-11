/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccinumbers;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static int fibonacci(int n) {

        // Complete the function.
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }

}
