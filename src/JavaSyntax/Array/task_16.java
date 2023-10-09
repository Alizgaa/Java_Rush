package JavaSyntax.Array;

import java.util.Arrays;

public class task_16 {
    public static  int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2,3,4,5,6,7,8,9,10, 11, 12, 13};

    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        int [] first = Arrays.copyOfRange(array, 0 , firstPart);
        int [] second = Arrays.copyOfRange(array, firstPart, array.length);
        result[0] = first;
        result[1] = second;
        System.out.println(Arrays.deepToString(result));
    }
}
