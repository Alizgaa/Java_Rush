package JavaSyntax.Array;

import java.util.Arrays;

public class task_18 {
    public static int[] array = new int[]{9, 8 , 7 ,5, 56, 4, 4, 3,2,1};
    public static int element = 5;

    public static void main(String[] args) {
        int [] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        System.out.println(Arrays.binarySearch(copy, element) >= 0);

    }
}
