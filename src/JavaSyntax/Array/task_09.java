package JavaSyntax.Array;

public class task_09 {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] ints : MULTIPLICATION_TABLE) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }
    }
}