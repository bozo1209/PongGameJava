package Game.CollisionDetection;

import GUI.ScorePanel;
import Game.Ball.BallDirectionEnum;


import static GUI.BoardPanel.*;

public class CollisionDetection {


    public void upperSideCollision(){
        if (ball.getCoordinateY() < 0){
            ball.getBallDirection().setVertical(BallDirectionEnum.DOWN);
//            ball.ballAcceleration();
        }
    }

    public void downSideCollision(){
        if (ball.getCoordinateY() > SCREEN_HEIGHT - UNIT_SIZE){
            ball.getBallDirection().setVertical(BallDirectionEnum.UP);
//            ball.ballAcceleration();
        }
    }

    public void rightSideCollision(){
        if (ball.getCoordinateX() >= SCREEN_WIDTH){
            ScorePanel.addPlayer1ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void leftSideCollision(){
        if (ball.getCoordinateX() <= - UNIT_SIZE){
            ScorePanel.addPlayer2ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void player1RacketCollision(){
        for (int i = 0; i < player1TennisRacket.tennisRacketSize; i++){
            if (player1TennisRacket.positionY[i] <= ball.getCoordinateY() && player1TennisRacket.positionY[i + 1] >= ball.getCoordinateY() && ball.getCoordinateX() <= 0){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.RIGHT);
                ball.ballAcceleration();
            }
        }
    }

    public void player2RacketCollision(){
        for (int i = 0; i < player2TennisRacket.tennisRacketSize; i++){
            if (player2TennisRacket.positionY[i] <= ball.getCoordinateY() && player2TennisRacket.positionY[i + 1] >= ball.getCoordinateY() && ball.getCoordinateX() >= SCREEN_WIDTH - UNIT_SIZE){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.LEFT);
                ball.ballAcceleration();
            }
        }
    }

}
