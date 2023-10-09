package JavaSyntax.Array;

import java.util.Arrays;

public class task_14 {
    public  static int [][] arrayFirst= new int[][] {{1,2,3}, {4, 5, 6}};

    public  static int [][] arraySecond= new int[][] {{1,2,3}, {4, 5, 6}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
    }
}
