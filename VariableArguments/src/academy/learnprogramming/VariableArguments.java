package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {

  //  public static void main(String[] args) { }

    public static void main(String...args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        print(args);
        print("Java");
        print("this", "is", "my", "string", "array");
        print("variable", "arguments", "are", "nice", "and", "useful", "feature");
    }

    private static void print(String...myArguments) {
        System.out.println(Arrays.toString(myArguments));
    }
}
