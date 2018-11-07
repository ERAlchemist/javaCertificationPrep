package com.Excercises;

public class Cat {
    public String name;
    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch(NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
        }
        public static void main (String[] args) {
            Cat jerry = new Cat();
            jerry.run();
            System.out.print("6");
        }
}
