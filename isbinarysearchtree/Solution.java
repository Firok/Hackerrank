/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbinarysearchtree;

/**
 *
 * @author batefirok
 */
public class Solution {

  boolean checkBST(Node root) {
      return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

   boolean isBST(Node root, int min, int max){
       if(root ==null)
            return true;
        if(root.data < min || root.data > max)
            return false;
       return (isBST(root.left,min,root.data-1) && isBST(root.right,root.data+1,max));
   }


}

class Node {
        int data;
        Node left;
        Node right;
     }
