package Game.TennisRacket;

import java.awt.*;
import java.awt.event.KeyEvent;

import static GUI.BoardPanel.SCREEN_HEIGHT;
import static GUI.BoardPanel.UNIT_SIZE;

public class TennisRacket {

    private final boolean isPlayer1;
//    private static TennisRacket player1TennisRacketInstance = null;
    public int tennisRacketSize = 5;
//    public int tennisRacketUp = 0;
//    public int tennisRacketDown = 100;
    public int[] positionY = new int[SCREEN_HEIGHT];

    public TennisRacket(boolean isPlayer1){
        this.isPlayer1 = isPlayer1;
//        System.out.println("jestem");
        positionY[0] = 150;
        positionY[1] = 175;
        positionY[2] = 200;
        positionY[3] = 225;
        positionY[4] = 250;

    }

//    public static TennisRacket getInstance(){
//        if (player1TennisRacketInstance == null){
//            player1TennisRacketInstance = new TennisRacket();
//        }
//        return player1TennisRacketInstance;
//    }

    public void moveTennisRocket(KeyEvent e){
//        System.out.println("cos sie dzieje?");
//        System.out.println("e " + e);
        if (isPlayer1){
            if (e.getKeyChar() == 'w'){
                for (int i = tennisRacketSize - 1; i >= 0; i--){
//                positionY[i] = positionY[i + 1];
                    positionY[i] -= UNIT_SIZE;
                }
            }
            if (e.getKeyChar() == 's'){
//            System.out.println("typed");
                for (int i = tennisRacketSize - 1; i >= 0; i--){
//                positionY[i] = positionY[i - 1];
//                System.out.println("typed2");
                    positionY[i] += UNIT_SIZE;
//                    System.out.println("positionY[" + i + "] = " + positionY[i]);
                }
            }
        }else {
            if (e.getKeyCode() == KeyEvent.VK_UP){
                for (int i = tennisRacketSize - 1; i >= 0; i--){
//                positionY[i] = positionY[i + 1];
                    positionY[i] -= UNIT_SIZE;
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                for (int i = tennisRacketSize - 1; i >= 0; i--){
//                positionY[i] = positionY[i + 1];
                    positionY[i] += UNIT_SIZE;
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
