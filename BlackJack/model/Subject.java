package BlackJack.model;
import BlackJack.controller.PlayGame;

public interface Subject {

    public void register (PlayGame game);
    public void unregister (PlayGame game);
    public void notifyObserver();
}
