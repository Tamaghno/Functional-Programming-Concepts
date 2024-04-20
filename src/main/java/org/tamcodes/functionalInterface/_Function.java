package org.tamcodes.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println(increment(1));

        System.out.println(incrementByOneFunction.apply(2));

        System.out.println(incrementByOneFunction.andThen(multiplyBy10Function).apply(5)); //this is function chaining

        //another way

        Function<Integer, Integer> integerIntegerFunction = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(integerIntegerFunction.apply(8));

        System.out.println(addTwoNumsBiFunction.apply(5,4));

    }

    static int increment(int num){
        return num+1;
    }

    static Function<Integer, Integer> incrementByOneFunction = num -> num+1; // this is a Function interface

    static Function<Integer, Integer> multiplyBy10Function = num -> num * 10; // this is a Function interface

    static BiFunction<Integer, Integer, Integer> addTwoNumsBiFunction = (num1, num2) -> num1+num2;

}
