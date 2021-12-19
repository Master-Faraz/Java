
public class Inheritance_Encapculation_Abstraction {
    public static void main(String[] args) {

        // Child c = new Child("faraz", 22);
        // c.walk();
        // c.details();

        Encapculation obj = new Encapculation(); // Calling function from another java file
        obj.det();

    }

}

class Parent {
    String name;
    int age;
    static int count;

    Parent() // . Default constructor
    {
        // System.out.println("Calling constructor");
        count++;
    }

    Parent(String name, int age) // . Constructor Overloading
    {
        this(); // . Always called in beguinning calling default constructor
        this.name = name;
        this.age = age;
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

class Child extends Parent {
    public Child(String name, int age) {
        super(name, age); // . This will call parent constructor
    }

    void details() {
        System.out.println("Child class : ");
        System.out.println("Name is " + name + " and age is " + age);
    }

    void walk() {
        System.out.println("Child Class : ");
        System.out.println(name + " is walking ");
    }

}