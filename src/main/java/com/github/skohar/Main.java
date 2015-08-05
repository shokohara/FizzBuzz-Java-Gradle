package com.github.skohar;

class Main {
    public static String fizzBuzz(int n) {
        return n % 15 == 0 ? "FizzBuzz" : n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n);
    }
}
