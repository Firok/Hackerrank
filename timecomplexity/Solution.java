/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecomplexity;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(n==1) 
                System.out.println("Not prime");
            else 
            {
                boolean flag=true;
                int s=(int)Math.sqrt(n);
                for(int i=2;i<=s;++i) 
                    if(n%i==0)
                    {
                        flag=false; 
                        i=n;
                    }
                if(flag) 
                    System.out.println("Prime");
                else 
                    System.out.println("Not prime");
            }
        }
    }
}
