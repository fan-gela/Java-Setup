import java.util.*;

public class FindingsList {
    public void findingsList() throws InterruptedException {

        Thread.sleep(500);
        System.out.println("Welcome back!");

        ArrayList<String> rockCollection = new ArrayList<String>();
        Collections.addAll(rockCollection, "rock", "weird rock", "smooth rock", "not rock");
        System.out.println("Rock Collection has been downloaded. Here is the collection list: " + rockCollection);

        System.out.println("There is a non-rock on the list. I will work to delete it.");
        rockCollection.remove("not rock");
        System.out.println(rockCollection);
        System.out.println("Perfect!");

        Thread.sleep(1000);

        Map<String, String> fossilMap = new HashMap<>();
        fossilMap.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilMap.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilMap.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.next();
        System.out.println(fossilMap.get(fossilChoice));

        Thread.sleep(700);

        Set<String> supplyList = new HashSet<>(Arrays.asList("water", "food", "bowls"));
        supplyList.remove("bowls");
        System.out.println("Supplies After Expedition: " + supplyList);

    }
}
