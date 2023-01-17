package com.ppj.practice23;

/*
Write a program which checks correctness of brackets (round, curly and square)
in a text file (or just a multi-line string).
This can be done by reading the text character by character and:
• if an opening bracket has been encountered, put information on its kind (round, curly or square) onto a stack;
• if a closing bracket has been encountered (not necessarily in the same line as the corresponding opening bracket),
  pop information on the kind of the last opening bracket off the stack and check
  if it matches the kind of the closing bracket encountered.

Implement the stack by creating class Node, as in implementation of singly-linked lists.
Objects of type Node represent data pushed onto the stack
(kinds of brackets, as a value of type char, String, int . . . )
and contain a reference next to the next node, as it is usual in singly-linked lists.
Note that stack is a singly-linked list where adding and removing elements is always performed at the beginning,
so traversing the list is never needed.

The program reads the input and prints "OK" if all brackets are correct.
If an error is detected, the program describes it,
prints line number and the offending line itself indicating the location of the error by ^ character
under the incorrect bracket. After reading the whole input, the program checks if the stack is empty;
if not, it prints information about that and a list of all brackets that have not been closed.

For example, for a file

Warsaw(){
London[xxxx} (
Madrid Paris)}
Berlin

the program should print something like

London[xxxx} (
                   ^
ERROR in line 2. '}' found, but ']' expected.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Task2201 {
    public static <List> void main(String[] args) {
        String[] inputs = {
                "(sd{a}[b])",
                "Warsaw(){ London[xxxx} ( Madrid Paris)} Berlin"
        };
        Stack queue = new Stack();
        Set<String> closing = new HashSet<String>();
        closing.add("]");
        closing.add("}");
        closing.add(")");
        Set<String> starting = new HashSet<String>();
        starting.add("[");
        starting.add("{");
        starting.add("(");
        Map<String, String> braces = new HashMap<>();
        braces.put("[", "]");
        braces.put("{", "}");
        braces.put("(", ")");
        for (String line : inputs) {
            char[] characters = line.toCharArray();
            for (char character : characters) {
                String item = "" + character;
                boolean isClosing = closing.contains(item);
                boolean isStarting = starting.contains(item);
                if (isClosing) {
                    String first = queue.getLast();
                    String pairOfFirst = braces.get(first);
                    if (first != null && pairOfFirst.equals(item)) {
                        queue.pop();
                    } else {
                        System.out.println("The next line is not OK: ");
                        System.out.println(line);
                        throw new Error("ERROR " + item + " found, but " + first + " expected. ");
                    }
                } else if (isStarting) {
                    queue.push(item);
                }
            }
            System.out.println("The next line is OK: " + line);
        }
    }
}

class Stack {
    private Node node = null;

    public void push(String brace) {
        if (isEmpty()) {
            node = new Node(brace, null);
        } else {
            node = new Node(brace, node);
        }
    }

    public String pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        String brace = node.brace;
        node = node.previousNode;

        return brace;
    }

    public String getLast() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        return node.brace;
    }

    public boolean isEmpty() {
        return node == null;
    }

    public void clear() {
        node = null;
    }

    class Node {
        final String brace;
        final Node previousNode;

        Node(String brace, Node previousNode) {
            this.brace = brace;
            this.previousNode = previousNode;
        }
    }
}
