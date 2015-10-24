package BlackJack.controller;
import BlackJack.model.*;
import BlackJack.view.IView;

public class PlayGame implements Observer{

  private Game game;
  private IView view;

  public static int welcome = 0;

  public boolean Play(Game a_game, IView a_view) {
    game = a_game;
    view = a_view;

    if(welcome == 0) {
      view.DisplayWelcomeMessage();
      welcome = -1;
    }

    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    int input = a_view.GetInput();
    
    if (input == 'p')
    {
        a_game.NewGame();
    }
    else if (input == 'h')
    {
        a_game.Hit();
    }
    else if (input == 's')
    {
        a_game.Stand();
    }

    return input != 'q';
  }
  @Override
  public void update() {
    view.DisplayWelcomeMessage();
    view.DisplayDealerHand(game.GetDealerHand(), game.GetDealerScore());
    view.DisplayPlayerHand(game.GetPlayerHand(), game.GetPlayerScore());
  }
}