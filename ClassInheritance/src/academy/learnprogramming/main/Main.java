package academy.learnprogramming.main;

import academy.learnprogramming.Animal;
import academy.learnprogramming.Bear;
import academy.learnprogramming.Dog;
import academy.learnprogramming.Husky;

public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.setName("Rex");
        husky.printDetails();
        husky.setAge(6);
     //   husky.printName();
        husky.printDetails();
        husky.run(10);
        System.out.println("tail length= " + husky.getTailLength());
        System.out.println("weight= " + husky.getWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());

      //  Animal animal = new Animal(); // abstract classes cannot be instantiated!!

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

    }
}
