package org.tamcodes.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(supplySupplier.get());

        System.out.println(supplySupplier.get().size());
    }

    static Supplier<List<String>> supplySupplier =  () -> List.of("abc","asd","opo");

}
