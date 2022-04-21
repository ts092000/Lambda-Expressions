package com.bkitsolution;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = new ArrayList<>(List.of(sarah, james, mary, john));
        List<String> names = new ArrayList<>();
        Function<User, String> toName = (User user) -> user.getName();
        for (User user: users) {
//            System.out.println("Name: " + toName.apply(user));
            String name = toName.apply(user);
            names.add(name);
        }
//        Consumer<User> action = System.out::println;
//        Consumer<User> action = u -> System.out.println(u);
//        users.forEach(System.out::println);
        users.forEach(u -> System.out.println(u));
//        names.forEach(System.out::println);
//        names.forEach((String s) -> System.out.println(s));
        names.forEach(s -> System.out.println(s));
    }

}
