package com.bkitsolution;


import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
//        int width = 10;

        // không sử dụng biểu thức lambda,
        // phải sử dụng lớp nặc danh để cài đặt phương thức draw() cho Drawable
//        Drawable d = new Drawable() {
//            public void draw() {
//                System.out.println("Drawing " + width);
//            }
//        };
//        d.draw();

        // sử dụng biểu thức lambda
//        Drawable d2 = () -> {
//            System.out.println("Drawing " + width);
//        };
//        d2.draw();

        //Chapter 2: Implementing lambda expressions with functional interfaces
        //Supplier
//        Supplier<String> supplier = () -> {
//            System.out.println("I am inside the Supplier");
//            return "Hello";
//        };
//        String string = supplier.get();
//        System.out.println("string = " + string);

        //Consumer
//        Consumer<String> consumer = System.out::println;
//        Consumer<String> consumer = (String s) -> {
//            System.out.println("I am inside the Consumer");
//            System.out.println(s);
//        };
//        consumer.accept("Hello");

//        List<String> strings =
//                new ArrayList<>(List.of("one", "two", "three", "four", "five"));
////        Predicate<String> filter = string -> string.startsWith("t");
////        Predicate<String> filter2 = string -> !string.startsWith("t");
////        strings.removeIf(filter);
//        strings.removeIf(string -> string.startsWith("t"));
////        strings.removeIf(string -> !string.startsWith("t"));
////        Consumer<String> action = System.out::println;
////        Consumer<String> action = string -> System.out.println(string);
////        strings.forEach(System.out::println);
//        strings.forEach(string -> System.out.println(string));

        //Supplier, Consumers, Predicates and Functions (Chapter 3)
//        User sarah = new User("Sarah");
//        User james = new User("James");
//        User mary = new User("Mary");
//        User john = new User("John");
//
//        List<User> users = new ArrayList<>(List.of(sarah, james, mary, john));
//        List<String> names = new ArrayList<>();
//        Function<User, String> toName = (User user) -> user.getName();
//        for (User user: users) {
////            System.out.println("Name: " + toName.apply(user));
//            String name = toName.apply(user);
//            names.add(name);
//        }
////        Consumer<User> action = System.out::println;
////        Consumer<User> action = u -> System.out.println(u);
////        users.forEach(System.out::println);
//        users.forEach(u -> System.out.println(u));
////        names.forEach(System.out::println);
////        names.forEach((String s) -> System.out.println(s));
//        names.forEach(s -> System.out.println(s));

        //Objects and primirive types
//        IntSupplier supplier = () -> 10 + 15;
//        int j = 20;
//        int i = supplier.getAsInt() + j;
//        System.out.println("i = " + i);
//
//        DoubleToIntFunction function = value -> (int)(Math.floor(value));
//        int pi = function.applyAsInt(Math.PI);
//        System.out.println("Integer PI = " + pi);

        //Chapter 5: Creating lambdas by chaining and composing other lambdas
//        Consumer<String> c1 = s -> System.out.println("c1 consumes " + s);
//        Consumer<String> c2 = s -> System.out.println("c2 consumes " + s);
//
//        Consumer<String> c3 = c1.andThen(c2);
//
//        c3.accept("Hello");

//        Predicate<String> isNull = Objects::isNull;
//        Predicate<String> isNull = s -> s == null;
//        System.out.println("For Null = " + isNull.test(null));
//        System.out.println("For Hello = " + isNull.test("Hello"));

//        Predicate<String> isEmpty = String::isEmpty;
//        Predicate<String> isEmpty = s -> s.isEmpty();
//        System.out.println("For Empty = " + isEmpty.test(""));
//        System.out.println("For Hello = " + isEmpty.test("Hello"));
//        Predicate<String> p = isNull.negate().and(isEmpty.negate());
//        System.out.println("For Null = " + p.test(null));
//        System.out.println("For Empty = " + p.test(""));
//        System.out.println("For Hello = " + p.test("Hello"));

//        List<String> strings =
//                Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
//
//        Comparator<String> comparator =
//                (s1, s2) -> s1.compareTo(s2);
//
//        strings.sort(comparator);
//        System.out.println("Sort to alphabet: " + strings);

////        Function<String, Integer> toLength = String::length;
//        Function<String, Integer> toLength = s -> s.length();
//
////        Comparator<String> comparator2 =
////                (s1, s2) -> Integer.compare(s1.length(), s2.length());
//        Comparator<String> comparator2 = Comparator.comparing(toLength);
//
//        strings.sort(comparator2);
//        System.out.println("Sort to length: " + strings);

        User sarah = new User("Sarah", 28);
        User james = new User("James", 35);
        User mary = new User("Mary", 33);
        User john1 = new User("John", 24);
        User john2 = new User("John", 25);

        List<User> users = new ArrayList<>(List.of(sarah, james, mary, john1, john2));

//        Comparator<User> comparator = Comparator.comparing(User::getName);
        Comparator<User> comparatorName = Comparator.comparing(user -> user.getName());
//        Comparator<User> comparatorAge = Comparator.comparing(User::getAge);
        Comparator<User> comparatorAge = Comparator.comparing(user -> user.getAge());
        Comparator<User> comparator = comparatorName.thenComparing(comparatorAge);
        Comparator<User> reversed = comparator.reversed();

        users.sort(reversed);
//        users.forEach(System.out::println);
        users.forEach(u -> System.out.println(u));
    }

}
