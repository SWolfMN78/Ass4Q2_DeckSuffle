package com.Shawn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program which simulates handing a player a random (shuffled) card from a deck.

        //storage items and variables to be worked with.
        DeckStructure deck = new DeckStructure();
        DeckStructure player1Hand = new DeckStructure();
        CardStructure myDeckInfo = new CardStructure();
        String cardColor = ""; //just an empty card for now - will populate later
        double cardNumber = 0; //this is the base value of any card
        int suitSize = 0; //each color will have this many cards applied to it
        String userInput = "y";
        Scanner scanner = new Scanner(System.in); //just incase we want to ask the user anything.

        //Ask the user how large will the deck be and store that value - This should be outside the of loop.
        System.out.println("Welcome to the Uno Deck Creator! Lets get started.");
        System.out.println("First tell me the maximum range of numbers you want to play with");
        int cardRange = scanner.nextInt(); //Take this number and apply it to the array
        suitSize = cardRange; //pushed information into variable to be used.

        String newCardColor = scanner.nextLine();
        while (userInput.equalsIgnoreCase("y")){ //here we start building our deck...
            //As long as the value of userInput = Y ask the following questions.
            System.out.println("What color would you like added to the deck?");

            newCardColor = scanner.nextLine();
            cardColor = newCardColor; //pushed information into variable to be used.

            //here we're going to push
            deck.createCards(cardColor, suitSize);

            System.out.println("Do you have any further colors to add? Use Y or N.");
            userInput = scanner.nextLine();
        }

        //here we shuffle the built deck then deal out the cards created.
        deck.currentDeckList(); //display the list of cards into

        //lets shuffle the above list then display the new one
        deck.shuffleDeck();
        deck.currentDeckList();

        //hand the player a card at random
        deck.dealCard(player1Hand);//push cards into the player's hand
        deck.dealCard(player1Hand);
        System.out.println("Player 1's hand is now " );
        player1Hand.currentDeckList();//show the players hand
    }
}
