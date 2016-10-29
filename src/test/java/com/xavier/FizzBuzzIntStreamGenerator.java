package com.xavier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzIntStreamGenerator {


    private FizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    public void should_return_fizz_when_input_is_divisible_by_3() {

        IntStream.generate(() -> ((new Random().nextInt() / 3) * 3)).limit(100).filter(i -> i % 5 != 0).forEach(

                n -> Assertions.assertThat(new FizzBuzz().generate(n)).isEqualTo("fizz")

        );


    }

}
