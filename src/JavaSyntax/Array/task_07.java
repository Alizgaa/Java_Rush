package JavaSyntax.Array;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0-ээс их бүхэл тоо оруулна уу!");
        int n = scanner.nextInt();
        if (n > 0){
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int maxArray = array[0];
            for (int j : array) {
                if (j > maxArray)
                    maxArray = j;
            }
            System.out.println(n=maxArray);

        } else {
            do {
                System.out.println("Та 0-ээс их бүхэл тоо оруулна уу!!");
                n = scanner.nextInt();
            } while (n <= 0);
        }
    }
}
