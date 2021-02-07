package com.company;

import java.util.ArrayList;

public class MyStackRealisation <T> {
    private ArrayList<T> m = new ArrayList<T>();



    public boolean empty(){
        if (m.isEmpty()){
            return true;
        }                                   //проверка на пустоту
        else
            return false;
    }


    public T peek(){
        return m.get(m.size()-1);         //возвращение верхнего элемента, без удаления
    }

    public T pop(){             //извлекает верхний элемент, удаляя его из списка
        T getter = m.get(m.size()-1);
        m.remove(m.size()-1);

        return getter;

    }

    public void push(T item){   //помещает элемент в вершину стека
        m.add(item);

    }

    public Integer getSize(){
        return m.size();
    }

    public void myStackToString(){
        for (int i =0; i<m.size(); i++){
            System.out.print(m.get(i) + " ");
        }
    }
}