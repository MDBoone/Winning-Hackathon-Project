package Hackathon;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    static java.io.File inFile;
    static Scanner items;
    static Scanner input;

    public static void main(String[] args) throws FileNotFoundException {
          ///////////////////////
         // Creating New Game //
        ///////////////////////


        // IOExecption if file is not located
        inFile = new java.io.File("items.txt");

        if (!inFile.exists()) {
            System.out.println("File Not Found");
        }
        // Sets up file pointers, the internal name for the file.
        items = new Scanner(inFile);

        Item[] gameInventory = new Item[50];

        int protection, attack, index = 0;
        String description, name, typeOfItem;

        typeOfItem = items.nextLine();
        for (int i = 0; (!typeOfItem.equals("*")); i++) {
            if (typeOfItem.equalsIgnoreCase("weapon")) {
                index++;
                name = items.nextLine();
                description = items.nextLine();
                attack  = items.nextInt();
                items.nextLine();
                gameInventory[i] = new Weapons(index, typeOfItem, name, description, attack);
            } else if (typeOfItem.equalsIgnoreCase("armor")) {
                index++;
                name = items.nextLine();
                description = items.nextLine();
                protection  = items.nextInt();
                items.nextLine();
                gameInventory[i] = new Armor(index, typeOfItem, name, description, protection);

            } else {
                index++;
                name = items.nextLine();
                description = items.nextLine();
                gameInventory[i] = new Misc(index, typeOfItem, name, description);
            }
            typeOfItem = items.nextLine();
        }
            Rooms rooms = new Rooms();
            Player player = new Player();

          ///////////////////////
         //  Starting Game    //
        ///////////////////////

        input = new Scanner(System.in);

        System.out.printf("%50s", "Welcome To:");
        System.out.println();
        System.out.println("                            ******************************");
        System.out.println("                            * GGGGGGGG  EEEEEEE  NN    N *");
        System.out.println("                            * G         E        N  N  N *");
        System.out.println("                            * G         EEEE     N   N N *");
        System.out.println("                            * G   GGGG  E        N    NN *");
        System.out.println("                            * G      G  E        N     N *");
        System.out.println("                            * GGGGGGGG  EEEEEEE  N     N *");
        System.out.println("                            ******************************");
        System.out.println("");
        System.out.println("                            ******************************");
        System.out.println("                            *  RRRRRRR PPPPPP  GGGGGGG   *");
        System.out.println("                            *  R    R  P    P  G         *");
        System.out.println("                            *  R    R  PPPPPP  G         *");
        System.out.println("                            *  RRRRRR  P       G   GGG   *");
        System.out.println("                            *  R   R   P       G     G   *");
        System.out.println("                            *  R    R  P       GGGGGGG   *");
        System.out.println("                            ******************************");
        System.out.println("");
        //System.out.println("Press Enter to Continue");
        //String cont = input.nextLine();

        System.out.print("Enter Name Of Character: ");
        player.setName(input.nextLine());

        System.out.print("Well, Hello " + player.getName() + ", It's Time To Wake Up...\n\n");
        rooms.enterRoomOne(player, gameInventory);
        rooms.enterClownRoom(player, gameInventory);
        rooms.enterRoom3(player, gameInventory);
    }




}

