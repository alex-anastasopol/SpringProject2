package spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import spring.components.BlackPlayer;
import spring.components.WhitePlayer;
import spring.main.ChessGame;

@Configuration
@ComponentScan(basePackages = "spring")
public class AppConfig {
    @Autowired
    BlackPlayer blackPlayer;

    @Autowired
    WhitePlayer whitePlayer;

    @Bean
    @Scope("prototype")
    public ChessGame game() {
        ChessGame chessGame = new ChessGame(whitePlayer, blackPlayer);
        return chessGame;
    }
}