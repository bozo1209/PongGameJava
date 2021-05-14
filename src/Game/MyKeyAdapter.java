package Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static GUI.BoardPanel.player1TennisRacket;
import static GUI.BoardPanel.player2TennisRacket;

public class MyKeyAdapter extends KeyAdapter {

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        player1TennisRacket.move(e);
        player2TennisRacket.move(e);
    }
}
