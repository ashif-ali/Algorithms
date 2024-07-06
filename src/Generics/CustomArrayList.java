package Generics;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        this.data[size] = num;
        size += 1;
    }

    private void resize() {
        int[] newData = new int[2 * this.data.length];
        for (int i = 0; i < this.size; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    private boolean isFull() {
        return size == this.data.length;
    }

    public int remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list.");
        }
        return data[--size];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        data[index] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        CustomArrayList customList = new CustomArrayList();
        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        System.out.println("After adding elements: " + customList);

        customList.remove();
        customList.remove();
        System.out.println("After removing elements: " + customList);

        customList.set(1, 10);
        System.out.println("After setting index 1 to 10: " + customList);

        System.out.println("Element at index 2: " + customList.get(2));
        System.out.println("Size of the list: " + customList.size());
    }
}
