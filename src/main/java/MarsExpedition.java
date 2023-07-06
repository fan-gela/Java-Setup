import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarsExpedition {
    public void marsExpedition() throws InterruptedException {
        System.out.println("Booting...");
        Thread.sleep(100);
        System.out.println("System setup complete!");

        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String playerName = input.next();

        System.out.println("Hi, " + playerName + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        input = new Scanner(System.in);
        String playerResponse = input.next();

        if (playerResponse.equalsIgnoreCase("y") || playerResponse.equalsIgnoreCase("yes")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (playerResponse.equalsIgnoreCase("n") || playerResponse.equalsIgnoreCase("no")) {
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("Invalid response.");
        }


        int teamSize = 0;
        try {
            System.out.println("How many people do you want on your team?");
            input = new Scanner(System.in);
            int teamNumberRequest = Integer.parseInt(input.next());

            if (teamNumberRequest > 2) {
                System.out.println("That’s way to many people. We can only send 2 more members.");
            } else if (teamNumberRequest < 2) {
                System.out.println("That's not enough people. We need to send at least 2 members.");
            } else if (teamNumberRequest == 2) {
                System.out.println("That is the perfect amount of team members!");
            }
            teamSize = 2;
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid number, try again.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        input = new Scanner(System.in);
        String snackChoice = input.next();
        System.out.println(String.format("Nice choice, you will be bringing a %s with you.", snackChoice));


        Map<String, String> carMap = new HashMap<>();
        carMap.put("A", "Chevy");
        carMap.put("B", "Suburu");
        carMap.put("C", "Mazda");
        carMap.put("D", "Ford");

        System.out.println("Pick a vehicle from this list:");
        for (String key : carMap.keySet()) {
            System.out.println(String.format("Key: %s, Value: %d", key, carMap.get(key)));
        }

        input = new Scanner(System.in);
        String carChoiceOption = input.next();
        String carChoice = carMap.get(carChoiceOption);

        System.out.println(playerName + ", you are ready to go with a team of " + String.valueOf(teamSize) + " members, " + snackChoice + " for a snack, and a " + carChoice + " to drive!");

    }
}
