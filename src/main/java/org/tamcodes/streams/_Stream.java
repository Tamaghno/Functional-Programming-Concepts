package org.tamcodes.streams;

import java.util.List;
import java.util.stream.Collectors;

import static org.tamcodes.streams.Gender.FEMALE;

public class _Stream {

    public static void main(String[] args) {

        System.out.println("Hello streams!");

        List<Person> people = List.of (
                new Person("Raka", FEMALE),
                new Person("Lalla", Gender.MALE),
                new Person("Ram", Gender.MALE),
                new Person("Mili", FEMALE)
        );

        System.out.println("Printing everyone's gender :");
        people.stream()
                .map(person -> person.gender)
                .toList()
                .forEach(System.out::println);

        System.out.println("Printing gender options in the list :");
        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Printing person's name lengths in the list :");
        people.stream()
                .map(person -> person.name)
                .mapToInt(personName -> personName.length())
                .forEach(System.out::println);

        boolean  containsOnlyFemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println("Does list contain only females ? "+containsOnlyFemales);

        boolean  containsAtleastOneFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));

        System.out.println("Does list contain atleast one female ? "+containsAtleastOneFemale);

        boolean  containsNoOtherGender = people.stream()
                .noneMatch(person -> "FEMALE".equals(person.gender.toString()));

        System.out.println("Does list contain other gender ? "+containsNoOtherGender);


    }

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
}
