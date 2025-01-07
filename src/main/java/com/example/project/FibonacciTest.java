package com.example.project;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(10);

        System.out.println(fib.fibonacciString());
        System.out.println(fib.getIndexOf(13));
        System.out.println(fib.getIndexOf(1));
        fib.extendBy(5);
        System.out.println(fib.fibonacciString());
    }
}