package com.example.project;

public class Runner { // Only for Fibonacci Class
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(10);
        System.out.println(fibonacci.getIndexOf(1));
        System.out.println(fibonacci.fibonacciString());
        fibonacci.extendBy(3);
        System.out.println(fibonacci.fibonacciString());

        // -----------------------------------------------

        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(fib3.fibonacciString());

        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;

        System.out.println(fib3.fibonacciString());

        // -----------------------------------------------

        Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);

        Fibonacci[] fibonaccis = {fib0, fib1, fib2};

        for (Fibonacci fibs : fibonaccis) {
            System.out.println(fibs.getSequence().length);
        }
    }
}