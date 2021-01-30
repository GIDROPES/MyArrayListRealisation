package com.company;

public class Main {

    public static void main(String[] args) {

        //Нужно создавать пустой массив с длиной 0 и запихивать его в конструктор класса MyArrayList, как в примере ниже. Я там тестировал свои функции

        Double[] doubles = {};
	    MyArrayList myArrayList = new MyArrayList(doubles);
	    myArrayList.add(4.7);
        myArrayList.add(50.15);
        myArrayList.add(4546.1);
        myArrayList.toMyStringDoubles();
        myArrayList.removeDouble();
        myArrayList.toMyStringDoubles();
        //
    }
}
