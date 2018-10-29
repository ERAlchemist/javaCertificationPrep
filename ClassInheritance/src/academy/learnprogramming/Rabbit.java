package academy.learnprogramming;

public class Rabbit extends Animal {

    public Rabbit() {
     //   super;  // doesn't compile
      //  super().setAge(3);  //doesn't compile

        super();
     //   super.setAge(3);
      //  this.setAge(3);
        setAge(3);
    }

    public Rabbit (int age) {
        // this(age); recursive call
     //   super();
      //  this();
      //  setAge(3);
        super(3);
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printName() {

    }
}
