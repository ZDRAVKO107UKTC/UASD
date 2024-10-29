import java.util.Random;

public class V_K_Z {
    public static void main(String[] args) {
        Random random = new Random();


        boolean[] itemsOnSite1 = {true, true, true}; // [wolf, goat, cabbage]
        boolean boatOnSite1 = true; // true = on site 1, false = on site 2

        for (int i = 0; i < itemsOnSite1.length; i++) {
            itemsOnSite1[i] = random.nextBoolean();
        }

        printState(itemsOnSite1, boatOnSite1);


        while (itemsOnSite1[0] || itemsOnSite1[1] || itemsOnSite1[2]) {


            if (boatOnSite1 && itemsOnSite1[1]) {
                itemsOnSite1[1] = false;
                boatOnSite1 = false;
                System.out.println("We move goat to site 2");
            }
            printState(itemsOnSite1, boatOnSite1);
            if (!isValidState(itemsOnSite1, boatOnSite1)) return;

            if (boatOnSite1 && itemsOnSite1[2]) {
                itemsOnSite1[2] = false;
                boatOnSite1 = false;
                System.out.println("We move cabbage to site 2");
            }
            printState(itemsOnSite1, boatOnSite1);
            if (!isValidState(itemsOnSite1, boatOnSite1)) return;


            if (!boatOnSite1 && !itemsOnSite1[1]) {
                itemsOnSite1[1] = true;
                boatOnSite1 = true;
                System.out.println("We move goat from site 2 to site 1");
            }
            printState(itemsOnSite1, boatOnSite1);
            if (!isValidState(itemsOnSite1, boatOnSite1)) return;

            if (boatOnSite1 && itemsOnSite1[0]) {
                itemsOnSite1[0] = false;
                boatOnSite1 = false;
                System.out.println("We move wolf to site 2");
            }
            printState(itemsOnSite1, boatOnSite1);
            if (!isValidState(itemsOnSite1, boatOnSite1)) return;
        }

        System.out.println("All items have been moved to site 2!");
    }

    private static void printState(boolean[] items, boolean boatOnSite1) {
        System.out.println("Current State:");
        System.out.println("Wolf on site 1: " + items[0]);
        System.out.println("Goat on site 1: " + items[1]);
        System.out.println("Cabbage on site 1: " + items[2]);
        System.out.println("Boat on site 1: " + boatOnSite1);
        System.out.println();
    }

    private static boolean isValidState(boolean[] items, boolean boatOnSite1) {
        boolean wolfOnSite1 = items[0] == boatOnSite1;
        boolean goatOnSite1 = items[1] == boatOnSite1;
        boolean cabbageOnSite1 = items[2] == boatOnSite1;

        if (goatOnSite1 && cabbageOnSite1 && !wolfOnSite1) {
            System.out.println("Invalid state! Goat and cabbage are alone together.");
            return false;
        }
        if (wolfOnSite1 && goatOnSite1 && !cabbageOnSite1) {
            System.out.println("Invalid state! Wolf and goat are alone together.");
            return false;
        }

        return true;
    }
}