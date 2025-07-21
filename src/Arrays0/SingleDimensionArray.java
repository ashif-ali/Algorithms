public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeofArray) {
        arr = new int[sizeofArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access the array");
        }
    }

    // Traverse array

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }
        } catch (Exception e) {

            System.out.println("Array no longer exists");
        }
    }

    // Search for an element in the given array
    public void search(int value) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == value) {
                System.out.println("\nValue found at index " + idx);
                return;
            }
        }
        System.out.print("\n" + value + " not found");

    }

}
