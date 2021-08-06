package GUI;

import Game.KeyAdapter.MyKeyAdapter;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

//    static final int SCREEN_WIDTH = 600;
//    static final int SCREEN_HEIGHT = 600;
//    static final int UNIT_SIZE = 25;
    @SuppressWarnings("FieldCanBeLocal")
    private final String GAME_NAME = "Pong";

    public GameFrame(){
        this.setTitle(GAME_NAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
//        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setLayout(new BorderLayout());

        this.add(new ScorePanel(), BorderLayout.NORTH);
        this.add(new BoardPanel(), BorderLayout.CENTER);

//        this.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
////                System.out.println("eeeeeeeeeee");
//                Player1TennisRacket.getInstance().move(e);
////                System.out.println("moze, moze jednak?");
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

        this.addKeyListener(new MyKeyAdapter());

        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
