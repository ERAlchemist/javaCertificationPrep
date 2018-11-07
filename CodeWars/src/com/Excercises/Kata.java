package com.Excercises;
//
//import java.util.Arrays;
//
//public class Kata {
//
//    public static double findUniq(double[] arr) {
//        double number = arr[0];
//        for (double num : arr) {
//            double test = Kata.finder(arr, num);
//            if (test == 0.13764) {
//                continue;
//            } else {
//                number = test;
//            }
//        }
//        return number;
//    }
//
//    public static double finder(double[] arr, double num) {
//        Arrays.sort(arr);
//        double unique = 0.13764;
//        int index = Arrays.binarySearch(arr, num);
//        if (index == 0) {
//            unique = arr[index] != arr[index + 1] ? arr[index] : unique;
//        } else if (index == arr.length - 1) {
//            unique = arr[index] != arr[index - 1] ? arr[index] : unique;
//        } else {
//            if ((arr[index] != arr[index + 1]) && (arr[index] != arr[index - 1])) {
//                unique = arr[index];
//            }
//            return unique;
//
//        }
//    }
//}
