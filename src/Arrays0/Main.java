public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 99);
        sda.insert(1, 2);
        sda.insert(10, 3);
        sda.insert(1, 3);

        // var firstElement = sda.arr[99];
        // System.out.println(firstElement);
        // sda.traverseArray();
        sda.search(99);
    }
}
