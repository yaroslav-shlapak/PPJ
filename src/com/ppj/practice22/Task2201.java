package com.ppj.practice22;

/*
Create a class RPNStack which represents a stack of numbers (doubles).
Class RPNStack contains one private field top of type Node,
objects of which represent data that are pushed on the stack:
each object contains in its field val a double and in field next a reference to the next node.

The class has three methods:
• method public void push(double d) pushing new node on top of the stack;
• method public double pop() removing the top node and returning val from the removed node;
• method public boolean empty() returning true if and only if the stack is empty.

Note that stack is a singly-linked list where adding and removing elements is always performed at the beginning.
The program reads a file with consecutive lines representing arithmetic expressions
in the Reverse Polish Notation (RPN) — instead of reading a file, you can use an array of strings as input data.
For example (2(7 + 5) − 20)/(1/4) (which is 16) can be written in the RPN as

2 7 5 + * 20 - 1 4 / /

and (2.5(9 − 5) + 4)/3.5 (which evaluates to 4) as

2.5 9 5 - * 4 + 3.5 /

After reading each line, it is split (using spaces as separators) and for each token:
• if it is string "+", we pop two numbers from the stack, add them and push the result on the stack;
• if it is string "*", we do the same but myltiplying the numbers instead of adding them;
• if it is string "-", we pop two elements, subtract the one popped as the first from the one popped later and push the result on the stack;
• if it is string "/", we do the same but dividing the numbers instead of subtracting them;
• if it is not "+", "*", "-" or "/", we interpret it as a number of type double and we push it onto the stack.

After all tokens from the line have been processed, we pop the remaining number off the stack,
which should be the value of the whole expression. We then print the line just processed and the result.
Check if the stack is now empty; if not, inform the user about this fact,
clear the stack and continue with the next line of input data. For example,
public static void main(String[] args) {
String[] rpns = {
"2 7 5 + * 20 - 1 4 / /",
"16 4 3 + 2 - 3 * 6 + 3 / 0.5 / -",
"5 2 / 4 * 5",
"1 1.5 2.5 2 - / + 3 * 4 /",
};
StackRPN st = new StackRPN();
for (String line : rpns) {
    // ... }
}

should print

Result = 16.0
Result = 2.0
Result = 5.0
=== Stack not empty - Error
Result = 3.0
 */

class Task2201 {
    public static void main(String[] args) {
        String[] rpns = {
                "2 7 5 + * 20 - 1 4 / /",
                "16 4 3 + 2 - 3 * 6 + 3 / 0.5 / -",
                "5 2 / 4 * 5",
                "1 1.5 2.5 2 - / + 3 * 4 /",
        };
        RPNStack st = new RPNStack();
        for (String line : rpns) {
            String[] items = line.split( " ");
            for (String item : items) {
                switch (item) {
                    case "*": {
                        multiply(st);
                        break;
                    }
                    case "+": {
                        add(st);
                        break;
                    }
                    case "-": {
                        minus(st);
                        break;
                    }
                    case "/": {
                        divide(st);
                        break;
                    }
                    default: {
                        st.push(Double.parseDouble(item));
                        break;
                    }
                }
            }
            System.out.println("Result: " + st.pop());
            if (!st.isEmpty()) {
                System.out.println("=== Stack not empty - Error");
            }
            st.clear();
        }
    }

    private static void divide(RPNStack st) {
        double d1 = st.pop();
        double d2 = st.pop();
        st.push(d2 / d1);
    }

    private static void minus(RPNStack st) {
        double d1 = st.pop();
        double d2 = st.pop();
        st.push(d2 - d1);
    }

    private static void add(RPNStack st) {
        double d1 = st.pop();
        double d2 = st.pop();
        st.push(d1 + d2);
    }

    private static void multiply(RPNStack st) {
        double d1 = st.pop();
        double d2 = st.pop();
        st.push(d1 * d2);
    }

}

class RPNStack {
    private Node node = null;
    //pushing new node on top of the stack;
    public void push(double d) {
        if (isEmpty()) {
            node = new Node(d, null);
        } else {
            node = new Node(d, node);
        }
    }
    //removing the top node and returning val from the removed node;
    public double pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        double value = node.value;
        node = node.previousNode;

        return value;
    }
    //returning true if and only if the stack is empty.
    public boolean isEmpty()  {
        return node == null;
    }

    public void clear() {
        node = null;
    }

    class Node {
        final double value;
        final Node previousNode;

        Node(double value, Node previousNode) {
            this.value = value;
            this.previousNode = previousNode;
        }
    }
}
