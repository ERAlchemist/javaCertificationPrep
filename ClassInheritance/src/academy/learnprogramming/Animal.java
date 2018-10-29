package academy.learnprogramming;

// 1. Abstract classes cannot be instantiated directly

// 2. Abstract classes can have 0 to many abstract methods

// 3. Abstract classes cannot be private

// 4. Abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods

// 5. The first concrete class that extends an abstract class must provide implementation for all of the inherited abstract

public abstract class Animal {

    private int age;
    private String name;

    public Animal() {

    }



    public Animal (int age) {
        System.out.println("Animal");
        this.age = age;
    }

    // 1. Abstract method can only be defined in abstract classes

    // 2. Abstract method can not be declared private or final

    // 3. Abstract methods must not provide a method body/implementation in the abstract class in which it is declared

    // 4. implementing abstract method in subclass follows the same rules for overrideing a method, e.g. method signature must be the same and access modifier
    // needs to be the same or higher;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void printName();

    public void printDetails() {
      printName();
        System.out.println("age= " + age);
    }

    public void eat() {
        System.out.println("Animal is eating " );
    }

    public double getAverageWeight() {
        return 10.0;
    }

 //   public static abstract void run();  // cannot be static and abstract at the same time

 //   public abstract void run() {    // abstract methods cannot have a body
   //     System.out.println("running");
  //  }

    public abstract int getWeight();
}
