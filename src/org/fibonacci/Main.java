package org.fibonacci;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        for ( int i = 0; i < 200; i++ )
        System.out.println("fib("+i+")="+Lookup.fibonacci(i));
    }
}
