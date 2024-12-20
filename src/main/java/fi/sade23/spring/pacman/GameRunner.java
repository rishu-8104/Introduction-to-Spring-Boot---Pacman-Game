package fi.sade23.spring.pacman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class GameRunner {
    @Autowired
    private GameConsole game; 
    public void runGame(){
        game.start();
        game.up();
        game.down();
    }
    public void setGameConsole(GameConsole ourGame) { 
        this.game = ourGame;
    }

}