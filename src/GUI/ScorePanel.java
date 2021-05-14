package GUI;

import javax.swing.*;
import java.awt.*;

public class ScorePanel extends JPanel {

    private int player1Score;
    private int player2Score;
    private final String gameScore = "Player1 " + player1Score + " : " + player2Score + " Player2 ";
    private final JLabel scoreLabel = new JLabel(gameScore);

    ScorePanel(){
        scoreLabel.setFont(new Font(null, Font.ITALIC, 35));
        this.add(scoreLabel);
        this.setBackground(Color.GRAY);
    }

    public void addPlayer1ScorePoint(){
        this.player1Score++;
    }

    public void addPlayer2ScorePoint(){
        this.player2Score++;
    }

    public void updateGameScore(){
        scoreLabel.setText(gameScore);
    }
}
