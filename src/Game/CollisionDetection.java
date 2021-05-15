package Game;

import GUI.ScorePanel;

import static GUI.BoardPanel.*;

public class CollisionDetection {

    Ball ball = Ball.getInstance();
//    ScorePanel scorePanel = new ScorePanel();

    public void upperSideCollision(){
        if (ball.getCoordinateY() == 0){
            ball.getBallDirection().setVertical(BallDirectionEnum.DOWN);
        }
    }

    public void downSideCollision(){
        if (ball.getCoordinateY() == SCREEN_HEIGHT - UNIT_SIZE){
            ball.getBallDirection().setVertical(BallDirectionEnum.UP);
        }
    }

    public void rightSideCollision(){
        if (ball.getCoordinateX() == SCREEN_WIDTH){
//            System.out.println("sssssssssssssssssssssssssssssssssssssssss");
            ScorePanel.addPlayer1ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void leftSideCollision(){
        if (ball.getCoordinateX() == - UNIT_SIZE){
//            System.out.println("dddddddddddddddddddddddddddddddddddddddddddddd");
            ScorePanel.addPlayer2ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void player1RacketCollision(){
        for (int i = 0; i < player1TennisRacket.tennisRacketSize; i++){
            if (player1TennisRacket.positionY[i] == ball.getCoordinateY() && ball.getCoordinateX() == 0){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.RIGHT);
            }
        }
    }

    public void player2RacketCollision(){
        for (int i = 0; i < player2TennisRacket.tennisRacketSize; i++){
            if (player2TennisRacket.positionY[i] == ball.getCoordinateY() && ball.getCoordinateX() == SCREEN_WIDTH - UNIT_SIZE){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.LEFT);
                System.out.println("udało się?");
            }
        }
    }

}
