package com.Shawn;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Wolfknightx on 3/2/2016.
 * This will be a collection of cards from the CardStructure.
 * What makes a deck: A collection of cards based on
 */
public class DeckStructure {
    ArrayList<CardStructure> cards = new ArrayList<CardStructure>();//this list of cards is built based on the CardStructure format.


    public void createCards(String color, int number){
        //this will populate the deck with the cards.
        for (int x = 0; x < number; x++){
            CardStructure newCardStu = new CardStructure();
            newCardStu.cardColor = color; //call the card structure and fill in the values of the color
            newCardStu.cardNumber = x; //call the card structure and fill in the values of the number
            cards.add(newCardStu);
        }
    }

    public void currentDeckList(){
        //print to console the cards in the deck.
        for (CardStructure card : cards){
            System.out.println(card.cardCreator());
        }
    }

    public void shuffleDeck(){
        //shuffle the deck
        Collections.shuffle(cards);
    }

    public void dealCard(DeckStructure playerhand){
        playerhand.cards.add(cards.get(0));//move the first card into the player's hand
        cards.remove(0);//remove the same card from the deck
    }
}
