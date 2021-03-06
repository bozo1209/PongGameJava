package Game.Ball;

import java.awt.*;

import static GUI.BoardPanel.*;

public class Ball {

    private static Ball ballInstance = null;
    private int coordinateX;
    private int coordinateY;
    private final BallDirection ballDirection = BallDirection.getInstance();
    private int ballSpeed = 1;

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

    @SuppressWarnings("PointlessArithmeticExpression")
    public void moveBall(){
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

    public void drawBall(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(getCoordinateX(), getCoordinateY(), UNIT_SIZE, UNIT_SIZE);
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


    public void newBall(){
        this.coordinateX = SCREEN_WIDTH / 2;
        this.coordinateY = SCREEN_HEIGHT / 2;
        this.ballSpeed = 1;
    }

    public void ballAcceleration(){
        this.ballSpeed += 1;
    }


}
