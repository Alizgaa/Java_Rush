package JavaSyntax.Array;

import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] stringArray = new String[6];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < stringArray.length; i++) {
            String currentSring = stringArray[i];
            for (int j = i + 1; j < stringArray.length; j++) {
                if (currentSring == null) {
                    break;
                }
                if (currentSring.equals(stringArray[j])) {
                    stringArray[j] = null;
                    stringArray[i] = null;
                }
            }
        }

        for (String s : stringArray) {
            System.out.println(s);
        }

    }
}
