package com.Excercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {

    //    public static int[] deleteNth(int[] elements, int maxOccurrences) {
//       // HashMap<Integer, Integer> countMap = new HashMap<>();
//       // HashMap<Integer, Integer[]> indicesMap = new HashMap<>();
//        List<Integer> returnList = new ArrayList<>();
////        for(int num : elements){
////          //  countMap.put(num, EnoughIsEnough.count(elements, num));
////           // indicesMap.put(num, EnoughIsEnough.findIndices(elements, num));
////        }
//        for(int num : elements) {
//            int testCount = EnoughIsEnough.count(elements, num);
//            if( testCount <= maxOccurrences){
//                returnList.add(num);
//                continue;
//            }
//            if(testCount > maxOccurrences){
//                int occurenceCount = 0;
//                Integer[] testIndices = EnoughIsEnough.findIndices(elements, num);
//                while(occurenceCount < maxOccurrences+1){
//                    for(int x : testIndices){
//                        returnList.add(x, num);
//                        occurenceCount++;
//                    }
//                }
//
//            }
//        }
//       int[] returnArray = new int[returnList.size()];
//        for(int i = 0; i<returnList.size(); i++){
//            returnArray[i] = returnList.get(i);
//        }
//        return returnArray;
//    }
//
//    public static int count (int[] arr, int num) {
//        int count = 0;
//        for(int number : arr) {
//            if(number == num) {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static Integer[] findIndices (int[] arr, int num) {
//        int numCount = EnoughIsEnough.count(arr, num);
//        int[] ind = new int[numCount];
//        int counter = 0;
//        for( int i = 0; i<arr.length; i++){
//            if( arr[i] == num){
//                ind[counter] = new Integer(i);
//            }
//            counter++;
//        }
//        return ind;
//    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        StringBuilder sb = new StringBuilder();
        for(int num : elements) {
            sb.append(num);
        }
        System.out.println("sb = " + sb.toString());
    }
}