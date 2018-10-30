package academy.learnprogramming;

public class Cat extends Animal implements  Run {

    public Cat (int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    @Override
    public void printName() {

    }

    @Override
    public int getSpeed() {
        return 15;
    }



}
