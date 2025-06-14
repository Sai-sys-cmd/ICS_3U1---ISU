/*
Group Members: Sai, Kavin, & Keneil
Date: June 13, 2025
Description: A text-based adventure game where players explore an ancient pyramid
             and solve puzzles to escape the Pharaoh's curse.
*/

// Imports
import java.util.*;

// MAIN CLASS
public class Main {

// GLOBAL VARIABLES
  static final String RESET = "\u001B[0m"; // RESETS COLOUR TO DEFAULT
  static final String RED = "\u001B[31m"; // USED FOR ERRORS OR INCORRECT INPUT
  static final String GREEN = "\u001B[32m"; // USED FOR CORRECT INPUTS AND MOVING ON TO THE NEXT STAGE
  static final String YELLOW = "\u001B[93m"; // USED FOR NORMAL NARRATION
  static final String CYAN = "\u001B[36m"; // USED FOR HINTS

  static Scanner in = new Scanner (System.in); // Scanner
  

// FUNCTIONS/METHODS

  // PAUSE METHOD
  public static void pause(int ms) {
    try { Thread.sleep(ms); }
    catch (InterruptedException e) {}
  }

  // CLEAR SCREEN METHOD
  public static void clearScreen() {
    for (int i = 0; i < 100; i++) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
  }

