package BlackJack;

import BlackJack.model.Game;
import BlackJack.view.*;
import BlackJack.controller.*;

public class Program
{
  public static void main(String[] a_args)
  {

    Game g = new Game(); //MODEL
    IView v = new SimpleView(); //new SwedishView(); //VIEW
    PlayGame ctrl = new PlayGame(); //CONTROLLER

    g.getDealer().register(ctrl); //Register observer

    while (ctrl.Play(g, v));
  }
}