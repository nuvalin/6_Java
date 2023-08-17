package book3.chapter5;

public class CardGame2 implements Dealable{
    @Override
    public void deal(int cards) {
        System.out.println("Dealing Out"+ cards + "cards");
    }
    private void startGame(Dealable deck, String game)
    {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equals("Hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);
    }

    

}
