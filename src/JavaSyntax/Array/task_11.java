package JavaSyntax.Array;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] multiArray = new String[n][];
        for (int i = 0; i < multiArray.length; i++) {
            int col = scanner.nextInt();
            multiArray[i] = new String[col];
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = "[]";
            }
        }
        for (String[] row : multiArray) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
