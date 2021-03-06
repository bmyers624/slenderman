import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Scene {
    private String description;
    private Scene north;
    private Scene east;
    private Scene south;
    private Scene west;
    public ArrayList<String> sceneItems = new ArrayList<>();
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void playIntro() throws InterruptedException {
        System.out.println();
        Thread.sleep(3000);
        System.out.println("\n" +
                "\n" +
                " ▄▄▄▄▄▄▄▄▄▄▄  ▄            ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄   ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄ \n" +
                "▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌\n" +
                "▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌\n" +
                "▐░▌          ▐░▌          ▐░▌          ▐░▌▐░▌    ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌▐░▌ ▐░▌▐░▌▐░▌       ▐░▌▐░▌▐░▌    ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄▄▄ ▐░▌          ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌ ▐░▌   ▐░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌\n" +
                "▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌\n" +
                " ▀▀▀▀▀▀▀▀▀█░▌▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░▌   ▐░▌ ▐░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀ ▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌\n" +
                "          ▐░▌▐░▌          ▐░▌          ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌▐░▌          ▐░▌     ▐░▌  ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌    ▐░▌▐░▌\n" +
                " ▄▄▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌     ▐░▐░▌▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌ ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌     ▐░▐░▌\n" +
                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░░░░░░░░░░▌ ▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌      ▐░░▌\n" +
                " ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀   ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀         ▀  ▀         ▀  ▀        ▀▀ \n" +
                "                                                                                                                                  \n");

        Thread.sleep(5000);
        System.out.println(ANSI_WHITE + "You feel a breeze of crisp air against your cheek, while the other, a sensation of coarse dirt and rocks.");
        Thread.sleep(5000);
        System.out.println("You open your eyes to find yourself surrounded by a forest with seemingly no end, in total darkness.");
        Thread.sleep(5000);
        System.out.println("An overwhelmingly ominous feeling comes upon you as you gaze into the night, scanning your surroundings.");
        Thread.sleep(5000);
        System.out.println("As you stand up and fumble around, you find a watch and a flashlight, with a note laid perfectly underneath.");
        Thread.sleep(5000);
        System.out.println("You pick up the items and read the note:\n");
        Thread.sleep(5000);
        System.out.println(ANSI_BLUE + "To whoever finds this, know that there is no escape.");
        Thread.sleep(5000);
        System.out.println("There is something in the forest… something truly sinister.");
        Thread.sleep(5000);
        System.out.println("I feel like it is watching my every move, waiting for it’s opportunity to strike.");
        Thread.sleep(5000);
        System.out.println("This watch I found was set to 10 minutes, almost as if whatever brought me here was taunting me with its patience.");
        Thread.sleep(5000);
        System.out.println( "I don’t know why this is happening or what is even out there, but I’m going to find a way to stop it and make it out of this god forsaken forest.");
        Thread.sleep(5000);
        System.out.println("If I don’t make it, follow my steps and finish what I couldn’t…\n");
        Thread.sleep(5000);
        System.out.println(ANSI_WHITE + "You notice your watch’s timer mysteriously begins for 10 minutes of time.");
        Thread.sleep(5000);
        System.out.println("You look once more into the vast forest as you plan your next move…\n");
        Thread.sleep(5000);
    }

    public Scene(String story) {
        description = story;
    }
    public void describe() {
        System.out.println(description);
    }


    //    public void describeScene() {
//        final StringBuilder itemsStr = new StringBuilder("");
//        for (String item : sceneItems) {
//            itemsStr.append(" ").append(item);
//        }
//        System.out.println("You can see:" + itemsStr.toString());
//    }

    public void connectEast(Scene other) {
        this.east = other;
        other.west = this;
    }

    public void connectSouth(Scene other) {
        this.south = other;
        other.north = this;
    }



    public Scene move(String direction) {
        Scene nextScene = null;
        if (direction.equals("north")) {
            nextScene = north;
        } else if (direction.equals("east")) {
            nextScene = east;
        } else if (direction.equals("south")) {
            nextScene = south;
        } else if (direction.equals("west")) {
            nextScene = west;
        } else {
            System.out.println("Error: unknown direction " + direction);
        }
        if (nextScene == null) {
            System.out.println("You cannot go " + direction + " from here.");
            nextScene = this;
        } else {

        }
        return nextScene;
    }

}
