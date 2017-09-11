/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.util.*;

/**
 *
 * @author batefirok
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie contacts = new Trie();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                contacts.add(contact);
            }
            if (op.equals("find")) {
                System.out.println(contacts.find(contact));
            }
        }
    }

}

class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    public int find(String partial) {
        TrieNode node = root;
        for (char ch : partial.toCharArray()) {
            if (node.subNode(ch) == null) {
                return 0;
            } else {
                node = node.subNode(ch);
            }
        }
        return node.count;
    }

    public void add(String contact) {
        if (search(contact) == true) {
            return;
        }
        TrieNode current = root;
        for (char ch : contact.toCharArray()) {
            TrieNode child = current.subNode(ch);
            if (child != null) {
                current = child;
            } else {
                current.childList.add(new TrieNode(ch));
                current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }

    public boolean search(String partial) {
        TrieNode current = root;
        for (char ch : partial.toCharArray()) {
            if (current.subNode(ch) == null) {
                return false;
            } else {
                current = current.subNode(ch);
            }
        }

        if (current.isEnd == true) {
            return true;
        }
        return false;
    }
}

class TrieNode {

    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;

    /* Constructor */
    public TrieNode(char content) {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        this.content = content;
        count = 0;
    }

    public TrieNode subNode(char content) {
        if (childList != null) {
            for (TrieNode eachChild : childList) {
                if (eachChild.content == content) {
                    return eachChild;
                }
            }
        }
        return null;
    }
}
