/*

Ques.7 Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1)).

*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class SpecialStack {
    int MAX = 5;
    List<Integer> itemList = new LinkedList<>();

    void push(int i) {
        if (itemList.size() < MAX) {
            itemList.add(i);
            System.out.println(i + " Added Successfully");
        } else {
            System.out.println("Stack Overflow : Insert Failed");
        }
    }

    void pop() {
        if (itemList.size() > 0) {
            System.out.println(itemList.get(itemList.size() - 1) + " Removed Successfully");
            itemList.remove(itemList.size() - 1);
        } else {
            System.out.println("Stack Underflow : Stack is Empty");
        }
    }

    void isEmpty() {
        if (itemList.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
    }

    void isFull() {
        if (itemList.size() == MAX) {
            System.out.println("Stack is Full");
        } else {
            System.out.println("Stack is not Full");
        }
    }

    int getMin() {
        if (itemList.isEmpty()) {
            System.out.println("Stack is Empty Returning 0");
            return 0;
        }
        return Collections.min(itemList);
    }
}


public class Ques7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        SpecialStack specialStack = new SpecialStack();
        while (true) {
            System.out.println("SPECIAL STACK OPERATIONS");
            System.out.println("1. Push a value");
            System.out.println("2. Pop a value");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Check if Stack is Full");
            System.out.println("5. Get Min Value");
            System.out.println("6. EXIT");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter Value: ");
                    specialStack.push(sc.nextInt());
                    break;
                case 2:
                    specialStack.pop();
                    break;
                case 3:
                    specialStack.isEmpty();
                    break;
                case 4:
                    specialStack.isFull();
                    break;
                case 5:
                    System.out.println("Min value: " + specialStack.getMin());
                    break;
                default:
                    System.out.println("STACK DATA: " + specialStack.itemList);
                    System.exit(0);
            }
        }
    }
}