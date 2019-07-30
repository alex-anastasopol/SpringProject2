package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;

import java.lang.annotation.Annotation;

public class Main {
    private ChessGame chessGame;
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ChessGame game = context.getBean("chessGame");
        game.play();
    }
}
