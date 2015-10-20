package BlackJack.model.rules;

import BlackJack.model.Player;

/**
 * Created by Mauro José Pappaterra on 20/10/2015.
 */

public class Soft17HitStrategy implements IHitStrategy{
    private final int g_hitLimit = 17;

    public boolean DoHit(Player a_dealer) {

        if (a_dealer.CalcScore() < g_hitLimit){
            return true;
        }

        if (a_dealer.CalcScore() > g_hitLimit && a_dealer.AceOnHand()){ // if dealer has more than 17 point and one Ace in his hand
            return true; }

    return false;
    }
}
