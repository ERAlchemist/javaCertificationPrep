package test.testnow;


import com.sun.xml.internal.bind.util.Which;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Test {


    public static void main(String[] args) {
        int[] s = {10, 20, 30};
        int size = 3;
        int i = 0;
        while (i < size) i++;
        System.out.println("The Top Element:" + s[i]);

    }
}
class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

