package test.testnow;


import com.sun.xml.internal.bind.util.Which;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Test {


    public static void main(String[] args) {


    }





    public int solution(int number) {
        int start3 = number/3;
        int start5 = number/5;
        ArrayList<Integer> mult3 = new ArrayList<>();
        ArrayList<Integer> mult5 = new ArrayList<>();
        int sum = 0;

        for(int i = 3; i <= start3*3; i+=3){
            mult3.add(i);
        }
        for(int i = 5; i <= start5*5; i+=5){
            mult5.add(i);
        }

        for(int i = 0; i< mult5.size(); i++ ){
            int x = mult5.get(i);
            if(!mult3.contains(x)){
                mult3.add(x);
            }
        }

        for(Integer num : mult3){
            sum += num;
        }
        return sum;

    }

