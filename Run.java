import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for(Card card : deck.getCards())
        {
            System.out.println(card);
        }
    
    //Scanner for int num players or n

    int numPlayers;
    Scanner scannerObj= new Scanner(System.in);
    System.out.println("Enter number of players (int)");
    numPlayers = scannerObj.nextInt();
    scannerObj.nextLine();

    //Create n player objects for each of those inputs with scanners for names
    ArrayList<Player> players = new ArrayList<>();

    for(int i = 0; i < numPlayers; i++)
    {
        String playerName;
        Scanner scannerName= new Scanner(System.in);
        System.out.println("Enter name of player " + (i+1));
        playerName = scannerName.nextLine();


        if(playerName.equals( "wade"))
        {
            System.out.println("Wow! our favorite player!!!");
        }

        Player player = new Player(playerName);

        players.add(player);
    }
    //start game while loop (round loop, each iteration is one round of play)
    boolean cont = true;
    while(cont == true)
    {
    //during loop:

        for(Player player : players)
        {
        //loop for players to retrieve bets
            //Make player method setBet
            //if bet (getBet) is greater than players money than set bet to their money amount (they bet all of their money, they go all in)  MOVE LOGIC TO PLAYER
            //give every player a hand including dealer.

            player.setBet();

        }
       

        //loop through each player
        //during loop:
            //play turn (during turn player can hit as many times as they want)
            //if they have more hand val is more than 21 or stay end loop {PLAYER}

        //go over players hand values and to see if they lost, push, or won
        //loop through all players:
            //handle bets

    //Once round is done option to quit or keep playing
    }
    }
}
