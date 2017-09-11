/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catsandmouse;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (Math.abs(x - z) == Math.abs(y - z)) {
                System.out.println("Mouse C");
            } else if (Math.abs(x - z) < Math.abs(y - z)) {
                System.out.println("Cat A");
            } else {
                System.out.println("Cat B");
            }
        }
    }

}
