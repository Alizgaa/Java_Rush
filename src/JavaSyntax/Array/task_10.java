package JavaSyntax.Array;

public class task_10 {
    public static void main(String[] args) {
        int[][] result = new int[10][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }
        for (int [] row : result){
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
