package JavaSyntax.Array;

public class task_02 {
    static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = "Чётный";
            } else {
                strings[i] = "Нечётный";
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
