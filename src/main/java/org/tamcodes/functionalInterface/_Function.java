package org.tamcodes.functionalInterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println(increment(1));

        System.out.println(incrementByOneFunction.apply(2));

    }

    static int increment(int num){
        return num+1;
    }

    static Function<Integer, Integer> incrementByOneFunction = num -> num+1; // this is a Function interface

}
