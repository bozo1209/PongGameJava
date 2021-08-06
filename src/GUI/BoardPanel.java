package GUI;

import Game.Ball.Ball;
import Game.CollisionDetection.CollisionDetection;
import Game.TennisRacket.TennisRacket;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {

    public static final int SCREEN_WIDTH = 900;
    public static final int SCREEN_HEIGHT = 425;
    public static final int UNIT_SIZE = 25;
    public static final TennisRacket player1TennisRacket = new TennisRacket(true);
    public static final TennisRacket player2TennisRacket = new TennisRacket(false);
    public static final Ball ball = Ball.getInstance();
    @SuppressWarnings("FieldCanBeLocal")
    private final Timer timer;
    private final CollisionDetection collisionDetection = new CollisionDetection();

    BoardPanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

        timer = new Timer(1, e -> {
            collisionDetection.upperSideCollision();
            collisionDetection.downSideCollision();
            collisionDetection.rightSideCollision();
            collisionDetection.leftSideCollision();
            collisionDetection.player1RacketCollision();
            collisionDetection.player2RacketCollision();
            ball.moveBall();
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
        player1TennisRacket.drawTennisRacket(g, 0);
        player2TennisRacket.drawTennisRacket(g, SCREEN_WIDTH - UNIT_SIZE);
        ball.drawBall(g);
    }

    public void draw(Graphics g){

        for (int i = 0; i < SCREEN_WIDTH / UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
        }

        for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
            g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
        }


    }
}
