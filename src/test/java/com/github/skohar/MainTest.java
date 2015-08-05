package com.github.skohar;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void fizzBuzz() {
        for (int i = 1; i <= 1000; i++) {
            assertThat(Main.fizzBuzz(i), is(answer(i)));
        }
    }

    private static String answer(int n) {
        return n % 15 == 0 ? "FizzBuzz" : n % 5 == 0 ? "Buzz" : n % 3 == 0 ? "Fizz" : Integer.toString(n);
    }
}
