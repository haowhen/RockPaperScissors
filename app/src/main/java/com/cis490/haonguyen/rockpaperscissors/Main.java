package com.cis490.haonguyen.rockpaperscissors;

/**
 * Created by Hao Nguyen on 9/12/2014.
 * CIS 490
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        //Random number generator
        Random random = new Random();

        //Scans input
        Scanner scanner = new Scanner(System.in);

        /*Integer variables to hold user and computer choice
        0 = Rock
        1 = Paper
        2 = Scissors
        */
        int userChoiceToInt, computerChoice;

        //String to hold user's input
        String userChoice;

        //Keeps programming
        do {
            //Shows prompt asking for user input. If user enters quit, then program closes
            System.out.println("Type 'QUIT' to quit game. \nEnter your move (ROCK, PAPER, SCISSORS):");
            userChoice = scanner.next().toUpperCase();
            //If user doesn't type quit, then program will continue to run
            if(!userChoice.equals("QUIT")) {
                //Checking if user made valid input
                if (userChoice.equals("ROCK") || userChoice.equals("PAPER") || userChoice.equals("SCISSORS")) {
                    if (userChoice.equals("ROCK")) {
                        userChoiceToInt = 0;
                    } else if (userChoice.equals("PAPER")) {
                        userChoiceToInt = 1;
                    } else {
                        userChoiceToInt = 2;
                    }
                    //Random number for computer
                    computerChoice = random.nextInt(3);
                    //Both players made the same move
                    if (userChoiceToInt == computerChoice) {
                        System.out.println("Both players chose: " + userChoice + "! Nobody wins.");
                    }
                    //Paper beats Rock
                    else if (userChoiceToInt == 0 && computerChoice == 1)
                    {
                        System.out.println("PAPER beats ROCK. Computer wins!");
                    }
                    else if (userChoiceToInt == 1 && computerChoice == 0)
                    {
                        System.out.println("PAPER beats ROCK. You win!");
                    }
                    //Rock beats Scissors
                    else if (userChoiceToInt == 0 && computerChoice == 2)
                    {
                        System.out.println("ROCK beats SCISSORS. You win!");
                    }
                    else if (userChoiceToInt == 2 && computerChoice == 0)
                    {
                        System.out.println("ROCK beats SCISSORS. Computer wins!");
                    }
                    //Scissors beats Paper
                    else if (userChoiceToInt == 1 && computerChoice == 2)
                    {
                        System.out.println("SCISSORS beats PAPER. Computer wins!");
                    }
                    else
                    {
                        System.out.println("SCISSORS beats PAPER. You win!");
                    }
                }
                //User input was invalid
                else
                {
                    System.out.println("Invalid choice. Please check spelling.");
                }
            }
        }while(!userChoice.equals("QUIT")); //If user types in quit, then the program closes
    }
}
