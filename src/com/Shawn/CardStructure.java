package com.Shawn;

import java.util.ArrayList;

/**
 * Created by Wolfknightx on 3/1/2016.
 * This will handle the stroage and building of the deck - Lets make a simple Uno Deck
 */
public class CardStructure {
    int cardNumber = 0;
    String cardColor = "";
    double cardCreator = 0;

    public String cardCreator(){
        //a card is composed of both the color and the #.
        return cardColor + " " + cardNumber;
    }

}
