/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twostrings;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {
    
    static String twoStrings(String s1, String s2){
        // Complete this function
        
        Set<Character> set =new HashSet<>();
        
        for(char c:s1.toCharArray()){
            set.add(c);
        }
        
        for(char c:s2.toCharArray()){
            if(set.contains(c)){
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
    
}
