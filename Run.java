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
    ArrayList players = new ArrayList<Player>();

    for(int i = 0; i < numPlayers; i++)
    {
    String playerName;
    Scanner scannerName= new Scanner(System.in);
    System.out.println((String)("Enter name of player " + i));
    playerName = scannerName.nextLine();

    if(playerName == "wade")
    {
        System.out.println("Wow! our favorite player!!!");
    }

    Player playerName = new Player(playerName);

    players.add(playerName);
    }
    //start game while loop (round loop, each iteration is one round of play)
    boolean cont = true;
    while(cont == true)
    {
    //during loop:

        for(int i = 0; i < numPlayers; i++)
        {
        //loop for players to retrieve bets
            //Make player method setBet
            //if bet (getBet) is greater than players money than set bet to their money amount (they bet all of their money, they go all in)  MOVE LOGIC TO PLAYER
            //give every player a hand including dealer.


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
