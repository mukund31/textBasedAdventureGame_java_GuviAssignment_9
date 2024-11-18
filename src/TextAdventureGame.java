import java.util.*;

public class TextAdventureGame {

    private static String currentRoom="entrance";
    private static int playerHealth=100;
    private static List<String> inventory=new ArrayList<>();
    private static boolean potionUsed=false;
    private static boolean treasureCollected=false;
    private static boolean torchUsed=false;
    private static boolean defeatedMonster=false;
    private static int points=0;
    private static Map<String, List<String>> availablepaths=new HashMap<>();


    public static void main(String mk[]) {
        System.out.println("----------------------------------------------");
        System.out.println("!! WELCOME TO THE TEXT BASED ADVENTURE GAME !!");
        System.out.println("----------------------------------------------");
        setupPaths();

        Scanner sc = new Scanner(System.in);


        while(playerHealth>0 && !treasureCollected) {
            System.out.println();
            displayCurrentLocation();

            if(currentRoom.equals("entrance")) {
                System.out.println("Talk to the Wise Old Man to get some tips");
            }
            else if(currentRoom.equals("forest") && !inventory.contains("torch")) {
                System.out.println("Fight with venomnous snakes to get the torch");
            }
            else if(currentRoom.equals("dungeon") && !inventory.contains("key")) {
                if(torchUsed) {
                    System.out.println("Fight with the Witch to get your companion free and get the key to the treasure");
                }
                else {
                   System.out.println("It's quite dark here get some light");
                }
            }
            else if(currentRoom.equals("store room")) {
                if(!inventory.contains("potion"))
                    collectInventory();
                System.out.println("Talk to the Mystic Elf to get some tips");
            }
            else if(currentRoom.equals("treasure room") && !defeatedMonster) {
                System.out.println("Fight with the Goblin Monster to get into the treasure room");
            }


            System.out.println("Available Paths: "+availablepaths.get(currentRoom));

            System.out.println("\nCHOOSE AN ACTION:");
            System.out.println("-----------------");
            System.out.println("1: Go to another room");
            System.out.println("2: Talk");
            System.out.println("3: Attack");
            System.out.println("4: Run");
            System.out.println("5: Check Health");
            System.out.println("6: Check Inventory");
            System.out.println("7: Use Inventory\n");

            String choice=sc.nextLine();

            switch(choice) {
                case "1":
                    System.out.println("Which direction do you want to go?");
                    String direc=sc.nextLine().trim().toLowerCase();
                    if(availablepaths.get(currentRoom).contains(direc)) {
                        shiftPlayer(direc);
                    }
                    else {
                        System.out.println("No such path exists");
                    }
                    break;
                case "2":
                    talk();
                    break;
                case "3":
                    attack();
                    break;
                case "4":
                    run();
                    break;
                case "5":
                    checkHealth();
                    break;
                case "6":
                    checkInventory();
                    break;
                case "7":
                    useInventory();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
        if(playerHealth<=0) {
            System.out.println("--------------");
            System.out.println("!! YOU LOSE !!");
            System.out.println("--------------");
            return;
        }
        if(treasureCollected) {
            System.out.println("-----------------------------");
            System.out.println("!! CONGRATULATIONS YOU WIN !!");
            System.out.println("-----------------------------");
        }
    }

    private static void setupPaths() {
        availablepaths.put("entrance", Arrays.asList("east", "west", "north"));
        availablepaths.put("store room", Arrays.asList("east"));
        availablepaths.put("forest", Arrays.asList("south", "east"));
        availablepaths.put("dungeon", Arrays.asList("west"));
        availablepaths.put("treasure room", Arrays.asList("west"));
    }

    private static void shiftPlayer(String direc) {
        switch(currentRoom) {
            case "entrance":
                if(direc.equals("north"))
                    currentRoom="forest";
                else if(direc.equals("west"))
                    currentRoom="store room";
                else if(direc.equals("east"))
                    currentRoom="dungeon";
                else
                    System.out.println("You can't go that way");
                break;
            case "store room":
                if(direc.equals("east"))
                    currentRoom="entrance";
                else
                    System.out.println("You can't go that way");
                break;
            case "forest":
                if(direc.equals("east"))
                    currentRoom="treasure room";
                else if(direc.equals("south"))
                    currentRoom="entrance";
                else
                    System.out.println("You can't go that way");
                break;
            case "dungeon":
                if(direc.equals("west"))
                    currentRoom="entrance";
                else
                    System.out.println("You can't go that way");
                break;
            case "treasure room":
                if(direc.equals("west"))
                    currentRoom="forest";
                else
                    System.out.println("You can't go that way");
                break;
        }
    }

    private static void displayCurrentLocation() {
        System.out.println("Current Location: "+currentRoom);
    }

    private static void talk() {
        switch(currentRoom) {
            case "entrance":
                System.out.println("The Wise Old Man Says: Beware of the darkness in the dungeon");
                break;
            case "store room":
                System.out.println("The Mystic Elf Says: Get the key to unlock your fortune");
                break;
            case "dungeon":
                System.out.println("The Guarding Witch Says: Face me to get your companion free");
                break;
            default:
                System.out.println("No one to talk to here");
                break;
        }
    }

    private static void attack() {
        switch(currentRoom) {
            case "forest":
                playerHealth-=20;
                if(playerHealth<=0) {
                    System.out.println("You were killed by the snakes");
                }
                else {
                    System.out.println("You defeated the snakes");
                    checkHealth();
                    collectInventory();
                }
                break;
            case "dungeon":
                playerHealth-=60;
                if(playerHealth<=0) {
                    System.out.println("You were killed by the witch");
                }
                else {
                    System.out.println("You defeated the witch");
                    checkHealth();
                    collectInventory();
                }
                break;
            case "treasure room":
                playerHealth-=80;
                if(playerHealth<=0) {
                    System.out.println("You were killed by the monster");
                }
                else {
                    System.out.println("You defeated the monster");
                    checkHealth();
                    collectInventory();
                    System.out.println("Use the Key to unlock the treasure case");
                }
                break;
            default:
                System.out.println("No one to attack here");
                break;
        }

    }

    private static void run() {
        System.out.println("You return to the Entrance");
        currentRoom="entrance";
    }

    private static void checkHealth() {
        System.out.println("Availabe Health: "+playerHealth);
    }

    private static void collectInventory() {
        switch(currentRoom) {
            case "store room":
                if(!inventory.contains("potion")) {
                    inventory.add("potion");
                    System.out.println("Potion Collected");
                }
                break;
            case "forest":
                if(!inventory.contains("torch")) {
                    inventory.add("torch");
                    System.out.println("Torch Collected");
                }
                break;
            case "dungeon":
                if(!inventory.contains("key")) {
                    inventory.add("key");
                    System.out.println("You got your companion free and collected the key to treasure");
                    System.out.println("TIP from companion: The way to the Treasure Room goes through the forest");
                }
                break;
            default:
                System.out.println("Nothing to collect here");
        }
    }

    private static void checkInventory() {
        System.out.println("Availabe Inventory: "+inventory);
    }

    private static void useInventory() {
        if(inventory.size()==0) {
            System.out.println("Your inventory is enpty");
            return;
        }
        System.out.println("Availabe Inventory: " + inventory);
        System.out.println("What do you want to use?");
        Scanner sc = new Scanner(System.in);
        String toUse = sc.nextLine().trim().toLowerCase();
        if (!inventory.contains(toUse)) {
            System.out.println("Item entered is either invalid or you don't own it currently");
            return;
        }

        switch (toUse) {
            case "potion":
                playerHealth = 100;
                potionUsed = true;
                inventory.remove("potion");
                break;
            case "key":
                if (currentRoom.equals("treasure room")) {
                    treasureCollected = true;
                }
                else {
                    System.out.println("You cannot use Key here");
                }
                break;
            case "torch":
                if (currentRoom.equals("dungeon")) {
                    torchUsed=true;
                }
                else {
                    System.out.println("You cannot use torch here");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}