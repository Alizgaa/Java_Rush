package JavaSyntax.Function;

public class task_04 {
    public static void main(String[] args) {

        String navigator = "Alizgaa";
        String pilot = "Babi";
        String secondPilot = "Unuruu";
        String flightIngeneer = "Alizgaa";
        createCrew(navigator, pilot, secondPilot, flightIngeneer);

    }
    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, который предстоит покорить космос");
        System.out.println("Штурман: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second Pilot: " + secondPilot);
        System.out.println("Ingeneer: " + flightEngineer);

    }
}
