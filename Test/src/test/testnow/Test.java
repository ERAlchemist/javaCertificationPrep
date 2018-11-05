package test.testnow;


import com.sun.xml.internal.bind.util.Which;


import java.util.*;

public class Test {

    public static char findMissingLetter(char[] array)
    {  String lttrs = "abcdefghijklmnopqrstuvwxyz";
        char[] letters = lttrs.toCharArray();
        int start = Arrays.binarySearch(letters, Character.toLowerCase(array[0]));
        int end = Arrays.binarySearch(letters, Character.toLowerCase(array[array.length-1]));
        char[] sequence = new char[array.length+1];
        int count = 0;
        char x = '1';
        for(int i = start; i<=end; i++){
            sequence[count] = letters[i];
            count++;
        }
        System.out.println("sequence: " + sequence);
        for(int i = 0; i< array.length; i++) {
            if(array[i] != sequence[i]){
                x = sequence[i];
                System.out.println("x= " + x);
            }
        }
        boolean test = Character.isUpperCase(array[0]);
        if(test){
            return Character.toUpperCase(x);
        }else {
            return x;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a','b','d','e'};
        char[] arr2 = {'D','E','F','H'};
        System.out.println("arr-->"+Test.findMissingLetter(arr));
        System.out.println("arr2-->"+Test.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        new Animal(5);
        new Horse();

    }


}

 class Animal {
    public Animal(int age) {
        System.out.print("Animal");
    }
}

 class Horse extends Animal {
    public Horse() {
        super(4);
        System.out.print("Horse");
    }
}

interface Shell {
    abstract int getNumberOfSections();
}
abstract class Insect implements Shell {
    abstract int getNumberOfLegs();
}

 class Beetle extends Insect {
    int getNumberOfLegs() {return 6;}

}



