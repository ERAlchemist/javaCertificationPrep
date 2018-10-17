package academy.learnprogramming;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};
        System.out.println("**normal for loop***");
        for(int i = 0; i < names.length; i++) {
            System.out.println("names= " + names[i]);

        }
        System.out.println("**For Each loop***");
        for(String name : names) {
            System.out.println("name= " + name);
        }

        for(String name : names ) {
            name = name + " " + name;
        }

        for(String name : names) {
            System.out.println("name= " + name);
        }

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")

        };

        for(StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for(StringBuilder builder : builders ) {
            builder.append("123");
        }

        for(StringBuilder builder : builders) {
            System.out.println(builder);
        }

        String pets = "parrot";

    //    for(String pet : pets) {} // does not compile

   //     for(int name : names) {} // does not compile -> incompatible types

        for(char c : pets.toCharArray()) {
            System.out.println(c);
        }
    }
}
