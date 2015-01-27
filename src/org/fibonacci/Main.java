package org.fibonacci;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("fib(" + i + ")=" + Lookup.fibonacci(i));
        }
        System.out.println("fib(32000)="+Lookup.fibonacci(32000));
    }
}
