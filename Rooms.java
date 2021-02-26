package Hackathon;

import java.util.Scanner;

public class Rooms {
    public static Scanner input;

    ///////////////////////
    //     Room One      //
    ///////////////////////

    public void enterRoomOne(Player player, Item[] gameInventory) {
        // main choice
        int choice = 0;

        // puzzle components
        int lampSwitch = 0;
        int lightSwitch = 0;
        int doorLock = 0;
        int keyLock =0;

        input = new Scanner(System.in);

        // Intro story
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("|  You wake suddenly, white walls blind you as you blink the sleep from your eyes.    |");
        System.out.println("|     You lay on a bare white mattress that is placed in the center of the room.      |");
        System.out.println("|                    Disoriented you begin to look around.                            |");
        System.out.println("|                                                                                     |");
        System.out.println("|                  You are stand and are in the center of the room.                   |");
        System.out.println("|  In the second corner you see a lamp standing, emitting a light glow from the top.  |");
        System.out.println("|               The next corner you see a pedestal, on top there's a key.             |");
        System.out.println("|                      the last corner looks empty.                                   |");
        System.out.println("|             In between the lamp and the pedestal, there is a door.                  |");
        System.out.println("|                Next to the door there is a light switch.                            |");
        System.out.println("|                                                                                     |");
        System.out.println("|    After orienting yourself, you realize that you are naked, like butt @#$ naked.   |");
        System.out.println("|                     Confused and scared, you stand.                                 |");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("Press Enter to Continue");
        String cont = input.nextLine();

        // exit int for loop
        int exitRoom = 0;

        // master loop for room one
        while (exitRoom == 0) {
            System.out.println("What would you like to do?");
            System.out.println("1) Examine the mattress.");
            System.out.println("2) Examine the light stand.");
            System.out.println("3) Examine the pedestal");
            System.out.println("4) Examine the empty corner");
            System.out.println("5) Examine the door in between the lamp stand and pedestal");
            System.out.println("");
            choice = input.nextInt();
            int exit = 0;
            while (exit == 0) {
                if (choice == 1) {
                    int exit1 = 0;
                    int choice1 = 0;
                    System.out.println("You walk up to the mattress");
                    System.out.println("What would you like to do?");
                    System.out.println("1) Lay down.");
                    System.out.println("2) Flip the mattress.");
                    System.out.println("3) Jump on the mattress.");
                    System.out.println("4) leave the mattress alone.");
                    System.out.println("");
                    choice1 = input.nextInt();
                    while (exit1 == 0) {

                        if (choice1 == 1) {
                            System.out.println("You lay down, it feels nice.");
                            System.out.println("Nothing happens.");
                            System.out.println("What would you like to do next");
                            choice1 = input.nextInt();
                        } else if (choice1 == 2) {
                            System.out.println("You flip the mattress.");
                            System.out.println("Underneath you see a note.");
                            System.out.println(
                                    "You pick it up, on one side in smudged ink it says 'Are you down to Clown :)'");
                            System.out.println("Add it to inventory?");
                            System.out.println("1) Yes");
                            System.out.println("2) No");
                            int simplechoice = input.nextInt();
                            if(simplechoice == 1){
                                player.inventory.addItem(
                                        gameInventory[player.inventory.findGameInventoryIndex("clown note", gameInventory)]);
                                System.out.println(gameInventory[player.inventory.
                                        findGameInventoryIndex("clown note", gameInventory)].getDescription());
                                System.out.println("\n==============================");
                                System.out.println(player.getName() + "'s Inventory: ");
                                player.inventory.displayInventory();
                                System.out.println("==============================\n");
                            }

                            System.out.println("What would you like to do next");
                            choice1 = input.nextInt();
                        } else if (choice1 == 3) {
                            System.out.println(
                                    "You jump on the mattress, due to your nakedness you feel ashamed and quickly stop.");
                            System.out.println("Light chuckling can be herd.");
                            System.out.println("What would you like to do next");
                            choice1 = input.nextInt();
                        } else if (choice1 == 4) {
                            System.out.println("You leave the mattress alone");
                            exit1++;
                        } else {
                            System.out.println("Invalid Entry");
                            choice1 = input.nextInt();
                        }
                    }
                    exit++;
                } else if (choice == 2) {
                    int choice2 = 0;
                    int exit2 = 0;
                    System.out.println("You walk up to the light stand");
                    System.out.println("What would you like to do?");
                    System.out.println("1) Look underneath the lamp.");
                    System.out.println("2) Turn off the lamp.");
                    System.out.println("3) leave the light alone.");
                    System.out.println("");
                    choice2 = input.nextInt();

                    while (exit2 == 0) {
                        if (choice2 == 1) {
                            System.out.println(
                                    "You try and look under the light stand, however, it is cemented to the ground");
                            System.out.println("What would you like to do next to the light stand?");
                            choice2 = input.nextInt();
                        } else if (choice2 == 2) {
                            if (lampSwitch != 0) {
                                System.out.println("You turn the light back on");
                                System.out.println("What would you like to do next to the light stand?");
                                lampSwitch--;
                                choice2 = input.nextInt();
                            } else {
                                System.out.println("You turn off the light.");
                                System.out.println("What would you like to do next to the light stand?");
                                lampSwitch++;
                                choice2 = input.nextInt();
                            }
                        } else if (choice2 == 3) {
                            System.out.println("You decide to leave the light alone");
                            exit2++;
                        } else {
                            System.out.println("invalid entry");
                            choice2 = input.nextInt();
                        }

                    }
                    exit++;

                }

                else if (choice == 3) {
                    int choice3 = 0;
                    int exit3 = 0;
                    System.out.println("You walk up to the pedestal and see a key with a scratched in triangle on it");
                    System.out.println("What would you like to do?");
                    System.out.println("1) Look underneath the pedestal.");
                    System.out.println("2) Take the key.");
                    System.out.println("3) leave the pedestal alone.");
                    System.out.println("");
                    choice3 = input.nextInt();

                    while (exit3 == 0) {
                        if (choice3 == 1) {
                            System.out.println(
                                    "You try and look underneath the pedestal, however, it is cemented to the ground");
                            System.out.println("What would you like to do next to the pedestal?");
                            choice3 = input.nextInt();
                        } else if (choice3 == 2) {
                            if (keyLock != 0) {
                                System.out.println("You pick up the key!");
                                player.inventory.addItem(
                                        gameInventory[player.inventory.findGameInventoryIndex("triangle key", gameInventory)]);
                                System.out.println(gameInventory[player.inventory.
                                        findGameInventoryIndex("triangle key", gameInventory)].getDescription());
                                System.out.println("\n==============================");
                                System.out.println(player.getName() + "'s Inventory: ");
                                player.inventory.displayInventory();
                                System.out.println("==============================\n");
                            }

                            else {
                                System.out.println("You try and take the key, it wont budge.");
                            }

                            System.out.println("What would you like to do next to the pedestal?");
                            choice3 = input.nextInt();
                        } else if (choice3 == 3) {
                            System.out.println("You decide to leave the pedestal alone.");
                            exit3++;
                        } else {
                            System.out.println("Invalid Entry");
                            choice3 = input.nextInt();
                        }
                    }
                    exit++;
                }

                else if (choice == 4) {
                    int choice4 = 0;
                    int exit4 = 0;
                    System.out.println("You walk over to the seemingly empty corner.");
                    System.out.println("However, in the corner you find a small dragonfly charm.");
                    System.out.println("Would you like to take it?");
                    System.out.println("1) yes");
                    System.out.println("2) no");
                    System.out.println("");
                    choice4 = input.nextInt();
                    while (exit4 == 0) {
                        if (choice4 == 1) {
                            System.out.println("you took the dragonfly charm");
                            // add df item
                            player.inventory.addItem(
                                    gameInventory[player.inventory.findGameInventoryIndex("dragonfly charm", gameInventory)]);
                            System.out.println(gameInventory[player.inventory.
                                    findGameInventoryIndex("dragonfly charm", gameInventory)].getDescription());
                            System.out.println("\n==============================");
                            System.out.println(player.getName() + "'s Inventory: ");
                            player.inventory.displayInventory();
                            System.out.println("==============================\n");
                            exit4++;
                        } else if (choice4 == 2) {
                            System.out.println("You leave the charm alone");
                            exit4++;
                        } else {
                            System.out.println("Invalid Entry");
                        }
                    }

                    System.out.println("What would you like to do?");
                    System.out.println("1) leave the corner alone.");
                    choice4 = input.nextInt();
                    exit++;
                }

                if (choice == 5) {
                    int exit5 = 0;
                    int choice5 = 0;
                    System.out.println("You walk up to the door, next to the door you see a light switch");
                    System.out.println("What would you like to do?");
                    System.out.println("1) Try and open the door.");
                    System.out.println("2) Flip the light switch");
                    System.out.println("3) leave the door alone");
                    System.out.println("");
                    choice5 = input.nextInt();
                    while (exit5 == 0) {
                        if (choice5 == 1) {
                            if(doorLock == 0) {
                                System.out.println("You decide to try and open the door.");
                                System.out.println("you wiggle the handle but it wont turn.");
                                System.out.println("What would you like to do to the door next?");
                                choice5 = input.nextInt();
                            }
                            else {
                                System.out.println("You open the door and leave the room.");
                                exit5++;
                                exitRoom++;
                            }
                        }
                        else if(choice5 == 2) {
                            if(lampSwitch != 0) {
                                System.out.println("+-------------------------------------------------------------------------------------+");
                                System.out.println("|         You flip off the light you reveal that the ceiling is a two way mirror.     |");
                                System.out.println("|                Standing there, watching you is a shadowed figure.                   |");
                                System.out.println("|                 A laughing voice crackles through the speakers.                     |");
                                System.out.println("|                    Voice: WelcomE weLCome! you DID SO WELLL!                        |");
                                System.out.println("|          The voice is frightening, but oddly sounds like Steve Buscemi.             |");
                                System.out.println("|                      'I hope you like our little game!'                             |");
                                System.out.println("|                  You see a dark figure swirling some kind of drink.                 |");
                                System.out.println("|      Laughter crackles through the speakers once more as the figure disappears.     |");
                                System.out.println("|                            'Welcome to the gAMe!'                                   |");
                                System.out.println("|          After the speaker cuts out you hear a light click from the door.           |");
                                System.out.println("+-------------------------------------------------------------------------------------+");
                                keyLock++;
                                doorLock++;
                                System.out.println("What would you like to do next?");
                                choice5 = input.nextInt();

                            }
                            else {
                                System.out.println("You flip off the light. A light comes on from the ceiling.");
                                System.out.println("What would you like to do next?");
                                choice5 = input.nextInt();
                                System.out.println("As you walk away from the door the ceiling light flips back off.");
                            }

                        }
                        else if(choice5 == 3) {
                            System.out.println("you decide to leave the door alone");
                            exit5++;
                        }
                        else {
                            System.out.println("Invalid Entry");
                            choice5 = input.nextInt();
                        }
                        exit++;

                    }
                }
            }
        }

        System.out.println("Your walk out the door and as the door closes, you hear it click.");
        System.out.println("You turn back to try and reopen the door but it has locked");
        System.out.println("A door in front of you pops open.");
        System.out.println("You enter the now open door");
    }

