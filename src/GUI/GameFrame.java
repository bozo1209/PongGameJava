package GUI;

import Game.KeyAdapter.MyKeyAdapter;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    @SuppressWarnings("FieldCanBeLocal")
    private final String GAME_NAME = "Pong";

    public GameFrame(){
        this.setTitle(GAME_NAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(new ScorePanel(), BorderLayout.NORTH);
        this.add(new BoardPanel(), BorderLayout.CENTER);


        this.addKeyListener(new MyKeyAdapter());

        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
