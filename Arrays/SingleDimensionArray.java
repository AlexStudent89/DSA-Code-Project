//SingleDimensionArrays
package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        Arrays.fill(arr, Integer.MIN_VALUE); // To fill the array with the value
    }

    // 1. insert into an Array
    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted " + valueToInsert + " at index " + location);
            } else {
                System.out.println("Index " + location + " is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array: " + e);
        }
    }

    // 2. Traverse an Array
    public void traverse() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 3. To delete a value from the array
    public void deleteValue(int valueToDelete) {
        boolean valueFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = Integer.MIN_VALUE; // Replacing value with default value
                valueFound = true;
            }
        }
        if (valueFound) {
            System.out.println("Successfully deleted value " + valueToDelete + " from the array.");
        } else {
            System.out.println("Value " + valueToDelete + " not found in the array.");
        }
    }

    // 3. To delete the whole array
    public void deleteArray() {
        Arrays.fill(arr, Integer.MIN_VALUE); // To reset all the elements to default value
        System.out.println("Array deleted successfully.");
    }

    // 4. Search for an element in an Array
    public void search(int valueToSearch) {
        boolean valueFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value " + valueToSearch + " found at index " + i);
                valueFound = true;
            }
        }
        if (!valueFound) {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);

        singleDimensionArray.traverse();

        singleDimensionArray.deleteValue(3); // Deleting a value
        singleDimensionArray.traverse();

        singleDimensionArray.deleteArray(); // Deleting the whole array
        singleDimensionArray.traverse();

        singleDimensionArray.search(4); // Searching for a value
    }
}
