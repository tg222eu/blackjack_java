package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Player;

/**
 * Created by totte on 2015-10-20.
 */
public class Soft17HitStrategy implements IHitStrategy {

    private final int g_hitLimit = 17;

    public boolean DoHit(Player a_dealer) {

        Iterable<Card> dealerHand = a_dealer.GetHand();
        int aceCounter = 0;
        int faceCounter = 0;

        for (Card c : dealerHand) {                  //Count aces on dealers current hand
            if (c.GetValue() == Card.Value.Ace) {
                aceCounter++;
            } else if (c.GetValue() == Card.Value.Ten ||
                    c.GetValue() == Card.Value.Knight ||
                    c.GetValue() == Card.Value.Queen ||
                    c.GetValue() == Card.Value.King) {
                faceCounter++;
            }
        }
        //Force hit even if score is 17 and have atleast one ace on hand and no face card
        if (a_dealer.CalcScore() == g_hitLimit && aceCounter > 0 && faceCounter==0 ) {
            return true;
        }
        return a_dealer.CalcScore() < g_hitLimit;
    }
}
