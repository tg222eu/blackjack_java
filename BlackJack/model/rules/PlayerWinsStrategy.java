package BlackJack.model.rules;

import BlackJack.model.Player;

public class PlayerWinsStrategy implements IScoreStrategy {

    @Override
    public boolean returnWinner(Player a_dealer, Player a_player) {
        if (a_player.CalcScore() > 21) { // modify this part later to use the maxScore variable in Player
            return true;
        } else if (a_dealer.CalcScore() > 21) { // same here
            return false;
        }
        return a_dealer.CalcScore() > a_player.CalcScore();
    }
}