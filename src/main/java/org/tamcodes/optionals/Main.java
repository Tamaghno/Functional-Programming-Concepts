package org.tamcodes.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {


        Object obj = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println("Optional check: "+obj);

        Object objk = Optional.ofNullable("some value")
                .orElseGet(() -> "default value");

        System.out.println("Optional check: "+objk);

        Object bleh = Optional.of("some value")
                .orElseThrow(()-> new IllegalStateException("null passed"));

        System.out.println("Optional check: "+bleh);

        Optional.ofNullable("Some Name")
                .ifPresentOrElse(
                        name -> System.out.println("Name passed to optional is : "+name),
                        () -> {
                            System.out.println("no name passed");
                        }
                );

    }
}
