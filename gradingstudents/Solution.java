/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingstudents;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

   static int[] solve(int[] grades){
        // Complete this function
        for(int i=0;i<grades.length;i++){
            if(grades[i]<38)
                continue;
            int next=grades[i]/5 * 5 + 5;
            
            if(next-grades[i]<3)
                grades[i]=next;
        }
        
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }

}
