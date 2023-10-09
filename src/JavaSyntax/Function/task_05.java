package JavaSyntax.Function;

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2 + 1; i++) {
            int b = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length-i - 1] = b;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
