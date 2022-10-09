package com.company;

public class StackGenerics<T>{
        private final int capacity = 8;
        private T[] stack;
        private int n;
        public StackGenerics(){
            this.stack = (T[]) new Object[capacity];
            this.n = 0;
        }
        public void push(T a){
            if (n == this.stack.length) resize(n*2);
            System.out.println("prog1");
            stack[n++] = a;
        }
        public T pop(){
            System.out.println("prog2");
            T a = stack[n-1];
            n--;
            if (n > 0 && n == stack.length/4) resize(n/4);
            return a;
        }
        public void resize(int capacity){
            assert capacity >= n;

            T[] aux = (T[]) new Object[capacity];
            for (int i = 0; i < n; i++) {
                aux[i] = stack[i];
            }
            this.stack = aux;
        }
}
