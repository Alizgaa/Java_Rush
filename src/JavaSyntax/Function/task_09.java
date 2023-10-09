package JavaSyntax.Function;

import java.util.Arrays;

public class task_09 {
    public static void main(String[] args) {
        int [] array = {123, 4, 5,6,0, -4, 4};

        System.out.println("В массиве: ");
        printArray(array);
        System.out.println("Min: " + getMinValue(array));
        System.out.println("Max: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinValue(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int[] array){
//        for (int element : array){
//            System.out.print(element + " ");
//        }
        System.out.println(Arrays.toString(array));
    }
}