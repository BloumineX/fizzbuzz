package com.xavier;


public class FizzBuzz {

    public String generate(int i) {

        if (isMultipleOf3(i) && isMultipleOf5(i))
            return "fizzbuzz";

        if(isMultipleOf3(i)) {
            return "fizz";
        } else if(isMultipleOf5(i)) {
            return "buzz";
        }

        return String.valueOf(i);
    }

    private boolean isMultipleOf5(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOf3(int i) {
        return i % 3 == 0;
    }

}
