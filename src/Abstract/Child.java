package Abstract;

public class Child extends Parent{

    public Child(int age) {
        super(age);

    }

    @Override
    void career() {
        this.name = "doctor";
    }

    public String getName() {
        return name;
    }
}
