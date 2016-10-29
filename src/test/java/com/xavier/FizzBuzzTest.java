package com.xavier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {


    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_1_when_input_is_1() {
        assertThat(fizzBuzz.generate(1)).isEqualTo("1");
    }

    @Test
    public void should_return_2_when_input_is_2() {
        assertThat(fizzBuzz.generate(2)).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_when_input_is_3() {
        assertThat(fizzBuzz.generate(3)).isEqualTo("fizz");
    }

    @Test
    public void should_return_fizz_when_input_is_9() {
        assertThat(fizzBuzz.generate(9)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_when_input_is_5() {
        assertThat(fizzBuzz.generate(5)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizz_buzz_when_input_is_15() {
        assertThat(fizzBuzz.generate(15)).isEqualTo("fizzbuzz");
    }




}
