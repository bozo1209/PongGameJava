package GUI;

import Game.Ball;
import Game.TennisRacket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardPanel extends JPanel {

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 600;
    public static final int UNIT_SIZE = 25;
    public static TennisRacket player1TennisRacket = new TennisRacket(true);
    public static TennisRacket player2TennisRacket = new TennisRacket(false);

    Ball ball = Ball.getInstance();
    Timer timer;

    BoardPanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
//        this.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                System.out.println("ffffffffff");
//                Player1TennisRacket.getInstance().move(e);
//                System.out.println("moze jednak?");
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });

        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ball.moveBall();
                repaint();
            }
        });
        timer.start();

    }





    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){

        for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
        }

        for (int i = 0; i < player1TennisRacket.tennisRacketSize; i++){
            g.setColor(Color.RED);
            g.fillRect(0, player1TennisRacket.positionY[i], UNIT_SIZE, UNIT_SIZE);
//            System.out.println("llllllllllll");
        }

        for (int i = 0; i < player2TennisRacket.tennisRacketSize; i++){
            g.setColor(Color.RED);
            g.fillRect(SCREEN_WIDTH - UNIT_SIZE, player2TennisRacket.positionY[i], UNIT_SIZE, UNIT_SIZE);
//            System.out.println("llllllllllll");
        }

        g.setColor(Color.BLUE);
        g.fillOval(ball.getCoordinateX(), ball.getCoordinateY(), UNIT_SIZE, UNIT_SIZE);
    }
}
