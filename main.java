/*
Project: Haunted Egyptian Escape Game
Team Members: Sai, Keneil, & Kavin
Date: April 25, 2025
Purpose: Final ISU project for the Grade 11 Computer Science course (ICS 3U1).
Description: A text-based adventure game where players explore an ancient pyramid
             and solve puzzles to escape the Pharaoh's curse.
*/

import java.util.Scanner;
//import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class Main {

// GLOBAL VARIABLES
  static int input; // Stores (int) inputs anywhere
  static boolean bool = false; // Checks whether the game is finished or not anywhere
  static Scanner in = new Scanner (System.in); // Scans anything anywhere

// FUNCTIONS/METHODS

  // MAIN MENU METHOD/FUNCTION
    public static void mainMenu() {
      int choice;
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\t\t\t\t\t\t\t\tMain Menu:");
      System.out.println("\t\t\t\t\t\t\t\t1. Play Game");
      System.out.println("\t\t\t\t\t\t\t\t2. About Escape Games");
      System.out.println("\t\t\t\t\t\t\t\t3. Quit\n");
      System.out.print("\t\t\t\t\t\t\t\tEnter your choice (#): ");
      input = in.nextInt();
    }

  // END METHOD/FUNCTION
    public static void end() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\tCONGRATULATIONS YOU BEAT THE GAME! ");
      System.out.println("\t====================================\n");
      System.out.println("\tYou made it out of the pyramid!\n");
      System.out.println("\tThe curse is lifted, and you\'re finally free.\n");
      System.out.println("\tIt was a crazy adventure, but you survived.\n");
      System.out.println("\tThanks for playing our game!\n");
      System.out.println("\tCreated by: Sai, Keneil & Kavin\n"); 
    }

  // GAME METHOD/FUNCTION
    public static void game() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\tGame:");
      System.out.println("\t===================\n");
      System.out.println("\tThe hot Egyptian sun shines down as you walk across the sand.\n");
      System.out.println("\tYou are a curious journalist, searching for the hidden secrets of the pyramids.\n");
      System.out.println("\tMost people think they know what's inside, but you believe there's more to discover.\n");
      System.out.println("\tYou bring your notebook and camera, and find a small passage that looks abandoned.\n");
      System.out.println("\tYou step inside, ignoring the old warning signs carved into the stone...\n");
      System.out.println("\tSuddenly, the heavy door behind you slams shut with a loud bang.\n");
      System.out.println("\tThe air becomes cold...\n");
      System.out.println("\tDust floats around...\n");
      System.out.println("\tTorches on the walls light up by themselves...\n");
      System.out.println("\tYou're no longer exploring. You're trapped.\n");
      System.out.println("\tSomething ancient has awakened.\n");
      System.out.println("\tTo escape, you must solve the puzzles left behind by the Pharaoh.\n");
      System.out.println("\tEach puzzle gets you closer to the exit... or closer to danger.\n");
      System.out.println("\tYour only choice is to move forward and survive.\n");
      // Add on:
    }

  // ABOUT METHOD/FUNCTION
    public static void about() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\tAbout This Game:");
      System.out.println("\t===================\n");
      System.out.println("\tYou are about to enter \'The Pharaoh's Curse\', an interactive text-based adventure game that breaks the 4th wall.\n");
      System.out.println("\tIn this game, you will take on the role of a curious journalist who enters an ancient Egyptian pyramid.\n");
      System.out.println("\tBut what starts as an exciting exploration quickly turns into a terrifying escape mission.\n");
      System.out.println("\tYou'll need to solve mysterious puzzles, interpret ancient hieroglyphics, and use logic to survive.\n");
      System.out.println("\tEach challenge you face is a new part of the story that draws you deeper into the truth of the pyramid.\n");
      System.out.println("\tYour decisions, attention to detail, and problem-solving skills will determine whether you survive the curse... or become part of the legend.\n\n");
      System.out.println("\tRules for this game: ");
      System.out.println("\t-----------------------\n");
      System.out.println("\t- No use of phones or outside help.\n");
      System.out.println("\t- You must escape within 60 minutes.\n\n\n");
      System.out.println("\tCreated by: Sai, Keneil & Kavin.\n\n\n");
      // Add on:
    }

  // EXIT METHOD/FUNCTION
    public static void exit() {
      System.out.println("\n\n\t-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.println("\n\n\tExiting...\n");
      System.exit(0);  // EXITS PROGRAM
    }

  
     // MAIN
    public static void main(String[] args) {

      // ===============
      // VARIABLES
      // ===============
      
      // None yet!

      // ===============
      // TITLE
      // ===============
      System.out.println("\n\n\t\t\t\t\t\t\t\t=============================================");
      System.out.println("\t\t\t\t\t\t\t\t|        HAUNTED EGYPTIAN ESCAPE GAME       |");
      System.out.println("\t\t\t\t\t\t\t\t|          By: Sai, Keneil, & Kavin         |");
      System.out.println("\t\t\t\t\t\t\t\t|     * Beware of the Pharaoh's Curse! *    |");
      System.out.println("\t\t\t\t\t\t\t\t=============================================");

      mainMenu();
      
      switch (input) {
          
        case 1: 
          game(); // GAME MENU
          bool = true;
          break;
          
        case 2: 
          about(); // ABOUT MENU
          System.out.print("\tPress \'1\' to play the game or anything other number to exit: ");
          input = in.nextInt();
          
          if (input == 1) {
            game(); // GAME MENU
            bool = true;
          }

          else exit();
          
          break;
          
        default: 
          exit(); // ENDS PROGRAM
          break;
      }

      if (bool) end(); // Checks if game is finished or not
      
      
    }//DND
}//DND
