package com.ppj.practice22;

/*
Create a class QueueOfTasks objects of which represent queues (FIFO) of elements of type Task.
The implementation should be based on singly-linked list,
with nodes being objects of the Node class with fields task of type Task and next of type Node (pointing to the next node).
The class QueueOfTasks should provide, as any decent queue does, three methods:

• method public void enqueue(Task t) adding new object of type Node at the end (tail) of the queue;
• method public Task dequeue() removing the node from the front (head) of the queue and returning the data task from this node;
• method public boolean empty() returning true if and only if the queue is empty.

Note that a queue is basically a singly-linked list where adding is always performed at the back end of the list,
while removing at its front end. Therefore, if class QueueOfTasks has field tail pointing
to the last node and head pointing to the first, no iteration over the list will ever be necessary.
The Task class represents a task: it contains input data (in our case two numbers)
and the execute method which somehow processes this data and returns a result (here, just a number of type double):

public class Task {
    double x, y;

    public Task(double a, double b) {
        x = a;
        y = b;
    }

    public double execute() {
        throw new UnsupportedOperationException();
    }

    public static Task getInstance(String oper, double a, double b) {
        // ...
    }
}

The execute function just throws an exception terminating the job (as shown above); however,
there are classes extending the Task class where it is overriden and provides various implementations
of processing the data: Adder, Multiplier, Divider and Subtractor.
The static function getInstance returns objects of these classes, selected according to the value of the string oper.

The program reads lines from the console (using Scanner or Console — see the documentation —
note that Console may not work under an IDE). Each line specifies the action to be performed
(as one of the symbols ’+’, ’-’, ’/’ ’*’) and input data for attached task.

For example, execution of the program may look like this:

Enter tasks in the form 'op arg1 arg2'
where op is + - * / and args are doubles
Enter 'q' to stop reading
+ 3 9
/ 24 6
- 90.5 100.5
* -3 -12
q

12.0 4.0 -10.0 36.0

Don’t use arrays or any classes from the java.util package!
 */

class Task2202 {
    public static void main(String[] args) {
        String[] rpns = {
                "+ 3 9",
                "/ 24 6",
                "- 90.5 100.5",
                "* -3 -12"
        };
        QueueOfTasks queueOfTasks = new QueueOfTasks();
        for (String line : rpns) {
            String[] items = line.split( " ");
                switch (items[0]) {
                    case "*": {
                        queueOfTasks.enqueue(
                                new Multiply(
                                        Double.parseDouble(items[1]),
                                        Double.parseDouble(items[2])
                                )
                        );
                        break;
                    }
                    case "+": {
                        queueOfTasks.enqueue(
                                new Add(
                                        Double.parseDouble(items[1]),
                                        Double.parseDouble(items[2])
                                )
                        );
                        break;
                    }
                    case "-": {
                        queueOfTasks.enqueue(
                                new Minus(
                                        Double.parseDouble(items[1]),
                                        Double.parseDouble(items[2])
                                )
                        );
                        break;
                    }
                    case "/": {
                        queueOfTasks.enqueue(
                                new Divide(
                                        Double.parseDouble(items[1]),
                                        Double.parseDouble(items[2])
                                )
                        );
                        break;
                    }
                    default: {
                        queueOfTasks.enqueue(new Error());
                        break;
                    }
                }
            }
            while (!queueOfTasks.isEmpty()) {
                Task task = queueOfTasks.dequeue();
                System.out.print(task.execute() + " ");
            }
    }
}

class QueueOfTasks {
    private Node firstNode = null;
    private Node lastNode = null;
    public void enqueue(Task task) {
        Node newNode = new Node(task, null);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = firstNode;
        } else {
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
    }
    public Task dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        Task task = firstNode.task;
        firstNode = firstNode.nextNode;

        return task;
    }
    public boolean isEmpty()  {
        return firstNode == null;
    }

    public void clear() {
        firstNode = null;
    }

    class Node {
        final Task task;
        Node nextNode;

        Node(Task task, Node nextNode) {
            this.task = task;
            this.nextNode = nextNode;
        }
    }
}

abstract class Task {
    private final double x;
    private final double y;

    public Task(double a, double b) {
        x = a;
        y = b;
    }

    abstract double execute();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Add extends Task {
    public Add(double a, double b) {
        super(a, b);
    }

    @Override
    double execute() {
        return getX() + getY();
    }
}

class Minus extends Task {
    public Minus(double a, double b) {
        super(a, b);
    }

    @Override
    double execute() {
        return getX() - getY();
    }
}

class Multiply extends Task {
    public Multiply(double a, double b) {
        super(a, b);
    }

    @Override
    double execute() {
        return getX() * getY();
    }
}


class Divide extends Task {
    public Divide(double a, double b) {
        super(a, b);
    }

    @Override
    double execute() {
        return getX() / getY();
    }
}

class Error extends Task {
    public Error() {
        super(0, 0);
    }

    @Override
    double execute() {
        throw new UnsupportedOperationException();
    }
}

