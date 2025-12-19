package jai;
import java.util.*;

class Stack {
    int top;
    int maxsize = 10;
    int[] stack_array = new int[maxsize];

    // Constructor
    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int val) {
        if (top == maxsize - 1) {
            System.out.println("Stack overflow!!");
            return false;
        } else {
            top++;
            stack_array[top] = val;
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Stack underflow!!");
            return false;
        } else {
            // Prints the top element and then decrements the top pointer
            System.out.println("Item popped : " + stack_array[top--]);
            return true;
        }
    }

    void display() {
        System.out.println("Printing stack elements....");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack_array[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Stack stck = new Stack();
        
        System.out.println();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.push(40);
        
        System.out.println();
        System.out.println("After push operation...");
        stck.display();
        
        stck.pop();
        stck.pop();
        
        System.out.println();
        System.out.println("After pop operation .. ");
        stck.display();
    }
}
