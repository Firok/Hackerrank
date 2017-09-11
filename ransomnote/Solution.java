/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomnote;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        for (String word : magazine.split(" ")) {
            Integer i = magazineMap.get(word);

            if (i == null) {
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }

        for (String word : note.split(" ")) {
            Integer i = noteMap.get(word);

            if (i == null) {
                noteMap.put(word, 1);
            } else {
                noteMap.put(word, i + 1);
            }
        }
    }

    public boolean solve() {
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            Integer i = magazineMap.get(entry.getKey());

            if (i == null) {
                return false;
            } else {
                if (entry.getValue() > i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
