package academy.learnprogramming;

class Dog {

    private String color;

    public Dog(String color) {
        System.out.println("constructor");
        this.color = color;
    }

    public void printColor() {
        System.out.println("color= " + this.color);
    }
     //   public dog() {} // does not compile

    //    public void Dog() {}  not constructor since it has return type


}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight) {
        this.length = length;
        height = theHeight;
        color = "white";
    }

    public void printInfo() {
        System.out.println("Cat length= " + this.length + " height= " + height + " color= " + color);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {

        Dog dog = new Dog("gray");

        Cat cat = new Cat(10, 12);
        cat.printInfo();

    }
}
