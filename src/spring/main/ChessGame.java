package spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import spring.components.BlackPlayer;
import spring.components.WhitePlayer;

public class ChessGame {
    @Autowired
    static BlackPlayer blackPlayer;

    @Autowired
    static WhitePlayer whitePlayer;

    public String play() {
        double random = Math.random();
        String result = random < 0.33 ? "White won" : (random < 0.67 ? "Black Won" : "Draw");
        System.out.println("Game between" + whitePlayer + " and " + blackPlayer + ". Game result:" + result);

        return result;
    }
}
