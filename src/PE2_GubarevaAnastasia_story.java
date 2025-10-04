import java.util.Scanner;

public class PE2_GubarevaAnastasia_story {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        // Declare Variables
        boolean pickUpRing;
        boolean rivendell;
        boolean trustElves;
        boolean useRing;
        boolean askHelpEnts;
        boolean hasRing;
        boolean isInRivendell;
        boolean isInMountain;

        // Start of the story
        System.out.println("---Story: The Found Ring---");
        System.out.println("\nYou are wandering through the peaceful lands of the Shire when suddenly you notice a shining ring on the grass.");

        // Decision 0: Pick up the ring or leave the ring
        System.out.println("\nDo you pick up the ring? (True/False)");
        pickUpRing = reader.nextBoolean();
        hasRing = pickUpRing;

        if (pickUpRing) {
            System.out.println("\nSoon, you reach a crossroad.");
            
            // Decision 1: Do you travel to Rivendell to seek counsel, or to the Lonely Mountain to hide the ring?
            System.out.println("\nDo you travel to Rivendell to seek counsel?");
            System.out.println("\nOr do you go to Lonely Mountain to hide the ring?");
            System.out.println("\nRivendell = True");
            System.out.println("Lonely Mountain = False");
            rivendell = reader.nextBoolean();
            isInRivendell = rivendell; // This means the player is in Rivendell
            isInMountain = !rivendell; // This means the player is in the Lonley Mountain

            if (hasRing && isInRivendell) { // This means that the player has the ring AND is in Rivendell
                System.out.println("\nThe elves welcome you.");
                
                // Decision 2: Do you trust them with the ring or keep it to yourself?
                System.out.println("\nDo you trust the elves with the ring");
                System.out.println("\nOr do you keep the ring to yourself?");
                System.out.println("\nTrust the elves = True");
                System.out.println("Keep the ring to yourself = False");
                trustElves = reader.nextBoolean();

                if (hasRing && trustElves) { // This means that the player has the ring AND that also trust's the elves
                    System.out.println("\nHAPPY ENDING! The ring is destroyed after a wise council.");
                } else if (hasRing && !trustElves) { // This means that the player has the ring AND that does not trust the elves
                    System.out.println("TRAGIC ENDING. The ring slowly corrupts you until you become the new Dark Lord.");
                }
            }
            
            if (hasRing && isInMountain) { // This means that the player has the ring AND is in Lonley Mountain
                System.out.println("\nThe dragon's cavern still holds treasure.");
                
                // Decision 2: Do you hide the ring there or use it?
                System.out.println("\nDo you hide the ring there or use it?");
                System.out.println("\nUse the ring = True");
                System.out.println("Hide the ring = False");
                useRing = reader.nextBoolean();

                if (hasRing && useRing) { // This means that the player has the ring AND that uses the ring
                    System.out.println("\nTRAGIC ENDING. The dragon awakens and burns you, but the ring survives.");
                } else if (hasRing && !useRing) { // This means that the player has the ring AND that does not uses the ring
                    System.out.println("\nMYSTERIOUS ENDING. The ring remains hidden in the mountain for ages.");
                }
            }
            
        } else {
            System.out.println("\nYou continue peacefully until you enter the dark forest of Fangorn.");
            System.out.println("\nDo you ask the Ents for help, or do you continue alone?");
            System.out.println("\nAsk the Ents for help = True");
            System.out.println("Continue alone = False");
            askHelpEnts = reader.nextBoolean();
            
            if (!hasRing && askHelpEnts) { // 
                System.out.println("\nHEROIC ENDING! They protect you, and together you defend the forest against Sauron's forces.");
            } else if (!hasRing && !askHelpEnts) {
                System.out.println("\nTRAGIC ENDING. You reach a clearing, where a Nazgûl attacks you.");
            }
        }
        
        reader.close();
    }
}
