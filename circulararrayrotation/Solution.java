/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayrotation;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static List<Integer> rotate(int[] arr, int k) {
        List<Integer> a = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.rotate(a, k);
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        List<Integer> list = rotate(a, k);
        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();
            System.out.println(list.get(m));
        }
    }

}
