/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedbrackets;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '[') {
                s.push(']');
            } else if (c == '{') {
                s.push('}');
            } else if (c == '(') {
                s.push(')');
            } else {
                if (s.empty() || c != s.peek()) {
                    return false;
                }
                s.pop();
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }

}
