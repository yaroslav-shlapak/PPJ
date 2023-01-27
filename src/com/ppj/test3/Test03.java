package com.ppj.test3;

import java.util.Arrays;

class Test03 {
    public static void main(String[] args) {
        System.out.println();
        // 1
        // fun(7);
        // 4
//        System.out.print(new A(5).a + " ");
//        System.out.print(new B(4).a + " ");
        // 5
//        Data data = new Data();
//        for (char c : new char[]{'a','b','c'}) {
//            data.aFun(c);
//        }
//        System.out.print(data + " -> ");
//        do
//            System.out.print(data.pFun() + " ");
//        while (true);

        System.out.println(fun("abcd"));
        System.out.println(fun("abxcd"));
    }

    // 10
    class MyDynamicArray {
        private int arr[];
        private int count;
        public MyDynamicArray(int length) { arr = new int[length]; }

        public String toString() {
            return Arrays.toString(arr);
        }
        public void add(int element)
        {
            if (arr.length == count) {
                int newArr[] = new int[2 * count];
                for (int i = 0; i < count; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            if (count == 0) {
                arr[count++] = element;
            } else {
                for (int i = 0; i < count; i++) {
                    if (element > arr[i]) {
                        int newArr[] = new int[count + 1];
                        for (int j = 0; j < count; j++) {
                            newArr[i + 1] = arr[i];
                        }
                         
                    }
                }
            }
        }
    }
    // 7
    public static String fun(String str) {
        int len = str.length();
        if (len % 2 == 0) {
            return str.substring(len / 2) + str.substring(0, len / 2);
        } else {
            return str.substring(len / 2 + 1) + str.substring(len / 2 , len / 2) + str.substring(0, len / 2);
        }
    }

    // 9
//    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        Fruit apple = new Apple();
//        Fruit peach = new Peach();
//        fruit.taste();
//        apple.taste();
//        peach.taste();
//    }

    // 8
    class Person {
        private String name;
        private int birthYear;

        Person(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String getName() {
            return name;
        }

        public int getAge(int current) {
            return current - birthYear;
        }
    }

    public static void fun(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print((
                        j <= 1
                                || j >= size - 2
                                || i < 2
                                || i > size - 3) ? "*" : " "
                );
            System.out.println();
        }
    }
}

// 5
class Data {
    private String str;
    public Data() {
        str = new String("");
    }
    public void aFun(char c) {
        this.str = c + this.str;
    }

    public char pFun() {
        if (str.length() <= 0) {
            throw new RuntimeException();
        }
        char c = str.charAt(str.length() - 1);
        this.str = str.substring(0, str.length() - 1);
        return c;
    }

    public String toString() {
        return str;
    }
}

// 4
class A {
    int a;
    public A(int a) {
        this.a = a + 5;
        System.out.print(a + " ");
    }
}
class B extends A {
    public B(int a) {
        super(a);
        this.a += 5;
        System.out.print(a + " ");
    }
}

class MyQueue {
    private static class Node {
        String data;
        Node next = null;

        Node(String d) {
            data = d;
        }
    }

    private Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public void enqueue(String s) {
        if (head == null) head = tail = new Node(s);
        else tail = tail.next = new Node(s);
    }

    public String dequeue() {
        String s = head.data;
        if ((head = head.next) == null) tail = null;
        return s;
    }

    public boolean empty() {
        return head == null;
    }
}


class MyStack {
    private class Node {
        private int data;
        private Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this(data, null);
        }

        int getData() {
            return data;
        }

        Node getNext() {
            return next;
        }
    }

    private Node head = null;

    public void push(int data) {
        head = new Node(data, head);
    }

    public int pop() {
        int d = head.getData();
        head = head.getNext();
        return d;
    }

    public boolean empty() {
        return head == null;
    }
}
