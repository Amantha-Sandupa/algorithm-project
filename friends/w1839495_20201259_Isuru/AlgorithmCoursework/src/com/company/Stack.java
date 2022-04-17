//        IIT - 20201262
//        UOW - w1839499
//        Name - Amantha Sandupa Mihiranga


//package com.company;
//
//public class Stack {
//    private static int top;
//    private static int capacity;
//    private static char[] stack;
//
//    //This is for initialize the stack
//    public Stack(int size){
//        top = -1;
//        capacity = size;
//        stack = new char[size];
//    }
//    //This is for add the element to the stack
//    public void push(char character){
//        if (isFull())
//        {
//            System.out.println("The stack is Full\n");
//            System.exit(-1);
//        }
//        else {
//            System.out.println("Insert " + character);
//        }
//        stack[++top] = character;
//    }
//
//    //This is for pop the top element in the stack
//    public int pop(){
//        if (isEmpty()){
//            System.out.println("The stack is Empty\n");
//            System.exit(-1);
//        }
//        else {
//            System.out.println("Remove " + peek());
//        }
//        return stack[top--];
//    }
//
//    //This is for return the top element of the stack
//    private int peek() {
//        if (!isEmpty()){
//            return stack[top];
//        }
//        else {
//            System.exit(-1);
//        }
//        return -1;
//    }
//
//    //Check the stack is empty or not
//    private boolean isEmpty() {
//        return top == -1;
//    }
//
//    //For return the size of the stack
//    private int size() {
//        return top + 1;
//    }
//
//    //Check the stack is full or not
//    private boolean isFull() {
//        return top == capacity - 1;
//    }
//}
