/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingbook;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    static int solve(int n, int p) {
        // Complete this function

        int front = p / 2;

        int back;
        if (n % 2 == 0) {
            back = (n - p + 1) / 2;
        } else {
            back = (n - p) / 2;
        }

        return front < back ? front : back;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

}
