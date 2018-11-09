package com.Excercises;

import com.sun.org.apache.xpath.internal.operations.And;
import com.sun.xml.internal.bind.util.Which;

public class Questions {

    interface Writable
    {
        public void writeBook();
        public void setBookMark();
    }
    abstract class Book implements Writable //Line-1
    {
        public void writeBook(){}
        //Line-2
    }
    class EBook extends Book  //Line-3
    {
        public void writeBook(){}
        //Line-4
    }
    And given the code Fragment:

    Book b1= new EBook();
    b1.writeBook();

}

public class Test{
    public static void main(String[] args){
        Short s1 = 200;
        Integer s2= 400;
        Long s3 = (long)s1+s2;//Line-1
        String s4 = (String)(s3*s2);//Line-2
        System.out.println(s3);
    }
}
interface Interf
{
    public void m1();
    public void m2();
}
class A implements Interf
{
    public void m1(){}
}


public class Employee
{
    String name;
    boolean contract;
    double salary;
    float check;
    Employee()
    {
        //line-1
        contract = TRUE;
        salary = 100f;

    }
    public String toString()
    {
        return name+":"+contract+":"+salary;
    }
    public static void main(String[] args)
    {
        Employee e = new Employee();
        //Line-2
        System.out.println(e);
    }

    class Vehicle
    {
        String type="4w";
        int maxSpeed=120;
        Vehicle(String type,int maxSpeed)
        {
            this.type=type;
            this.maxSpeed=maxSpeed;
        }
    }
    class Car extends Vehicle
    {
        String trans;
        Car(String trans)
        {
            //Line-1
            this.trans=trans;
        }
        Car(String type,it maxSpeed,String trans)
        {
            super(type,maxSpeed);
            this(trans);//Line-2
        }

        class Animal
        {
            String type="Canine";
            int maxSpeed=60;
            Animal(){}
            Animal(String type,int maxSpeed)
            {
                this.type=type;
                this.maxSpeed=maxSpeed;
            }
        }
        class WildAnimal extends Animal
        {
            String bounds;
            WildAnimal(String bounds)
            {
                //line-1
            }
            WildAnimal(String type,int maxSpeed,String bounds)
            {
                //line-2
            }
        }
        And the code fragment:

        WildAnimal wolf= new WildAnimal("Long");
        WildAnimal tiger= new WildAnimal("Feline",80,"Short");
System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);

        Which 2 modifications enable to the code to print the following output?

        Canine 60 Long
        Feline 80 Short
}

    Base.java:
    class Base
    {
        public void test()
        {
            System.out.println("Base");
        }
    }

    DerivedA.java:
    class DerivedA extends Base
    {
        public void test()
        {
            System.out.println("DerivedA");
        }
    }

    DerivedB.java
    class DerivedB extends DerivedA
    {
        public void test()
        {
            System.out.println("DerivedB");
        }
        public static void main(String[] args)
        {
            Base b1= new DerivedB();
            Base b2= new DerivedA();
            Base b3= new DerivedB();
            b1=(Base)b3;
            Base b4=(DerivedA)b3;
            b1.test();
            b4.test();
        }
    }

    class A
    {
        public A()
        {
            System.out.println("A");
        }
    }
    class B extends A
    {
        public B()
        {
            //line-1
            System.out.println("B");
        }
    }
    class C extends B
    {
        public C()
        {
            //line-2
            System.out.println("C");
        }
        public static void  main(String[] args)
        {
            C c = new C();
        }
    }