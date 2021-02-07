package com.company;

public class Main {

    public static void main(String[] args) {

        MyStackRealisation<String> myStack = new MyStackRealisation<String>();

        System.out.println(myStack.getSize());
        myStack.push("Привет привет");
        System.out.println(myStack.peek());
        myStack.push("Как ваши дела");
        myStack.push("Дела делишки");
        System.out.println(myStack.peek());
        myStack.push("Штаны штанишки");
        myStack.myStackToString();
        myStack.pop();
        System.out.println(" ");
        myStack.myStackToString();
    }
}
