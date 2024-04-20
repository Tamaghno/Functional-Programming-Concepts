package org.tamcodes.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer cus1 = new Customer("Tama", "9876543210");
        Customer cus2 = new Customer("Amat", "0987654321");

        greetCustomer(cus1);

        cusConsumer.accept(cus1);

        cusBiConsumer.accept(cus1,cus2);

        cusCheckBiConsumer.accept(cus1, false);

        cusCheckBiConsumer.accept(cus2, false);


    }

    static void greetCustomer(Customer customer){
        System.out.println("\n Imperative approach :");
        System.out.println("Hi :"+customer.cusName+" ||  Phone :"+customer.cusPhone);
    }

    static Consumer<Customer> cusConsumer = (customer)-> {
        System.out.println("\n Declarative approach :");
        System.out.println("Hi :"+customer.cusName+" ||  Phone :"+customer.cusPhone);
    };

    static BiConsumer<Customer, Customer> cusBiConsumer = (customer1, customer2)-> {
        System.out.println("\n Declarative approach :");
        System.out.println("Hi :"+customer1.cusName+" ||  Phone :"+customer1.cusPhone);
        System.out.println("Hi :"+customer2.cusName+" ||  Phone :"+customer2.cusPhone);
    };

    static BiConsumer<Customer, Boolean> cusCheckBiConsumer = (customer1, bool)-> {
        System.out.println("\n Declarative approach :");
        System.out.println("Hi :"+customer1.cusName+" ||  Phone :"+(bool?customer1.cusPhone : "*********"));
    };

    static class Customer{
        private final String cusName;
        private final String cusPhone;

        public Customer(String cusName, String cusPhone) {
            this.cusName = cusName;
            this.cusPhone = cusPhone;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "cusName='" + cusName + '\'' +
                    ", cusPhone='" + cusPhone + '\'' +
                    '}';
        }
    }

}
