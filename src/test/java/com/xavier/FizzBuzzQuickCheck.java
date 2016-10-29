package com.xavier;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assume;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * http://pholser.github.io/junit-quickcheck/site/0.6.1/usage/configuring.html
 */
@RunWith(JUnitQuickcheck.class)
public class FizzBuzzQuickCheck {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Property
    public void should_return_input_when_input_is_a_number(@InRange(min = "0", max = "100") Integer digit) {
        Assume.assumeTrue(digit % 3 != 0 && digit % 5 != 0);
        assertThat(fizzBuzz.generate(digit)).isEqualTo(digit.toString());
    }


    /**
     * shriking : https://pholser.github.io/junit-quickcheck/site/0.6/usage/shrinking.html
     * @param digit number generated
     */
    @Property(shrink = false)
    public void should_return_fizz_when_input_is_a_multiple_of_3(@InRange(min = "3", max = "1000000") Integer digit) {
        Assume.assumeTrue(digit % 3 == 0 && digit % 5 != 0) ;
        assertThat(fizzBuzz.generate(digit)).describedAs("Input: " + digit).isEqualTo("fizz");
    }



}
