import java.util.Scanner;
import java.util.Random;
class TimeLoop {
    public static void main(String[] args) {
        //initialise the game
        int score = 0;
        String command = "";
        int room = 1;
        boolean hasLock = false;
        Scanner input = new Scanner(System.in);
        //print bedroom information
        if (room == 1) {
                System.out.println("You wake up to the familiar sound of your alarm. Slamming your hand on the snooze button, you reluctantly open your eyes. Your room looks as it has always been. White walls, a huge window on the right showing the same old road and the tall office building across, a wooden desk in front of the bed, and a closet with two sliding doors to your left.");
            }
        //get player command
        System.out.println(" >");
        //process user input for bedroom
        for (int i = 0; i < 6; i++) {
            command = input.nextLine();
            if (room == 1) {
                if (command.equals("x window")) {
                    System.out.println("The window is split into two parts - one part that is completely sealed and the other that is a casement style window iwth a black fold-down handle.");
                    System.out.println("Through the glass, you see the grey sky hovering over tall skyscrapers and lampposts full of advertisements flapping in the wind. Pedestrians and cars shuffle about like ants on the street below.");
                    System.out.println(" >");
                } else if (command.equals("x alarm")) {
                    System.out.println("You've used the alarm for years. It is an old-fashioned analog clock with a rectangular snooze button at the top and a switch at the back to turn the alarm on or off. Strangely, the time is set at 00:00AM.");
                    System.out.println(" >");
                } else if (command.equals("x walls")) {
                    System.out.println("There are three walls in this room, one behind you, one to your right, and one in front of you behing the desk. There is a sliding door to your left leading out to what looks like a corridor.");
                    System.out.println(" >");
                } else if (command.equals("x desk")) {
                    System.out.println("The mahogany desk has two drawers in the belt. It has a lovely patina, with an interior made of red wood.");
                    System.out.println("The desk rests on walnut planks varying from light brown to a reddish brown hue in a minimalistic, Nordic style.");
                    System.out.println("The desk is empty except for a dark silver lock resting on the surface. You do not recall having seen it before.");
                    System.out.println(" >");
                    String command1 = input.nextLine();
                    if ((command1.equals("take lock")) || (command1.equals("get lock"))) {
                        hasLock = true;
                        System.out.println("You pick up the silver lock. It feels heavy and cold in your hands. There is no key to come with it, and you wonder if it can be flicked open.");
                        System.out.println(" >");
                    }
                    else {
                        i--;
                        System.out.println("You shift your attention from the desk, deciding to go to work as you usually would. The rest of the day feels like a blur, and as you lie down in bed after a long day, you suddenly notice that your room has become unusually pale and hazy. You blink, but everything seems to be fading, as if a strip of film had been rolled to the end. You watch in astonishment as your bedroom door closes by itself and your blankets even out until every crease is identical to the moment when you wokr up from your alarm. Everything seems to be restoring itself, even your own memoery...");
                        System.out.println("\"You wake up to the familiar sound of your alarm. Slamming your hand on the snooze button, you reluctantly open your eyes. Your room looks as it has always been. White walls, a huge window on the right showing the same old road and the tall office building across, a wooden desk in front of the bed, and a closet with two sliding doors to your left.");
                        System.out.println("You have triggered the time loop, causing you to lose all chances of escaping. Would you like to restart? (yes/no)");
                        String command2 = input.nextLine();
                        if (command2.equals("yes")) {
                            i--;
                            System.out.println("Your previous move has been undone. You may now continue exploring.");
                        }
                        else {
                            break;
                        }
                    }
                }
                else if ((command.equals("out")) || (command.equals("leave")) || (command.equals("leave room"))) {
                    room++;
                    i = 6;
                    System.out.println("You are now standing in a corridor lined with shelves.");
                }
                else {
                    i--;
                    System.out.println("Sorry, this is not a verb I recognize.");
                    System.out.println(" >");
                }
            }
        }
        if(room == 2) {
            String command1 = input.nextLine();
            if(command1.equals("n")) {
                System.out.println(movement("n"));
                room++;
            }
            else if(command1.equals("e")) {
                System.out.println(movement("e"));
            }
            else if(command1.equals("s")) {
                System.out.println(movement("s"));
            }
            else if(command1.equals("w")) {
                System.out.println(movement("w"));
            }
            else {
                System.out.println("Sorry, this is not a verb I recognize");
            }
        }
        if(room == 3) {
            //ominous lee minho moment
        }
        //process user input from corridor to living room
    }
    public static String movement (String direction) {
            if (direction.equals("n")) {
                return "You enter the living room. It consists of a TV, a sofa with a small table in front of it, a large wooden dining table with a vase and an empty glass on it.";
            }
        if (direction.equals("e")) {
            return "Ouch! You bumped your head against the shelf.";
        }
        if (direction.equals("s")) {
            return "But you're already in the southernmost part of the corridor!";
        }
        if (direction.equals("w")) {
            return ("Ouch! you bumped your head against the shelf.");
        }
    return "Sorry, this is not a verb I recognize";
    }
    public static int combat(int damage1, int damage2, int damage3) {
        String[] angryPedestrians = {"young man twirling an umbrella", "zombie", "drunkard", "police officer", "schoolgirl"};
        int maxPedestrianHealth = 10;
        int attackDamage = 10;
        int maxHealth = 100;

        boolean running = true;

        System.out.println("As soon as you take out the lock, every single person around you stops what they're doing to stare at you. Their expressions have been wiped blank, and it is almost as if the entire city has been drowned in silence as the pedestrians advance towards you. Alarmed, you back away and eventually break into a sprint.");
        //fighting random humans

    }
    //before the player gets yeeted off the elevator, they nervously flick the lock open and close. If they run into the elevator with the lock open and have beaten three pedestrians, they win and leave the time loop.
}




