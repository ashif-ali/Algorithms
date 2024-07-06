package Abstract;

// abstract class are a special type of class where only method signature is present. It is the task of the child classes which inherits the super class to implement it or override it because abstract method in the parent class does not have any-body

// if there is an abstract method in a class the class should also be declared as abstract.

// abstract class can have constructor, but you cannot create objects of an abstract class

public abstract class Parent {
    int age;
    String name;

    public Parent(int age) {
        this.age = age;
    }

    public abstract String getName();


// abstract class can have static method

    static void hello() {
        System.out.println("hello world");
    }

    abstract void career();
}
