package academy.learnprogramming;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
     //   myMethod();
        anotherMethod();
    }

    public static void myMethod() throws Exception {
        throw new Exception("Failed to load");
    }

    public static void anotherMethod() throws RuntimeException {
        throw new RuntimeException("Wrong parameter");
    }
}
