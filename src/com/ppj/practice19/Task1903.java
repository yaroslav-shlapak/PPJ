package com.ppj.practice19;

/*
Create a class Child with two non-static public fields:
• name of type String,
• numCandies — number of candies — of type int; by default 2.

The class defines also one non-static method
void givesCandyTo(Child other)

 — this child (on which the method was invoked) gives one candy to the other child, i.e.,
 the number of its candies decreases and the number of the other’s candies increases.
 If this child doesn’t have any candies left, a message is displayed and the numbers of candies do not change.

The Child class defines also two static methods
• static Child getChildByName(Child[] children, String name) —
  takes an array of children and a name (String) and returns the child from the array with a given name, or null,
  if there was no child with this name in the array.
• static void printChildren(Child[] children) —
  takes an array of children and prints information on them in one line (as in the example below).

Then, in the main function of a separate class Main, test your class Child as desribed below:

The program creates an array of children (for simplicity, with length 3, but it could be any number).
In a loop, the program asks the user to enter names of these children.
It creates objects representing the children with given names (and number of candies equal to 2)
and stores references to these objects in the array.
In a loop, the program asks the user to enter two names, say name1 and name2;
it means that the child with name name1 gives one candy to its friend with name name2.
After each such operation, the program prints the array to demonstrate that it has been completed correctly.
The loop ends when the first name starts with the letter ’q’; then the second name doesn’t have to be read.
A run of the program could be, for example, as below:

3 children will be created
Name of the child no 0: Bob
Name of the child no 1: Jane
Name of the child no 2: Kate
3 children: [ (Bob, 2 candies) (Jane, 2 candies) (Kate, 2 candies) ]
Entering the name of the 'giver' starting
with 'q' terminates the program

Enter names of 'giver' and 'receiver': Jane Kate
[ (Bob, 2 candies) (Jane, 1 candies) (Kate, 3 candies) ]
Enter names of 'giver' and 'receiver': Jane Cindy
No child with name Cindy
Enter names of 'giver' and 'receiver': Cindy Jane
No child with name Cindy
Enter names of 'giver' and 'receiver': Cindy John
No child with name Cindy
No child with name John
Enter names of 'giver' and 'receiver': Jane Bob
[ (Bob, 3 candies) (Jane, 0 candies) (Kate, 3 candies) ]
Enter names of 'giver' and 'receiver': Jane Kate
No candies to give!
[ (Bob, 3 candies) (Jane, 0 candies) (Kate, 3 candies) ]
Enter names of 'giver' and 'receiver': Kate Jane
[ (Bob, 3 candies) (Jane, 1 candies) (Kate, 2 candies) ]
Enter names of 'giver' and 'receiver': Bob Kate
[ (Bob, 2 candies) (Jane, 1 candies) (Kate, 3 candies) ]
Enter names of 'giver' and 'receiver': q
 */

import static com.ppj.practice19.Child.getChildByName;
import static com.ppj.practice19.Child.printChildren;

class Task1903 {
    public static void main(String[] args) {
        String[] names = {"Jane", "Cindy", "Bob", "Kate"};
        Child[] children = new Child[names.length];
        for (int i = 0; i < names.length; i++) {
            children[i] = new Child(names[i]);
        }
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("Enter names of 'giver'");
            String n1 = scanner.next();
            if (n1.charAt(0) == 'q') {
                break;
            }
            System.out.println("Enter names of 'receiver'");
            String n2 = scanner.next();
            System.out.print(n1 + " " + n2);
            System.out.println();
            Child c1 = getChildByName(children, n1);
            Child c2 = getChildByName(children, n2);
            if (c1 != null && c2 != null) {
                c1.givesCandyTo(c2);
            }
            printChildren(children);
        }
    }
}

class Child {
    public final String name;
    public int numCandies = 2;

    Child(String name) {
        this.name = name;
    }

    void givesCandyTo(Child other) {
        if (numCandies > 0) {
            other.numCandies++;
            numCandies--;
        } else {
            System.out.println("There are no candies left");
        }
    }

    static Child getChildByName(Child[] children, String name) {
        Child res = null;
        for (Child child : children) {
            if (child.name.equals(name)) {
                res = child;
                break;
            }
        }
        return res;
    }

    static void printChildren(Child[] children) {
        StringBuffer sb = new StringBuffer(children.length + " children: [");
        for (Child child : children) {
            String pluralOrSingular = "candies";
            if (child.numCandies == 1) {
                pluralOrSingular = "candy";
            }
            sb.append("(" + child.name + ", " + child.numCandies + " " + pluralOrSingular + ") ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

