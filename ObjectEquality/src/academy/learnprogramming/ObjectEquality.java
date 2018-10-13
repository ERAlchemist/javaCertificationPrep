package academy.learnprogramming;

import static java.lang.System.*;

public class ObjectEquality {

    public static void main(String[] args) {
        // comparing objects
       Integer myInteger = 127;
       Integer myAnotherInteger = 127;

        out.println(myInteger == myAnotherInteger); // true

        out.println("128 == 128: " + (128 == 128)); // true

        out.println("myInteger hash: " + identityHashCode(myInteger));
        out.println("myAnotherInteger hash: " + identityHashCode(myInteger));

        myInteger = 128;
        myAnotherInteger = 128;

        out.println("myInteger= " + myInteger);
        out.println("myAnotherInteger= " + myAnotherInteger);
        out.println(myInteger == myAnotherInteger); //false

        // myInteger = 128;
        // Integer.valueOf(128);

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        out.println("int1==int2: " + (int1 == int2)); // false
        out.println("int1==int3: " + (int1 == int3)); // false
        out.println("int2==int3: " + (int2 == int3)); // false

        out.println("int1.equals(int2) : " + int1.equals(int2)); // true
        out.println("int1.equals(int3) : " + int1.equals(int3)); // true
        out.println("int2.equals(int3) : " + int2.equals(int3)); // true

        out.println("int1 hash= " + identityHashCode(int1));
        out.println("int2 hash= " + System.identityHashCode(int2));
        out.println("int 3 hash= " + System.identityHashCode(int3));


    }
}
