import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    private String name;
    private double money;
    private ArrayList<Card> hand = new ArrayList<>();
    private double bet;

    public Player(String name)
    {
        this.name = name;
        this.money = 100;
        this.bet = 0;
    }

    public void playTurn(Deck deck)
    {
        //play turn (during turn player can hit as many times as they want)
        //while break == false {
            //scanner for hit or stay
            
            //if  hand val is more than 21 or they stay end loop (Break == True) 
            //else: this.hit()
        boolean cont = true;
        while(cont = true)
        {
            String hitStay;
            System.out.println("You have" + this.hand);
            Scanner scannerHitStay= new Scanner(System.in);
            System.out.println("Do you want to hit or stay?");
            hitStay = scannerHitStay.nextLine();

            if (hitStay.equals("hit"))
            {
                hit(deck);
            }

            else if (hitStay.equals("stay") | (getHandValue() > 21)|())
            {
                cont = false;
                break;
            }

            else
            {
                System.out.println("something went wrong, please retype. Make sure you typed 'hit' or 'stay'.");
            }

        }
            
    }

    public void hit(Deck deck)
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
            if(card.getFace().equals("A"))
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

    public double getBet()
    {
        return(this.bet);
    }

    public void setBet()
    {

        double newBet;
        Scanner scannerBet= new Scanner(System.in);
        System.out.println("How much money do you" + this.name +"want to bet? You currently have "+ this.money);
        newBet = scannerBet.nextInt();
        scannerBet.nextLine();

        if(bet > money)
        {
            System.out.println("All in!!!");
            this.bet = this.money;
        }

        else
        {
            this.bet = newBet;
        }
        
    }

    public void handleBet()
    {
        //if their hand value is over 21 or below dealer -> they lose (lose money bet)
        //else if their hand value is eqaul to dealer -> they push (get back money)
        // else -> they win (recieve double thier money bet)


    }
}
