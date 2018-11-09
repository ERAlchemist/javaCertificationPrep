package com.Excercises;

import java.util.function.*;

public class Cat {
    int age;

    public static void main(String[] args) {

    }
    private static void check(Cat cat, Predicate<Cat> pred) {
        String result = pred.test(cat) ? "match" : "not match";
        System.out.print(result);
    }

    interface Jump {
        boolean isTooHigh(int height, int limit);
    }

    public class Jumper {
        public static void main(String[] args) {
            check((h, 1) -> h.append(1).isEmpty(), 5);
        }
    }
    private static void check(Jump Jump, int height) {
        if(jump.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
