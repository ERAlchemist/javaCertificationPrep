package academy.learnprogramming;

public abstract class Dog extends Animal implements HasTail, CanRun{

    public Dog(int age) {
        super(age);
        System.out.println("Dog");

    }

    @Override
    public int getTailLength() {
        return 5;
    }



    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    public abstract void printName();

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;  //super is needed to prevent never ending recursive loop
    }

}
