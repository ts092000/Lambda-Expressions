package com.bkitsolution;


import java.util.function.Consumer;
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
        Supplier<String> supplier = () -> {
            System.out.println("I am inside the Supplier");
            return "Hello";
        };
        String string = supplier.get();
        System.out.println("string = " + string);

        //Consumer
//        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer = (String s) -> {
            System.out.println("I am inside the Consumer");
            System.out.println(s);
        };
        consumer.accept("Hello");
    }

}
