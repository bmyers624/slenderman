import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Game {

    private Scene Forest;
    private Scene Shed;
    private Scene Car;
    private Scene Outhouse;
    private Scene Cave;
    private Scene Pond;
    private Scene Field;
    private Scene Tree;
    private Scene CurrentScene;

    List<String> playerInventory = new ArrayList<String>();

    public Game() throws InterruptedException {
        Scene.playIntro();
        Forest = new Scene("You are in a dark Forest.\n"
                +"               ,@@@@@@@,\n" +
                "       ,,,.   ,@@@@@@/@@,  .oo8888o.\n" +
                "    ,&%%&%&&%,@@@@@/@@@@@@,8888\\88/8o\n" +
                "   ,%&\\%&&%&&%,@@@\\@@@/@@@88\\88888/88'\n" +
                "   %&&%&%&/%&&%@@\\@@/ /@@@88888\\88888'\n" +
                "   %&&%/ %&%%&&@@\\ V /@@' `88\\8 `/88'\n" +
                "   `&%\\ ` /%&'    |.|        \\ '|8'\n" +
                "       |o|        | |         | |\n" +
                "       |.|        | |         | |\n" +
                "__\\\\/ ._\\//_/__/  ,\\_//__\\\\/.  \\_//__/_\n" +
                "\n" +
                "------------------------------------------------\n" +
                "\n"
                + "You see a Shed to your SOUTH, and a Car to the EAST.\n");

        Shed = new Scene("As you make your way through the forest, you find an unkempt and dilapidated Shed. \n"
                + "A crimson red handprint stains the wood of its frail door. \n"
                + "To its left is a pile of firewood and a Lawn Chair covered in dirt.\n"
                + "You walk into the Shed and see a key!\n"
                + "You see a Forest to your NORTH, and a Cave to the EAST.");
        Shed.sceneItems.add("key");

        Car = new Scene("You arrive at a broken down Car.\n"
                +"                                             _...----\"\"\"\"\"\"\"\"\"\"\"\"----..._\n" +
                "                                           .'       ______________       `-.\n" +
                "                                          :_..--\"\"\"\" ___......___ \"\"\"\"\"----..\n" +
                "                                        .' _.---\"\"\"\"\"   (______) `\"\"\"\"\"----. `.\n" +
                "                                       / .'   .----.               .-----.  \\  \\\n" +
                "                                      / /    /      \\             /       \\  \\  \\\n" +
                "                              .---.  / /    :        :           :,-\"\"\"\"\"-.:  \\  \\  .---.\n" +
                "                             :    `\\: :   __:____....J.---------.:...______:   :  :'     :\n" +
                "                              `\"\"\"-._ `\"\"\"_______......---------......______`\"\"' _'.-\"\"\"'\n" +
                "                                  / \\\"\"\"\"\"                                  \"\"\"\"\"/`.\n" +
                "                                 / `.`.                                        .' ' `.\n" +
                "                                /    \\ `.                                    .' .'    \\\n" +
                "                               /      `. `-._                            _.-' .'      _:\n" +
                "                             :|`\"\"----.._    `\"\"\"--------------------\"\"\"'     _..---\"\" |:\n" +
                "                             ::   /\"\"\\  _`.    _____..............______    .'_ /\"\"\\   ::\n" +
                "                             | `._\\__/ `\" `.  : 888888888P\"\":'.d888888P '  : '\" \\__/_.' |\n" +
                "                             |`-._  `\"\"----'  : T888888P'|__|88888888P  :  `----\"\"\"'  _.|\n" +
                "                             :    `\"-._     :  `.`T8P\" .d88888888888P'.'  '     __.-\"\"  |\n" +
                "                             :`.        `\"\"` '   ``\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"     .'\"\"\"\"\"       ,:\n" +
                "                             |: `-,_          \\                         :       __...-':|\n" +
                "                             |:   '88P`Tp.    `d88888888888888888888888P    .dP`T88P   :|\n" +
                "                             :8p.  `8b_d88b    888888888888888888888888'   d88b_dP'   d8:\n" +
                "                             '8888b..___`\"\"     `\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'    `\"\"___..gd888'\n" +
                "                              88888888  ``\"\"\"\"\"----------------------\"\"\"\"'\"\"\"\"  88888888\n" +
                "                              '888888P                                    fsc   T888888P\n" +
                "                               `\"\"\"\"\"\n" +
                "\n" +
                "                                    ------------------------------------------------\""
                +"\n"
                + "You see a Forest to your WEST, an Outhouse to your EAST, and a Cave to the SOUTH.\n");

        Outhouse = new Scene("You come across an Outhouse.\n"
                + "                 .\n" +
                "               .' `.\n" +
                "             .' .'. `.\n" +
                "           .' .'   `. `. \n" +
                "         .' .'       `. `.\n" +
                "       .' .'           `. `.\n" +
                "     .' .'|  _________  |`. `.\n" +
                "      `'| | |         | | |`'\n" +
                "        | | |   _ _   | | |\n" +
                "        | | |  ( \" )  } | |\n" +
                "        | | |   \\ /   | | |\n" +
                "        | | |    \"    | | |\n" +
                "        | | |         | | |\n" +
                "        | |,+'        | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         | | |\n" +
                "        | | |         } | |\n" +
                "        | | |         | | |\n" +
                ",,,,,,,,|,|,|,,,,,,,,,|,|,|,,,,,,,,,,,,,,"
                + "\n"
                + "=====================================================\n"
                + "\n"
                + "You see a Car to your WEST, and a Pond to the SOUTH.\n");

        Cave = new Scene("You are at a creepy Cave.\n"
                + "You see a Car to your NORTH, a Shed to your WEST, and a Pond to the EAST.\n");

        Pond = new Scene("You now stand in front of a pond.\n"
                + "You see a Cave to your WEST, an Outhouse to your NORTH, and a Field to the EAST.");

        Field = new Scene("You are in a wide, open Field.\n"
                + "You see a Pond to your WEST, and a Tree to your EAST.");

        Tree = new Scene("You have arrived at the Tree.\n");






        CurrentScene = Forest;

        Forest.connectSouth(Shed);
        Forest.connectEast(Car);
        Shed.connectEast(Cave);
        Car.connectSouth(Cave);
        Car.connectEast(Outhouse);
        Cave.connectEast(Pond);
        Outhouse.connectSouth(Pond);
        Pond.connectEast(Field);
        Field.connectEast(Tree);

    }

    public void play(Scanner in) throws InterruptedException {
        CurrentScene.describe();
        while (CurrentScene != Tree) {
            String line = in.nextLine().toLowerCase();
            if (line.equals("quit")) {
                System.out.println("You gave up!");
                break;
            } else if (line.startsWith("go ")) {
                CurrentScene = CurrentScene.move(line.substring(3));
                CurrentScene.describe();
//            } else if (line.startsWith("take ")) {
//                take(line.substring(5));
            } else {
                System.out.println("Unknown command '" + line + "'.  Try go/take/quit.\n");
            }
        }
        if (CurrentScene == Tree) {
            Thread.sleep(2000);
            System.out.println("You have killed SlenderMan\n");
            Thread.sleep(5000);
            System.out.println("You Win!");
            System.out.println("Thanks for playing!");
            Thread.sleep(5000);
            System.exit(0);
        }
    }

//    public boolean isItemInScene(boolean) {
//        if (CurrentScene.sceneItems != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public void take(String item) {
//        if(isItemInScene()) {
//            playerInventory.add(item);
//        }
//    }

    public void drop(String item) {
        if(playerInventory != null) {
            playerInventory.remove(item);
        }
    }

    /** Starts the whole game. */
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.play(new Scanner(System.in));
    }




}
