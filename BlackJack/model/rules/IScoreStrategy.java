package BlackJack.model.rules;

import BlackJack.model.Player;

/**
 * Created by Mauro José Pappaterra on 20/10/2015.
 */

public interface IScoreStrategy {
    boolean returnWinner (Player a_dealer, Player a_player);
}
