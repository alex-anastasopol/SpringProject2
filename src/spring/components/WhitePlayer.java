package spring.components;

import org.springframework.stereotype.Component;
import spring.components.ChessPlayer;

@Component
public class WhitePlayer implements ChessPlayer {

    @Override
    public String toString() {
        return "White Player";
    }
}
