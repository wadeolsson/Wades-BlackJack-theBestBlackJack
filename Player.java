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
        //play turn (during turn player can hit as many times as they want)
        //while break == false {
            //scanner for hit or stay
            
            //if  hand val is more than 21 or they stay end loop (Break == True) 
            //else: this.hit()
            
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

    public int getBet()
    {
        return 1;
    }

    public void setBet(int newBet)
    {
        //set bet to newBet
    }

    public void handleBet()
    {
        //if their hand value is over 21 or below dealer -> they lose (lose money bet)
        //else if their hand value is eqaul to dealer -> they push (get back money)
        // else -> they win (recieve double thier money bet)
    }
}