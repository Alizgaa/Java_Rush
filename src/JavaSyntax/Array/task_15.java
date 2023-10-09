package JavaSyntax.Array;

import java.util.Arrays;

public class task_15 {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 15;

    public static void main(String[] args) {
//        if (array.length % 2 == 0) {
//            Arrays.fill(array, valueStart);
//            Arrays.fill(array, array.length/2 , array.length, valueEnd);
//        }else {
//            Arrays.fill(array, valueStart);
//            Arrays.fill(array, array.length/2 + 1, array.length, valueEnd);
//        }
//        System.out.println(Arrays.toString(array));

        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
