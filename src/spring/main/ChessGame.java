package spring.main;

import org.springframework.stereotype.Component;
import spring.components.ChessPlayer;


@Component
public class ChessGame {

    ChessPlayer whitePlayer;
    ChessPlayer blackPlayer;

    public ChessGame(ChessPlayer whitePlayer, ChessPlayer blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public String play() {
        double random = Math.random();
        String result = random < 0.33 ? "White won" : (random < 0.67 ? "Black Won" : "Draw");
        System.out.println("Game between " + whitePlayer + " and " + blackPlayer + ". Game result: " + result);

        return result;
    }
}


