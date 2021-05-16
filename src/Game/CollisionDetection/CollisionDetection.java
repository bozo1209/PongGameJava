package Game.CollisionDetection;

import GUI.ScorePanel;
import Game.Ball.BallDirectionEnum;

import static GUI.BoardPanel.*;

public class CollisionDetection {

//    Ball ball = Ball.getInstance();
//    ScorePanel scorePanel = new ScorePanel();

    public void upperSideCollision(){
//        System.out.println("ball position x: " + ball.getCoordinateX() + " position y: " + ball.getCoordinateY());
//        if (ball.getCoordinateY() == 0){
            if (ball.getCoordinateY() < 0){
            ball.getBallDirection().setVertical(BallDirectionEnum.DOWN);
//            System.out.println("odbicie");
            ball.ballAcceleration();
        }
    }

    public void downSideCollision(){
//        if (ball.getCoordinateY() == SCREEN_HEIGHT - UNIT_SIZE){
            if (ball.getCoordinateY() > SCREEN_HEIGHT - UNIT_SIZE){
            ball.getBallDirection().setVertical(BallDirectionEnum.UP);
            ball.ballAcceleration();
        }
    }

    public void rightSideCollision(){
        if (ball.getCoordinateX() >= SCREEN_WIDTH){
//            System.out.println("sssssssssssssssssssssssssssssssssssssssss");
            ScorePanel.addPlayer1ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void leftSideCollision(){
        if (ball.getCoordinateX() <= - UNIT_SIZE){
//            System.out.println("dddddddddddddddddddddddddddddddddddddddddddddd");
            ScorePanel.addPlayer2ScorePoint();
            ScorePanel.updateGameScore();
            ball.newBall();
        }
    }

    public void player1RacketCollision(){
//        System.out.println("player1TennisRacket position" + Arrays.toString(player1TennisRacket.positionY) + " ball position x: " + ball.getCoordinateX() + " position y: " + ball.getCoordinateY());
        for (int i = 0; i < player1TennisRacket.tennisRacketSize; i++){
//            System.out.println("i = " + i + "player1TennisRacket position" + player1TennisRacket.positionY[i] + " ball position x: " + ball.getCoordinateX() + " position y: " + ball.getCoordinateY());
//            if (player1TennisRacket.positionY[i] == ball.getCoordinateY() && ball.getCoordinateX() == 0){
            if (player1TennisRacket.positionY[i] <= ball.getCoordinateY() && player1TennisRacket.positionY[i + 1] >= ball.getCoordinateY() && ball.getCoordinateX() <= 0){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.RIGHT);
                ball.ballAcceleration();
//                    System.out.println("p1 ball position x: " + ball.getCoordinateX() + " position y: " + ball.getCoordinateY());
            }
        }
    }

    public void player2RacketCollision(){
        for (int i = 0; i < player2TennisRacket.tennisRacketSize; i++){
//            if (player2TennisRacket.positionY[i] == ball.getCoordinateY() && ball.getCoordinateX() == SCREEN_WIDTH - UNIT_SIZE){
            if (player2TennisRacket.positionY[i] <= ball.getCoordinateY() && player2TennisRacket.positionY[i + 1] >= ball.getCoordinateY() && ball.getCoordinateX() >= SCREEN_WIDTH - UNIT_SIZE){
                ball.getBallDirection().setHorizontal(BallDirectionEnum.LEFT);
                ball.ballAcceleration();
//                System.out.println("udało się?");
//                    System.out.println("p2 ball position x: " + ball.getCoordinateX() + " position y: " + ball.getCoordinateY());
            }
        }
    }

}
