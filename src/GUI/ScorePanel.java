package GUI;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {

    private static int player1Score;
    private static int player2Score;
    private static String gameScore = "Player1 " + player1Score + " : " + player2Score + " Player2 ";
    private static final JLabel scoreLabel = new JLabel(gameScore);
//private final JLabel scoreLabel = new JLabel();

    ScorePanel(){
//        System.out.println("*************");
//        scoreLabel.setText("dddddddddd");
        scoreLabel.setFont(new Font(null, Font.ITALIC, 35));
        this.add(scoreLabel);
        this.setBackground(Color.GRAY);
    }

    public static void addPlayer1ScorePoint(){
        player1Score++;
    }

    public static void addPlayer2ScorePoint(){
        player2Score++;
    }

    public static void updateGameScore(){
        gameScore = "Player1 " + player1Score + " : " + player2Score + " Player2 ";
//        System.out.println(gameScore);
        scoreLabel.setText(gameScore);
//        scoreLabel.paintImmediately(scoreLabel.getVisibleRect());
//        scoreLabel.setText("czes");
    }
}
