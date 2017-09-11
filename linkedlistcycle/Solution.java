/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistcycle;

/**
 *
 * @author batefirok
 */
public class Solution {

    boolean hasCycle(Node head) {

        if (head == null) {
            return false;
        }

        Node low = head;
        Node high = head.next;
        while (low != high) {
            if (high == null || high.next == null) {
                return false;
            }

            low = low.next;
            high = high.next.next;
        }

        return true;
    }

}

class Node {

    int data;
    Node next;

}
