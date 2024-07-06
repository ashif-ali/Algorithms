package Abstract;

public class Main {
    public static void main(String[] args) {
        Parent ch1 = new Child(23);
        ch1.career();
        System.out.println(ch1.getName());
        Parent.hello();
    }
}
