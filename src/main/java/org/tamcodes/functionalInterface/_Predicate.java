package org.tamcodes.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isValid("9087654321"));
        System.out.println("Using delcrative approach :"+isValidPredicate.test("9087654321"));


        System.out.println("Chaining two predicate together (should be false):"+isValidPredicate.and(contains34Predicate).test("9087654321"));
        System.out.println("Chaining two predicate together (should be true):"+isValidPredicate.and(contains34Predicate).test("9087653421"));

        System.out.println("Check if num1 has more digits than num2 : "+firstGreaterThanSecondBiPredicate.test("123456","654321"));

    }

    static boolean isValid(String num){
        return num.startsWith("90") && num.length() == 10;
    }

    static Predicate<String> isValidPredicate =   num -> num.startsWith("90") && num.length() == 10;

    static Predicate<String> contains34Predicate = num -> num.contains("34");

    static BiPredicate<String, String> firstGreaterThanSecondBiPredicate = (num1,num2) -> {
        return num1.length() > num2.length();
    };

}
