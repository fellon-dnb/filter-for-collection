package com.fellon.filtering;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {10,20,30,40,50,60,-10,-20,-30,-40};
            Filter<Integer> x2 = new Filter<Integer>() {

                @Override
                public Integer apply(Integer o) {
                    if (o == null) return null;
                    return o * 2;
                }
            };
            Integer[] result = FilterUtils.filter(numbers, x2);
            System.out.println("до " + Arrays.toString(numbers));
            System.out.println("после " + Arrays.toString(result));
        }

    }
