package Game.TennisRacket;

import java.awt.*;
import java.awt.event.KeyEvent;

import static GUI.BoardPanel.SCREEN_HEIGHT;
import static GUI.BoardPanel.UNIT_SIZE;

public class TennisRacket {

    private final boolean isPlayer1;
    public int tennisRacketSize = 5;
    public int[] positionY = new int[SCREEN_HEIGHT];

    public TennisRacket(boolean isPlayer1){
        this.isPlayer1 = isPlayer1;
        positionY[0] = 150;
        positionY[1] = 175;
        positionY[2] = 200;
        positionY[3] = 225;
        positionY[4] = 250;

    }


    public void moveTennisRocket(KeyEvent e){
        if (isPlayer1){
            if (e.getKeyChar() == 'w'){
                if (positionY[4] != UNIT_SIZE * 4){
                    for (int i = tennisRacketSize - 1; i >= 0; i--){
                        positionY[i] -= UNIT_SIZE;
                    }
                }
            }
            if (e.getKeyChar() == 's'){
                if (positionY[4] != SCREEN_HEIGHT - UNIT_SIZE){
                    for (int i = tennisRacketSize - 1; i >= 0; i--){
                        positionY[i] += UNIT_SIZE;
                    }
                }
            }
        }else {
            if (e.getKeyCode() == KeyEvent.VK_UP){
                if (positionY[4] != UNIT_SIZE * 4){
                    for (int i = tennisRacketSize - 1; i >= 0; i--){
                        positionY[i] -= UNIT_SIZE;
                    }
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                if (positionY[4] != SCREEN_HEIGHT - UNIT_SIZE){
                    for (int i = tennisRacketSize - 1; i >= 0; i--){
                        positionY[i] += UNIT_SIZE;
                    }
                }
            }
        }
    }

    public void drawTennisRacket(Graphics g, int positionX){
        for (int i = 0; i < tennisRacketSize; i++){
            g.setColor(Color.RED);
            g.fillRect(positionX, positionY[i], UNIT_SIZE, UNIT_SIZE);
        }
    }

}
