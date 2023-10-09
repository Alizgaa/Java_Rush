package JavaSyntax.Function;

import java.util.SplittableRandom;

public class task_03 {
    public static void main(String[] args) {
        String firstName = "Alizgaa";
        String lastName = "Sharaa";
        String favouriteDish = "bansh";
        printPersonInfo(firstName, lastName, favouriteDish);
    }
    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Summary profiles: ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Favourite dish: " + meal);
    }
}
