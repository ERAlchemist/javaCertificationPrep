package academy.learnprogramming;

public class StringEquality {

    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");

        System.out.println("name == anotherName -> " + (name == anotherName));
        System.out.println("name == john -> " + (name == john));
        System.out.println("name == newName -> " + (name == newName));

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));

        System.out.println("name - identityHasCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHasCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHasCode -> " + System.identityHashCode(john));
        System.out.println("newName - identityHasCode -> " + System.identityHashCode(newName));

        System.out.println("*******************");

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        String str4 = "ab" + "c";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        System.out.println("*******************");
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
    }
}
