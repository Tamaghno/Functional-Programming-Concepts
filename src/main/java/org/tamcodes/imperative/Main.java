package org.tamcodes.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class Person{
        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> people = List.of (
           new Person("Raka", Gender.FEMALE),
           new Person("Lalla", Gender.MALE),
           new Person("Ram", Gender.MALE),
           new Person("Mili", Gender.FEMALE)
        );

        // Imperative approach
        System.out.println("\nImperative approach");
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for (Person person : females){
            System.out.println(person);
        }


        // Declarative approach
        System.out.println("\nDeclarative approach");

//        List<Person> femalesStream =
                people.stream()
                        .filter(person -> person.gender.equals(Gender.FEMALE))
                        .toList()
                        .forEach(System.out::println);
//        for (Person person : femalesStream){
//            System.out.println(person);
//        }
    }

}