import Game.CollisionDetection;
import Game.TennisRacket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollisionDetectionTest {

    TennisRacket player1TennisRacket;
    TennisRacket player2TennisRacket;
    CollisionDetection collisionDetection;

    @BeforeEach
    void setUp(){
        player1TennisRacket = new TennisRacket(true);
        player2TennisRacket = new TennisRacket(false);
        collisionDetection = new CollisionDetection();
    }

    @Test
    void player1TennisRacketCollisionDetectionTest(){

    }
}
