/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairs;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static long countingPairs(Integer[] arr, int k) {
        long count = 0;

        Set<Integer> numbers = Arrays.stream(arr).collect(Collectors.toSet());
        count = numbers.stream().filter(n -> numbers.contains(n - k)).count();
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(countingPairs(arr, K));

    }

}
