package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Jonson");
    }

    public Person(String firstName, String last) {
        // this();  // does not compile
        this.firstName = firstName;
        // this.lastName = last;
        // String firstName = "myName";
         lastName = last;
    }

    public void setFirstName(String firstName) {
       // this();  --> only allowed in constructors
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
      //  return this.firstName + " " + this.lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getFullName());
    }
}