  // MAIN MENU METHOD
    public static void mainMenu() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\t\t\t\t\t\t\t\tMain Menu:");
      System.out.println("\t\t\t\t\t\t\t\t===================\n");
      System.out.println("\t\t\t\t\t\t\t\t1. Play Game\n");
      System.out.println("\t\t\t\t\t\t\t\t2. About Escape Games\n");
      System.out.println("\t\t\t\t\t\t\t\t3. Quit\n");
      System.out.println("\t\t\t\t\t\t\t\t----------------------");
    }

  // GAME METHOD
    public static void game() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tGame:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println("\tThe sun is blazing as you walk across the hot Egyptian sand.\n");
      System.out.println("\tYou\'re a curious journalist, looking for hidden secrets inside the pyramids.\n");
      System.out.println("\tMost people think they know what's inside, but you believe there's more to discover.\n");
      pause(3000);
      System.out.println("\tYou\'re currently on a guided tour of the ancient Egyptian pyramids. The guide's voice echoes through the huge hallway.\n");
      System.out.println("\tThey\'re talking about tombs, curses, and how this place was built thousands of years ago.\n");
      System.out.println("\tYou wander to the back of the group, taking some photos. Then suddenly a small narrow path on the side wall catches your eye!\n");
      System.out.println("\tYou glance around. Nobody sees you.\n");
      System.out.println("\tCurious, your step inside and find yourself in a dark and tight hallway.\n");
      System.out.println(RED + "\tBut then... *THUD*!\n" + YELLOW);
      pause(3000);
      System.out.println("\tYou turn around. The entrance behind you just sealed shut!\n");
      System.out.println("\tThere\'s no going back. You're completely alone!\n");
      System.out.println("\tThe air is thick. It smells old, like dust and stone.\n");
      System.out.println("\tYou\'ve just entered a part of the pyramid no one talks about.\n");
      System.out.println("\tYou just might find what you came here for!\n");
    }

  // ABOUT METHOD
    public static void about() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tAbout This Game:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println(CYAN + "\tYou are about to enter \'The Pharaoh's Curse\', an interactive text-based adventure game that breaks the 4th wall.\n");
      System.out.println("\tIn this game, you will play as a curious journalist who enters an ancient Egyptian pyramid.\n");
      System.out.println("\tWhat starts as an exciting exploration quickly turns into a terrifying escape mission.\n");
      pause(3000);
      System.out.println("\tYou'll need to solve mysterious puzzles, interpret ancient hieroglyphics, and use logic to survive.\n");
      System.out.println("\tEach challenge you face will draw you deeper into the truth of the pyramid.\n");
      System.out.println("\tYour decisions, attention to detail, and problem-solving skills will determine whether you survive the curse... or become part of the legend.\n\n");
      pause(3000);
      System.out.println(RED + "\tRules for this game: ");
      System.out.println("\t-----------------------\n");
      System.out.println("\t- No use of phones or outside help.\n");
      System.out.println("\t- You must escape within 20 minutes.\n\n\n");
      System.out.println("\tCreated by: Sai, Keneil & Kavin.\n\n\n" + YELLOW);
    }

  // PUZZLE 1 STORY
    public static void puzzle1() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tInside the Pyramid:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println("\tYou move forward slowly, while being cautious.\n");
      System.out.println("\tThe hallway opens up into a small room with stone walls.\n");
      System.out.println("\tA single torch on the wall lights up on its own, like it\'s been waiting for you.\n");
      System.out.println(CYAN + "\tYou look around. There\'s a stone table in the middle, covered in old papers and markings.\n");
      pause(3000);
      System.out.println("\tMost of it is written in ancient symbols, but one page has something that looks like a code.\n");
      System.out.println("\tThere\'s a door ahead with no handle. Just a small keypad.\n");
      System.out.println("\tLooks like you need a 4-digit password to get through.\n");
      System.out.println("\tWhatever this place is, you must continue to survive!\n" + YELLOW);
      pause(3000);
    }

  // PUZZLE 2 STORY
    public static void puzzle2() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tHieroglyphic Wall:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println("\tYou move forward slowly, while being cautious.\n");
      System.out.println("\tThe hallway opens up into a small room with stone wall.\n");
      System.out.println("\tYou find an old wall with broken hieroglyphs painted on it.\n");
      System.out.println(CYAN + "\tSome of the painting is still visible, but a lot of it is destroyed.\n");
      pause(3000);
      System.out.println("\tThe pieces are scattered across the floor, showing parts of symbols like gods and animals.\n");
      System.out.println("\tOne big piece looks like a god holding something, but many parts are missing.\n");
      System.out.println("\tThe wall seems like it was once important.\n");
      System.out.println("\tWhatever this place is, you must continue to survive!\n" + YELLOW);
      pause(3000);
    }
  
     // PUZZLE 3 STORY
    public static void puzzle3() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tPit of Despair:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println("\tYou continue to ravage through the tunnels and mazes of the ancient pyramid.\n");
      System.out.println("\tAs you search every nook and cranny, take pictures of every engraving on the walls.\n");
      System.out.println("\tUnfortunately, you have gotten too comfortable after your first puzzle...\n");
      System.out.println("\tAs you were exploring you misstepped on a pressure plate, and the floor opened up, and swallowed you whole landing you in a room of hieroglyphs.\n");
      System.out.println(CYAN + "\tYou soon realize you\'re on borrowed time, as the walls begin to close in you must select the right hieroglyphic binary images in order to survive.\n");
      pause(3000);
      System.out.println("\tAll of the ancient codes on the cold hard walls look like the binary code we use today!\n");
      System.out.println("\tThe walls are slowly closing in, we need to figure something out quick!\n");
      System.out.println("\tIf we press the three right sequences of images to form the word \'tomb\', we can escape the pit of despair.\n" + YELLOW);
      pause(3000);
  }
    // PUZZLE 4 STORY
    public static void puzzle4() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tThe Room of Snakes:");
      System.out.println("\t===================\n" + YELLOW);
      System.out.println("\tYou step into a dim chamber and immediately spot a wide pit filled with venomous snakes with a passage on the opposite side.\n");
      System.out.println("\tHowever, you realise that there are no bridges to cross and you can\'t just walk through the pit.\n");
      System.out.println("\tAlong one wall, you see a panel with 15 buttons, each carved with a different symbol.\n");
      System.out.println("\tNear the pit\'s edge, a stone pressure plate is set into the floor.\n");
      pause(3000);
      System.out.println(CYAN + "\tA note is etched into the wall which says \"Only one stands apart!\".\n");
      System.out.println("\tYou realise that by pressing the right button, you will trigger the pressure plate.\n");
      System.out.println("\tThis may reveal a hidden bridge over the snakes!\n");
      System.out.println("\tYou take a deep breath and prepare to make your choice.\n" + YELLOW);
      pause(3000);
    }


  // PUZZLE 5 STORY
    public static void puzzle5() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tInside the Kings Tomb:");
      System.out.println("\t======================\n" + YELLOW);
      System.out.println("\tYou find the king's tomb and you find his remains.\n");
      System.out.println("\tNear where he's rested, you find a note of a previous survivor of the cursed Egyptian pyramid.\n");
      System.out.println("\tThe note said that there is a set of codes, and you are required to find the right one to move onto the next area. \n");

      System.out.println(CYAN + "\tYou look around. There\'s a stone table in the middle, covered in old papers and markings.\n");
      pause(3000);
      System.out.println("\tMost of it is written in ancient symbols, but one page has something that looks like a code.\n");
      System.out.println("\tThere\'s a door ahead with no handle. Just a small keypad.\n");
      System.out.println("\tAnother message is carved into the wall: Only the correct 4-digit code will let you pass.\n");
      System.out.println("\tLooks like you need a 4-digit password to get through.\n");
      System.out.println("\tWhatever this place is, you must continue to survive!\n" + YELLOW);
      pause(3000);
    }

  
  // PUZZLE 6 STORY
   public static void puzzle6(){
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tTHE LABYRINTH");
      System.out.println("\t==================\n" + YELLOW);
      System.out.println("\tYou enter an ever-changing labyrinth filled with wrong turns which leave you trapped forever and left to rot.\n");
      System.out.println("\tAt each intersection there is a tablet with ancient words. There are four intersections, input the right combination of ancient text to free yourself.\n");
      pause(3000);
      System.out.println(YELLOW + "\tJust as you think you are going to make it, you find yourself lost in these seemingly infinite hallways.\n");
      System.out.println(CYAN + "\tEither it was your sharp intuition skills or just blind luck, you see a sign that reads:\n\t\"This is the pharaoh's's labyrinth, its corridors unforgiving, and its floor ever changing\".\n");
      System.out.println("\tIf you ever wish to free yourself from this place, arrange the words into the right order and you shall be set free.\n" + YELLOW);
      pause(3000);
   }
  // END METHOD
    public static void end() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(GREEN + "\tCONGRATULATIONS YOU BEAT THE GAME! ");
      System.out.println("\t====================================\n" + YELLOW);
      pause(3000);
      System.out.println("\tYou made it out of the pyramid!\n");
      System.out.println("\tThe curse is lifted, and you\'re finally free.\n");
      System.out.println("\tIt was a crazy adventure, but you survived.\n");
      System.out.println("\tThanks for playing our game!\n");
      System.out.println("\tCreated by: Sai, Keneil & Kavin\n"); 
      System.out.print(RED + "\n\n\tPress \'1\' to play again or any other (#) to exit: " + YELLOW);
    }

    public static void timeUp() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(RED + "\tTIME UP! THE DOOR IS SEALED FOREVER!");
      System.out.println("\t====================================\n" + YELLOW);
      pause(3000);
      System.out.println("\n\tThanks for playing our game!\n");
      System.out.println("\tCreated by: Sai, Keneil & Kavin\n"); 
      System.out.print(RED + "\n\n\tPress \'1\' to play again or any other (#) to exit: " + YELLOW);
    }

  // EXIT METHOD
    public static void exit() {
      clearScreen();
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println(RED + "\n\n\t\t\t\t\t\t\t\tExiting...\n");
      System.exit(0);  // EXITS PROGRAM
    }

  
     // MAIN
    public static void main(String[] args) {

      // ===============
      // VARIABLES
      // ===============
      
      int input, playGame, playAgain; // Stores (int) choice inputs
      int password, button,words; // Inputs for puzzles
      boolean runGame = true; // Checks if game is running or not

      while(runGame) {
  
        // ===============
        // TITLE
        // ===============
        clearScreen();
        System.out.print(YELLOW);
        System.out.println("\n\n\t\t\t\t\t\t\t\t=============================================");
        System.out.println("\t\t\t\t\t\t\t\t|            THE PHARAOH\'S TRIAL            |");
        System.out.println("\t\t\t\t\t\t\t\t|          By: Sai, Kavin, & Keneil         |");
        System.out.println("\t\t\t\t\t\t\t\t|     * Beware of the Pharaoh's Curse! *    |");
        System.out.println("\t\t\t\t\t\t\t\t=============================================");
  
        pause(3000);
  
        // Starts Main Menu and allows to chose options
        mainMenu();
        do {
          System.out.print(GREEN + "\t\t\t\t\t\t\t\tEnter your choice (#): " + YELLOW);
          input = in.nextInt();
          if (input < 1 || input > 3) System.out.println(RED + "\n\n\t\t\t\t\t\t\t\tEnter a valid choice!\n\n" + YELLOW);
        } while(input < 1 || input > 3);
  
        switch(input) {
          case 2:
            clearScreen();
            about();
            System.out.print(GREEN + "\tEnter \'1\' to play the game or any other (#) to exit: " + YELLOW);
            playGame = in.nextInt();
            if (playGame != 1) {
              clearScreen();
              exit();
            }
            break;
          case 3:
            clearScreen();
            exit();
            break;
        }
  
        // Starts the game!
        clearScreen();
        long startTime = System.currentTimeMillis(); // Timer starts
        game();
        System.out.print(GREEN + "\n\n\tPress \'1\' to continue or any other (#) to exit: " + YELLOW);
        input = in.nextInt();
        if (input != 1) { clearScreen(); exit(); }
        
        // Starts Puzzle 1
        clearScreen();
        puzzle1();
        // PASWORD IS 3947
        // Checks if input is correct
        do {
          System.out.println(GREEN + "\n\t===================================================");
          System.out.println("\t\t\t    STONE KEYPAD");
          System.out.println("\t--------------------------------------------------");
          System.out.println("\t|\t1\t|\t2\t|\t3\t|");
          System.out.println("\t--------------------------------------------------");
          System.out.println("\t|\t4\t|\t5\t|\t6\t|");
          System.out.println("\t--------------------------------------------------");
          System.out.println("\t|\t7\t|\t8\t|\t9\t|");
          System.out.println("\t--------------------------------------------------");
          System.out.println("\t|\t \t \t0\t \t \t|");
          System.out.println("\t--------------------------------------------------");
          System.out.println("\t===================================================\n");
          System.out.print("\tEnter the password (#): " + YELLOW);
          password = in.nextInt();
          if (password != 3947) { System.out.println(RED + "\n\n\t[ACCESS DENIED]\n\tSomething is watching you...\n\n" + YELLOW); pause(3000); }
        } while(password != 3947);
        System.out.println(GREEN + "\n\n\t*GRRRRK!* The door oppened...\n\n" + YELLOW);
        pause(3000);

        // Starts puzzle 2
        clearScreen();
        puzzle2();
        String piece0 = "God holding staff",piece1 = "Animal head", piece2="Sun symbol";
        int slot1Piece=-1, slot2Piece=-1,slot3Piece=-1,slot,piece=-1,solved=0;//0 is not solved and 1 is solved and -1 means the slot is empty
  
        System.out.println("\tMatch to right pieces to the slots on the wall");
        while (solved==0){
          System.out.println("\n\tCurrent wall slots:");
          if (slot1Piece==-1) System.out.println("\tSlot 1: empty");
          else if (slot1Piece==0) System.out.println("\tSlot 1: " + piece0);
          else if (slot1Piece==1) System.out.println("\tSlot 1: " + piece1);
          else if (slot1Piece==2) System.out.println("\tSlot 1: " + piece2);
          if (slot2Piece == -1) System.out.println("\tSlot 2: empty");
          else if (slot2Piece==0) System.out.println("\tSlot 2: " + piece0);
          else if(slot2Piece==1) System.out.println("\tSlot 2: " + piece1);
          else if (slot2Piece==2) System.out.println("\tSlot 2: " + piece2);
          if (slot3Piece== -1) System.out.println("\tSlot 3: empty");
          else if (slot3Piece==0) System.out.println("\tSlot 3: " + piece0);
          else if (slot3Piece==1) System.out.println("\tSlot 3: " + piece1);
          else if (slot3Piece==2) System.out.println("\tSlot 3: " + piece2);
  
          System.out.println("\n\tPieces available:");
          System.out.println("\t0: " + piece0);
          System.out.println("\t1: " + piece1);
          System.out.println("\t2: " + piece2);
  
          System.out.print(GREEN + "\n\tEnter slot number (1 to 3) to place a piece: " + YELLOW);
          slot = in.nextInt();
  
          if (slot>=1 && slot <=3){
            System.out.print(GREEN + "\tEnter piece number (0 to 2) to pace in slot: " + YELLOW);
            piece = in.nextInt();
  
            if (piece >=0 && piece <=2){
              if (slot==1) slot1Piece=piece;
              else if (slot==2) slot2Piece=piece;
              else if (slot==3) slot3Piece = piece;
              if (slot1Piece==0 && slot2Piece==1 && slot3Piece==2) solved=1;
            }
            else System.out.println(RED + "\tInvalid piece number. try again!!!" + YELLOW);
          }
          else System.out.println(RED + "\tInvalid slot number. try again!!!" + YELLOW);
        }
        System.out.println(GREEN + "\n\n\t*GRRRRK!* The door oppened...\n\n" + YELLOW);
        pause(3000);
        clearScreen();
        
        
        // Starts puzzle 3
        clearScreen();
        puzzle3();
        do { 
          System.out.println(GREEN + "\n\t=========================================================================");
          System.out.println("\t\t\t\t         WALL OF DOOM");
          System.out.println("\t-------------------------------------------------------------------------");
          System.out.println("\t|\t 1. 10100\t|\t 2. 01011\t|\t 3. 22831\t|");
          System.out.println("\t-------------------------------------------------------------------------");
          System.out.println("\t|\t 4. 10010\t|\t 5. 01111\t|\t 6. 01001\t|");
          System.out.println("\t-------------------------------------------------------------------------");
          System.out.println("\t|\t 7. 10001\t|\t 8. 01101\t|\t 9. 00010\t|");
          System.out.println("\t-------------------------------------------------------------------------");
          System.out.println(GREEN + "\n\t=========================================================================");
          System.out.print("\n\n\tEnter the codes (#): " + YELLOW);
          password = in.nextInt();
          if(password != 1589){ System.out.println(RED + "\n\n\t[ACCESS DENIED]\n\tThe Walls are closing in...\n\n" + YELLOW); pause(3000);}
        } while(password != 1589);
       System.out.println(GREEN + "\n\n\t*GRRRRK!* The door oppened...\n\n" + YELLOW);
        pause(3000);
        clearScreen();
        
        // Starts Puzzle 4
        clearScreen();
        puzzle4();
        // Button is 8
        // Checks if input is correct
        do {
          System.out.println(GREEN + "\n\t===================================================================================");
          System.out.println("\t\t\t\t\t      BUTTONS");
          System.out.println("\t----------------------------------------------------------------------------------");
          System.out.println("\t|\t(1)\t|\t(2)\t|\t(3)\t|\t(4)\t|\t(5)\t|");
          System.out.println("\t----------------------------------------------------------------------------------");
          System.out.println("\t|\t(6)\t|\t(7)\t|\t(8)\t|\t(9)\t|\t(10)\t|");
          System.out.println("\t----------------------------------------------------------------------------------");
          System.out.println("\t|\t(11)\t|\t(12)\t|\t(13)\t|\t(14)\t|\t(15)\t|");
          System.out.println("\t----------------------------------------------------------------------------------");
          System.out.println("\n\t===================================================================================");
          System.out.print("\n\n\tEnter the button you want to press (#): " + YELLOW);
          button = in.nextInt();
          if (button < 1 || button > 15) { System.out.println(RED + "\n\n\tEnter a number between 1 and 15!\n\tThe snakes hiss louder...\n\n" + YELLOW); pause(3000); }
          else if (button != 8) { System.out.println(RED + "\n\n\t[ACCESS DENIED]\n\tThe snakes hiss louder...\n\n" + GREEN); pause(3000); }
        } while(button != 8 || button < 1 || button > 15);
        System.out.println(GREEN + "\n\n\t*RUMBLE!* The bridge falls... proceed with caution!\n\n" + YELLOW);
        pause(3000);
        clearScreen();

        // Starts puzzle 5
        clearScreen();
        puzzle5();
        int guess=0,maxGuesses=3,rightCode=7197,attempts=maxGuesses;
     
        System.out.println(YELLOW + "\n\n\tYou have " + maxGuesses + " atttemps to enter the code.\n");
        System.out.println(CYAN + "\tHint: ssalc eht fo srenroc eht gnikcehc yrt\n");//the hint is in reverse. the player has to use their brains to decode the hint
  
        do{
          System.out.print(GREEN + "\tEnter the 4-digit code: " + YELLOW);
          guess = in.nextInt();
  
          if (guess==rightCode){
            System.out.println(GREEN + "\n\n\tThe door opens slowly... You may proceed\n" + YELLOW);
            break;
          }
          else{
            attempts -= 1;
            System.out.println(RED + "\tIncorrect code!!!\n" + YELLOW);
  
            if (attempts>0)System.out.println(RED + "\tAttempts remaining: " + attempts + YELLOW);
            else { System.out.println(RED + "\tThe tomb stays sealed. You have failed...\n" + YELLOW); System.exit(0); }
          }
        } while (attempts>=0);

        pause(3000);
        clearScreen();
        
        // Starts puzzle 6
        clearScreen();
        puzzle6();
        do{
          System.out.println(GREEN + "\n\t=====================================================================");
          System.out.println("\t\t\t\t\t  LABYRINTH");
          System.out.println("\t-----------------------------------------------------------------------");
          System.out.println("\t|      1.CURSE     |      2.YOU     |    3.PHARAOH    |     4.WILL    |");
          System.out.println("\t-----------------------------------------------------------------------");
          System.out.println("\t|      5.HAVE      |    6.NOWHERE   |     7.YOUR      |     8.HEAD    |");
          System.out.println("\t-----------------------------------------------------------------------");
          System.out.println(GREEN + "\n\t=====================================================================");
          System.out.print("\n\n\tEnter the correct sequence of words to escape (#): " + YELLOW);
          words = in.nextInt();
          if(words!=34578) { System.out.println(RED + "\n\n\t[ACCESS DENIED]\n\tThe feeling of overwhelming dread approaches you...\n\n" + YELLOW); pause(3000); }
        } while(words!=34578);
        System.out.println(GREEN + "\n\n\t*CRUMBLE!* You live through the labyrinth... there is a clear path ahead!\n\n" + YELLOW);
        pause(3000);
        clearScreen();

        // THE END SCREEN STARTS
        long endTime = System.currentTimeMillis(); // Timer ends
        long elapsedTime = endTime - startTime; // Find elapsed time
  
        // Checks if they escaped in 20 minutes or not
        if (elapsedTime >= 20 * 60 * 1000) {
          timeUp();
          playAgain = in.nextInt();
          if (playAgain != 1) exit();
        }
        // Asks if they want to play again
        else {
          end();
          playAgain = in.nextInt();
          if (playAgain != 1) exit();
        }

      }//LOOP END
    }//DND
}//DND
