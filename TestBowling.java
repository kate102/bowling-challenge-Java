import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestBowling {
    @Test

    public void shouldReturnZeroForGutterGame(){
        String message = "Should return zero";
        System.out.println(message);
        Bowling bowling = new Bowling();
        int count = 0;
        while (count < 10){
            bowling.addScore(0);
            bowling.addScore(0);
            count++;
        } 
        assertEquals(message,bowling.calcTotal(),0);
    }

}