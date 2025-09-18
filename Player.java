import java.util.ArrayList;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name)
    {
        this.name = name;
        this.money = 100;
    }

    public void playTurn()
    {
        //hit or not
        
    }

    public void hit()
    {
        this.getCard(deck);
    }

    public int getHandValue()
    {
        int handValue = 0;
        int numAces = 0;

        for(Card card : this.hand)
        {
            handValue += card.getValue();
            if(card.getFace() == "ace")
            {
                numAces =+ 1;
            }
        }

        while((handValue > 21) | (numAces > 0))
        {
            handValue -= 10;
        }
        //PROBABLY LOGIC ERROR  
        
        return(handValue);
    }

    public void getCard(Deck deck)
    {
        this.hand.add(deck.getTopCard());
    }
}