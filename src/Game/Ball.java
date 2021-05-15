package Game;

import static GUI.BoardPanel.*;

public class Ball {

    private static Ball ballInstance = null;
    private int coordinateX;
    private int coordinateY;
    private BallDirection ballDirection = BallDirection.getInstance();
    private int ballSpeed = 1;

    private Ball(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public static Ball getInstance(){
        if (ballInstance == null){
            System.out.println("spr");
//            ballInstance = new Ball(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
            ballInstance = new Ball(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);

        }
        return ballInstance;
    }

    public void moveBall(){
//        System.out.println("ball position x: " + coordinateX + " position y: " + coordinateY);
        if (ballDirection.getHorizontal() == BallDirectionEnum.RIGHT && ballDirection.getVertical() == BallDirectionEnum.UP){
            setCoordinate(1 * ballSpeed,-1 * ballSpeed);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.RIGHT && ballDirection.getVertical() == BallDirectionEnum.DOWN){
            setCoordinate(1 * ballSpeed,1 * ballSpeed);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.LEFT && ballDirection.getVertical() == BallDirectionEnum.UP){
            setCoordinate(-1 * ballSpeed,-1 * ballSpeed);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.LEFT && ballDirection.getVertical() == BallDirectionEnum.DOWN){
            setCoordinate(-1 * ballSpeed,1 * ballSpeed);
        }
    }

    private void setCoordinate(int changeCoordinateX, int changeCoordinateY){
        this.coordinateX += changeCoordinateX;
        this.coordinateY += changeCoordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public BallDirection getBallDirection(){
        return ballDirection;
    }

//    public void resetBallInstance(){
//        ballInstance = null;
//    }

    public void newBall(){
        this.coordinateX = SCREEN_WIDTH / 2;
        this.coordinateY = SCREEN_HEIGHT / 2;
        this.ballSpeed = 1;
    }

    public void ballAcceleration(){
        this.ballSpeed += 1;
    }


//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }
}
