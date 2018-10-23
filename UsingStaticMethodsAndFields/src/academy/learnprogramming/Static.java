package academy.learnprogramming;

public class Static {

    private String name = "Static";

    public static void one() {}
    public static void two() {}

    public static void three() {
        one();
        two();
      //  four();  cannot call non-static method  -> ONLY STATIC METHODS CAN CALL OTHER STATIC METHODS DIRECTLY
    }

    public void four() {
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
     //   four(); -> not static

        Static myInstance = new Static();
        myInstance.four();

        new Static().four();

    }
}
