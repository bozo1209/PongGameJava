package Game;

import static GUI.BoardPanel.*;

public class Ball {

    private static Ball ballInstance = null;
    private int coordinateX;
    private int coordinateY;
    private BallDirection ballDirection = BallDirection.getInstance();

    private Ball(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public static Ball getInstance(){
        if (ballInstance == null){
            ballInstance = new Ball(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
        }
        return ballInstance;
    }

    public void moveBall(){
        if (ballDirection.getHorizontal() == BallDirectionEnum.RIGHT && ballDirection.getVertical() == BallDirectionEnum.UP){
            setCoordinate(1,-1);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.RIGHT && ballDirection.getVertical() == BallDirectionEnum.DOWN){
            setCoordinate(1,1);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.LEFT && ballDirection.getVertical() == BallDirectionEnum.UP){
            setCoordinate(-1,-1);
        }else if (ballDirection.getHorizontal() == BallDirectionEnum.LEFT && ballDirection.getVertical() == BallDirectionEnum.DOWN){
            setCoordinate(-1,1);
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

//    public String getDirection() {
//        return direction;
//    }
//
//    public void setDirection(String direction) {
//        this.direction = direction;
//    }
}
