package JavaSyntax.Array;

import java.util.Arrays;

public class task_13 {

    public static String [][] strings= new String[][]{{"\uD83D\uDE03", "\uD83D\uDE03","\uD83D\uDE03"},{"\uD83D\uDE03"}, {"\uD83D\uDE03","\uD83D\uDE03"},{"\uD83D\uDE03"},};
    public static int [][] ints = new int[][]{{1, 2,3}, {4, 5}};
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));

    }
}
