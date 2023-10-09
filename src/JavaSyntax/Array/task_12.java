package JavaSyntax.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_12 {
    public static String [] strings = new String[] {"I", "love", "JAVA"};
    public static int[] ints = new int[] {1, 2,3,4,5,6,7,8, 9};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        System.out.println(str);

        String s = Arrays.toString(ints);
        System.out.println(s);
    }
}
