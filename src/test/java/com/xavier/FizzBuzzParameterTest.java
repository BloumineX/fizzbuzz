package com.xavier;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by xavierbloumine on 29/10/2016.
 */

@RunWith(DataProviderRunner.class)
public class FizzBuzzParameterTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @DataProvider
    public static Object[] generate() {
        return new Integer[] {
                1, 2, 4, 7
        };
    }

    @Test
    @UseDataProvider("generate")
    public void should_return_2_when_input_is_2(Integer number) {
        assertThat(fizzBuzz.generate(number)).isEqualTo(number.toString());
    }


    @DataProvider
    public static Object[] multipleOf3() {
        return new Integer[] {
                3, 6, 9
        };
    }

    @Test
    @UseDataProvider("multipleOf3")
    public void should_return_fizz_when_input_is_divisible_by_3(Integer number) {
        assertThat(fizzBuzz.generate(number)).isEqualTo("fizz");
    }


    @DataProvider
    public static Object[] multipleOf5() {
        return new Integer[] {
                5, 10, 20
        };
    }

    @Test
    @UseDataProvider("multipleOf5")
    public void should_return_fizz_when_input_is_divisible_by_5(Integer number) {
        assertThat(fizzBuzz.generate(number)).isEqualTo("buzz");
    }

    @DataProvider
    public static Object[] multipleOf3And5() {
        return new Integer[] {
                15, 30
        };
    }

    @Test
    @UseDataProvider("multipleOf3And5")
    public void should_return_fizzbuzz_when_input_is_divisible_by_3_and_5(Integer number) {
        assertThat(fizzBuzz.generate(number)).isEqualTo("fizzbuzz");
    }
}
