package academy.learnprogramming;

import java.util.Arrays;

public class SearchingArrays {
    // Rule 1:  Array needs to be sorted
    // Rule 2:  If item is found -> returns positive number (item index)
    // Rule 3:  If item is not found -> returns negative number (index of where item should be (starting at -1))
    public static void main(String[] args) {


        int[] numbers = {1,3,5,6,7};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};
        System.out.println(".................");
        Arrays.sort(notSortedNumbers);

        System.out.println(Arrays.toString(notSortedNumbers));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
    }
}
