/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;


import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {
    
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==k)
                continue;
            
            sum+=ar[i];
        }
        
        int half=sum/2;
        
       
        return b-half;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result>0)
          System.out.println(result);
        else
            System.out.println("Bon Appetit");
    }
    
}
