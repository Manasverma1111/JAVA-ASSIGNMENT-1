import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the index where insertion sort should start: ");
        int index = scanner.nextInt();
        insertionSort(array, index);
        System.out.println("\nSorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
    private static void insertionSort(int[] array, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements that are greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}


