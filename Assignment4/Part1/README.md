This project simulates a deck of cards using Java. It consists of three main classes: Main, Card, and Deck.

**Main Class**
The Main class serves as the entry point for the program. It creates an instance of the Deck class, initializes the deck, and displays a menu for interacting with the deck.

**Card Class**
The Card class represents a single playing card. It contains fields for rank and suit, as well as methods for getting the rank, suit, and a string representation of the card. Additionally, it implements the Comparable interface to allow for comparison between cards based on their rank and suit.

**Deck Class**
The Deck class represents a deck of cards. It contains a vector of Card objects and provides methods for creating a standard 52-card deck, shuffling the deck, drawing cards, printing the deck, comparing cards, finding cards by rank and suit, dealing hands of cards, emptying the deck, and sorting the deck.

**Menu Options**
. Display the deck of cards
(2)Shuffle the deck of cards
(3)Draw a card from the deck
(4)Empty the deck
(5)Print a card from the deck
(6)Compare two cards
(7)Check if two cards are the same
(8)Find a card by rank and suit
(9)Deal a hand of cards
(10)Sort the deck
(11)Exit
