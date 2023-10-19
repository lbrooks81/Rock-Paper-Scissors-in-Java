/*
 * Name: Logan Brooks
 * South Hills Username: lbrooks81
 */

import java.util.Random;
import java.util.Scanner;

public class Main
{
    //Global Variables
    public static String playerChoice;
    public static String opponentChoice;
    public static int playerScore;
    public static int opponentScore;
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args)
    {
        //Constants
        final int VICTORY_SCORE = 3;

        while(opponentScore < VICTORY_SCORE && playerScore < VICTORY_SCORE)
        {
            inputs();
            opponentChoice();
            victor();
        }
        if(opponentScore == VICTORY_SCORE)
        {
            System.out.println("The opponent beat you.");
        }
        else
        {
            System.out.println("You won.");
        }
    }
    public static void inputs()
    {
        System.out.print("Please enter 'rock', 'paper', or 'scissors': ");
        playerChoice = input.nextLine();
        if(playerChoice.equalsIgnoreCase("rock")||playerChoice.equalsIgnoreCase("paper")||playerChoice.equalsIgnoreCase("scissors"))
        {
            System.out.println("You entered " + playerChoice);
        }
        else
        {
            System.out.print("Invalid input. Please enter 'rock', 'paper', or 'scissors': ");
            playerChoice = input.nextLine();
        }
    }
    public static void opponentChoice()
    {
        int randomNum = random.nextInt(0,3);
        if(randomNum == 0)
        {
            opponentChoice = "rock";
        }
        else if(randomNum == 1)
        {
            opponentChoice = "paper";
        }
        else
        {
            opponentChoice = "scissors";
        }
    }
    public static void victor()
    {
        if(playerChoice.equalsIgnoreCase("rock") && opponentChoice.equalsIgnoreCase("rock"))
        {
            System.out.println("Both players picked rock. This results in a draw.");
        }
        if(playerChoice.equalsIgnoreCase("rock") && opponentChoice.equalsIgnoreCase("paper"))
        {
            System.out.println("The opponent picked paper. Paper beats rock, giving the opponent a point.");
            opponentScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }
        if(playerChoice.equalsIgnoreCase("rock") && opponentChoice.equalsIgnoreCase("scissors"))
        {
            System.out.println("The opponent picked scissors. Rock beats scissors, giving you a point.");
            playerScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }

        if(playerChoice.equalsIgnoreCase("paper") && opponentChoice.equalsIgnoreCase("rock"))
        {
            System.out.println("The opponent picked rock. Paper beats rock, giving you a point.");
            playerScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }
        if(playerChoice.equalsIgnoreCase("paper") && opponentChoice.equalsIgnoreCase("paper"))
        {
            System.out.println("Both players picked paper. This results in a draw.");
        }
        if(playerChoice.equalsIgnoreCase("paper") && opponentChoice.equalsIgnoreCase("scissors"))
        {
            System.out.println("The opponent picked scissors. Scissors beats paper, giving the opponent a point.");
            opponentScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }
        if(playerChoice.equalsIgnoreCase("scissors") && opponentChoice.equalsIgnoreCase("rock"))
        {
            System.out.println("The opponent picked rock. Rock beats scissors, giving the opponent a point.");
            opponentScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }
        if(playerChoice.equalsIgnoreCase("scissors") && opponentChoice.equalsIgnoreCase("paper"))
        {
            System.out.println("The opponent picked paper. Scissors beats paper, giving you a point.");
            playerScore++;
            System.out.println("The score is now " + playerScore + " to " + opponentScore + ". ");
        }
        else
        {
            System.out.println("Both players picked scissors. This results in a draw.");
        }
    }
}