/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusingtwostacks;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

}

class MyQueue<T> {

    Deque<T> queue;

    public MyQueue() {
        queue = new ArrayDeque<>();
    }

    public void enqueue(T x) {
        queue.addLast(x);
    }

    public void dequeue() {
        queue.removeFirst();
    }

    public T peek() {
        return queue.peekFirst();
    }

}
