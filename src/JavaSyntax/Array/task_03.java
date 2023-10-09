package JavaSyntax.Array;

public class task_03 {
    public static int[] array = new int[]{-1, 2, 3, -4, -4, 3};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (-1) * array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
