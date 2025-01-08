package Generic;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        String[] word = {"Hello", "World"};

        printArray(numbers);
        printArray(word);

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}