package spring.components;

import org.springframework.stereotype.Component;

@Component
public class BlackPlayer implements ChessPlayer {

    @Override
    public String toString() {
        return "Black Player";
    }
}
