/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumbers;

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

        SortedMap<Integer, Integer> firstMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();

            if (firstMap.containsKey(key)) {
                firstMap.put(key, firstMap.get(key) + 1);
            } else {
                firstMap.put(key, 1);
            }
        }

        int m = scanner.nextInt();
        SortedMap<Integer, Integer> secondMap = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int key = scanner.nextInt();

            if (secondMap.containsKey(key)) {
                secondMap.put(key, secondMap.get(key) + 1);
            } else {
                secondMap.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : secondMap.entrySet()) {
            if (firstMap.containsKey(entry.getKey())) {
                if (entry.getValue() > firstMap.get(entry.getKey())) {
                    System.out.print(entry.getKey() + " ");
                }
            } else {
                System.out.print(entry.getKey() + " ");
            }
        }

    }

}
