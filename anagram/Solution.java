/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {
    
    static int anagram(String s){
        // Complete this function
        if(s.length()%2!=0)
            return -1;
        
        int halfLength=s.length()/2;
        
        String s1=s.substring(0,halfLength);
        String s2=s.substring(halfLength);
        
       
        Map<Character, Integer> map =new HashMap<>();
        for(char c:s1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        
        int length=0;
        for(char c:s2.toCharArray()){
            if(map.containsKey(c) && map.get(c)!=0){
                map.put(c,map.get(c)-1); 
                length+=2;
            }
         }
        
        return (s.length()-length)/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
    
