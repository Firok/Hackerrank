/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findtherunningmedian;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {

        MyHeap heap = new MyHeap();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            heap.add(in.nextInt());
            System.out.println(heap.median());
        }
    }

}

class MyHeap {

    private Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private Queue<Integer> high = new PriorityQueue<>();

    public void add(int number) {
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(number);
        offset();
    }

    private void offset() {
        while (!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            low.add(high.poll());
            high.add(low.poll());
        }
    }

    public double median() {
        if (low.isEmpty() && high.isEmpty()) {
            throw new IllegalStateException("Underflow! Heap is empty");
        } else {
            return low.size() == high.size() ? (low.peek() + high.peek()) / 2.0 : low.peek();
        }
    }
}
