/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandsquares;


import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        
        int t=scanner.nextInt();
        
        while(scanner.hasNext()){
            
            int count=0;
            
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            
            count=(int)Math.floor(Math.sqrt(B)) - (int)Math.ceil(Math.sqrt(A)) +1;
            
            System.out.println(count);
        }
    }
    
}
