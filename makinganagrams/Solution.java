/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makinganagrams;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {
    
  static int makingAnagrams(String s1, String s2){
        // Complete this function
        int length=0;
        Map<Character, Integer> map=new HashMap<>();
        
        for(char c:s1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        
        for(char c:s2.toCharArray()){
            if(map.containsKey(c) && map.get(c)!=0){
                map.put(c,map.get(c)-1);
                length+=2;
            }
        }
        
        return s1.length()+s2.length()-length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }

}
    
