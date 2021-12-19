public class Polymorphism_Constructor {
    public static void main(String[] args) {

        // Person p1 = new Person();

        // p1.name = "Faraz";
        // p1.age = 22;

        // p1.walk();

        // Person p2 = new Person();

        // p2.name = "Adam";
        // p2.age = 21;

        // p1.eat();
        // p1.walk(9999);

        // System.out.println(Person.count); // . Calling Static variable

        Person a = new Person("Faraz", 22);
        a.walk(55);

    }
}

class Person {
    String name;
    int age;
    static int count; // . It will become class property not object of class property

    Person() // . Default constructor
    {
        System.out.println("Calling constructor");
        count++;
    }

    Person(String new_name, int new_age) // . Constructor Overloading
    {
        name = new_name;
        age = new_age;
    }

    void walk() {
        System.out.println(name + " is walking ");
    }

    void eat() {
        System.out.println(name + " is eating  ");
    }

    void walk(int steps) {
        System.out.println(name + " at age " + age + " walked " + steps + " steps ");
    }

}