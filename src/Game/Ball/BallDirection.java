package Game.Ball;


public class BallDirection {

    private static BallDirection ballDirectionInstance = null;
    private  BallDirectionEnum horizontal;
    private BallDirectionEnum vertical;

    private BallDirection(BallDirectionEnum horizontal, BallDirectionEnum vertical){
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public static BallDirection getInstance(){
        if (ballDirectionInstance == null){
            ballDirectionInstance = new BallDirection(BallDirectionEnum.RIGHT, BallDirectionEnum.DOWN);
        }
        return ballDirectionInstance;
    }

    public BallDirectionEnum getHorizontal() {
        return horizontal;
    }

    public BallDirectionEnum getVertical() {
        return vertical;
    }

    public void setHorizontal(BallDirectionEnum horizontal) {
        this.horizontal = horizontal;
    }

    public void setVertical(BallDirectionEnum vertical) {
        this.vertical = vertical;
    }
}
