package com.company;

public class arrayGenerics<T>{
    public T[] array;
    public int number_of_elements;
    public arrayGenerics(int capacity){
        this.array = (T[]) new Object[capacity];
        number_of_elements = 0;
    }
    public void add(T add){
        array[number_of_elements++] = add;
    }
    public T remove(){
        T item = array[number_of_elements-1];
        number_of_elements--;
        return item;
    }
}