    ///////////////////////
    //   Clown Room      //
    ///////////////////////

    public void enterClownRoom(Player player, Item[] gameInventory) {
        {

            int maskOn = -1;
            int choice = -1;
            int doorOpen = -1;

            Scanner input = new Scanner(System.in);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("|   Entering the next room your senses are bombarded by all things clown.   |");
            System.out.println("|                    Calliope music fills the room.                         |");
            System.out.println("|           The paneled wall painted images of smiling clowns.              |");
            System.out.println("|             A collection of clowns sit upon a wooden mantel.              |");
            System.out.println("|         A tacky clown costume hangs in the center of the room.            |");
            System.out.println("|        The ceiling is mirrored. You assume they are still watching.       |");
            System.out.println("|         Door behind you snaps shut behind you. You hear it lock.          |");
            System.out.println("-----------------------------------------------------------------------------");
            int exit = 1;

            //Start of choices
            while (exit != 0) {
                System.out.println("What do you examine?");
                System.out.println("1. Examine Mantle of Clowns.");
                System.out.println("2. Examine Costume.");
                System.out.println("3. Look around.");
                System.out.println("4. Examine the new door.");
                choice = input.nextInt();

                while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                    System.out.println("Voice: Time is ticking. Tick tock, tick tock. (Please select a number 1-5");
                    System.out.println("What would you like to do?");
                    choice = input.nextInt();
                }

                int exit2 = -1;

                while (exit2 != 0) {
                    //Choice 1 - Clowns
                    if (choice == 1) {
                        System.out.println("You walk over to the mantle of clowns. ");
                        System.out.println("Sitting upon the mantle are three child sized dolls dressed in clown costumes with matching masks.");
                        System.out.println(" ");
                        System.out.println("What would you like to do?");
                        System.out.println("1. Examine Red clown.");
                        System.out.println("2. Examine Green clown.");
                        System.out.println("3. Examine Purple clown.");
                        System.out.println("4. Walk away.");
                        int choiceClown = input.nextInt();

                        while (choiceClown != 1 && choiceClown != 2 && choiceClown != 3 && choiceClown != 4) {
                            System.out.println("Voice: Time is ticking. Tick tock, tick tock. (Please select a number 1-4");
                            System.out.println("What would you like to do?");
                            choiceClown = input.nextInt();
                        }

                        if (choiceClown == 1) {
                            System.out.println("You examine the red clown. It's creepy but nothing stands out.");
                            System.out.println(" ");
                        } else if (choiceClown == 2) {
                            System.out.println(" ");
                            System.out.println("You examine the green clown you the mask is not attached you pull off the mask.");
                            System.out.println("Slipping on the mask and looking through the eye slits, the colors of the room shift in hue.");
                            player.inventory.addItem(
                                    gameInventory[player.inventory.findGameInventoryIndex("clown mask", gameInventory)]);
                            System.out.println(gameInventory[player.inventory.
                                    findGameInventoryIndex("clown mask", gameInventory)].getDescription());
                            System.out.println("\n==============================");
                            System.out.println(player.getName() + "'s Inventory: ");
                            player.inventory.displayInventory();
                            System.out.println("==============================\n");
                            maskOn = 1;
                        } else if (choiceClown == 3) {
                            System.out.println("You examine the red clown. Nothing stands out.");
                            System.out.println(" ");
                        } else if (choiceClown == 4) {
                            System.out.println("You walk away from the mantle");
                            System.out.println(" ");
                            exit2 = 0;
                        }
                    }

                    //Choice 2 - Costume
                    else if (choice == 2) {
                        int exit4 = -1;
                        int choiceCostume = 0;
                        while (exit4 != 0) {
                            System.out.println(" ");
                            System.out.println("You walk over to the hanging clown costume. It is a tacky green clown costume. It is in your size.");
                            System.out.println("What would you like to do?");
                            System.out.println(" ");
                            System.out.println("1. Take the costume?");
                            System.out.println("2. Walk away.");
                            choiceCostume = input.nextInt();

                            while (choiceCostume != 1 && choiceCostume != 2) {
                                System.out.println(" ");
                                System.out.println("Voice: Time is ticking. Tick tock, tick tock. (Please select a number 1-2");
                                System.out.println("What do you examine?");
                                choiceCostume = input.nextInt();
                            }

                            if (choiceCostume == 1) {
                                System.out.println(" ");
                                System.out.println("You pull the costume off the hanger taking it");
                                System.out.println("Costume added to inventory");
                                System.out.println("Voice: Don't forget the wig.");
                                System.out.println(" ");
                                player.inventory.addItem(
                                        gameInventory[player.inventory.findGameInventoryIndex("clown costume", gameInventory)]);
                                System.out.println(gameInventory[player.inventory.
                                        findGameInventoryIndex("clown costume", gameInventory)].getDescription());
                                System.out.println("\n==============================");
                                System.out.println(player.getName() + "'s Inventory: ");
                                player.inventory.displayInventory();
                                System.out.println("==============================\n");
                                exit4 = 0;
                            } else if (choiceCostume == 2) {
                                System.out.println(" ");
                                System.out.println("You walk away.");
                                System.out.println(" ");
                                exit4 = 0;
                            }
                            exit2 = 0;
                        }
                    }

                    //Choice 3 - Looking around
                    else if (choice == 3) {
                        int exit5 = -1;
                        while (exit5 != 0) {
                            System.out.println(" ");
                            System.out.println("Looking around you see...");
                            if (maskOn != 1) {
                                System.out.println("Nothing additional.");
                                System.out.println(" ");
                                exit5 = 0;
                            } else if (maskOn == 1) {
                                System.out.println("You notice that the mask's tint reveals a message on wall to push the wall panel. You walk over and compress "
                                        + "the panel. ");
                                System.out.println(" A moment later you here the door to the next room unlock becoming ajar.");
                                doorOpen = 1;
                                exit5 = 0;
                            }
                        }
                        exit2 = 0;
                    }

                    //Choice 4 - The door
                    else if (choice == 4) {
                        int exit6 = -1;
                        while (exit6 != 0) {
                            System.out.println("You approach the door.");

                            if (doorOpen != 1) {
                                System.out.println(" ");
                                System.out.println("It is locked");
                                System.out.println("Voice: Nope.");
                                System.out.println(" ");
                                exit6 = 0;
                            } else if (doorOpen == 1) {
                                System.out.println(" ");
                                System.out.println("The door is open!");
                                System.out.println("Well done!");
                                System.out.println("You walk through the door into the next antechamber.");
                                System.out.println(" ");
                                exit6 = 0;
                                exit = 0;
                            }
                        }
                        exit2 = 0;
                    }
                }
            }
            System.out.println("The End... for now");
        }
    }
        public void enterRoom3(Player player, Item[] gameInventory) {
            input = new Scanner(System.in);
            int exit1 = 0;
            int exit = 0;
            int choice = 0;


            System.out.println("As you walk into the next room you are hit with a wall of cheep cologne");
            System.out.println("The speaker crackles back on.");
            System.out.println("WelcOme to the FiNal ROOOM!");
            System.out.println(
                    "The light flicks on and you see that every inch of the room is covered in Steve Buscemi pictures.");
            System.out.println("A voice from with in the room wispers, 'whos your favorite actor?'");
            System.out.println("In the center of the room sits a giant egg shaped swivle chair enclosed in a giant cage.");
            System.out.println(
                    "It turns slowly and with a slight creak and sitting in the chair is none other than Steve Buscemi");
            System.out.println("In front of the chair sits a table.");
            System.out.println("Steve: I said, who's your favorite actor?");
            System.out.println("");
            while (exit == 0) {
                exit1 = 0;
                System.out.println("What would you like to do?");
                System.out.println("1) Talk to Steve Buscemi");
                System.out.println("2) Look at the table in front of Steve");
                //System.out.println("3) Walk around the room and look at the posters.");
                System.out.println("");
                choice = input.nextInt();

                while (exit1 == 0) {
                    int choice2 = 0;
                    int break1 = 0;
                    if (choice == 1) {
                        System.out.println(
                                "You decided it would be best to talk to Steve, just to figure out what is going on");
                        System.out.println("What would you like to say?");
                        System.out.println("1) What is happening?");
                        System.out.println("2) Why me?");
                        System.out.println("3) Leave Steve alone for now.");
                        choice2 = input.nextInt();
                        while (break1 == 0) {
                            if (choice2 == 1) {
                                System.out.println("You: What the heck is going on here STEVE!");
                                System.out.println("Steve: Just a little fun, are you not having fun?");
                                break1++;
                            } else if (choice2 == 2) {
                                System.out.println("You: Why me, why not anyone else!?");
                                System.out.println("Steve: I herd you didnt like Grown Ups 2");
                                System.out.println("You: ..... are you kidding?");
                                System.out.println("Steve: *blinks*");
                                break1++;
                            } else if (choice2 == 3) {
                                System.out.println("You decided to leave Steve alone");
                                break1++;
                                exit1++;
                            } else {
                                System.out.println("Invalid Entry");
                                choice2 = input.nextInt();
                            }
                        }
                    } else if (choice == 2) {
                        int choice3 = 0;
                        int break3 = 0;
                        String userSteve = "";
                        String steve = "Steve";
                        String steve2 = "steve";
                        while (break3 == 0) {
                            System.out.println("you decide to look at the table in front of Steve");
                            System.out.println("You see three pictures of famous actors and one that is blank");
                            System.out.println("1) Picture of Brad Pit");
                            System.out.println("2) Picture of Johnny Depp");
                            System.out.println("3) Picture of George Clooney");
                            System.out.println("4) Leave the table");
                            System.out.println("Steve: Go ahead, whos your favorite?");
                            choice3 = input.nextInt();
                            if (choice3 == 1 || choice3 == 2 || choice3 == 3) {
                                System.out.println("Steve: YOU FOOOOL, WHY DO YOU HURT ME");
                                System.out.println();
                                System.out.println("What would you like to do?");
                            } else if (choice3 == 4) {
                                System.out.println("You decided to leave the table for now.");
                                break3++;
                                exit1++;
                            } else if(choice3 == 5){
                                System.out.println("First name please.");
                                userSteve = input.next();
                                if (userSteve.equals(steve) || userSteve.equals(steve2)) {
                                    exit++;
                                    exit1++;
                                    break3++;
                                }
                                else {
                                    System.out.println("Invalid Entry");
                                }

                            }
                        }

                    }
                    /*else if(choice == 3) {
                        System.out.println("You look around at all of the posters.");
                        System.out.println("They are all of Steve in different acting roles.");
                        System.out.println("You notice that there is an a lot of Grown Ups 2 posters");
                        System.out.println("");
                        exit1++;
                    }*/
                    else {
                        System.out.println("Invalid Entry");
                    }

                }
                System.out.println("The cage around the egg shaped chair falls and Steve leans in and kisses your forehead.");

            }
        }

}
