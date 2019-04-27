import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBowling {

   @Test
   public void shouldReturnZeroIfGutterGame() {
      System.out.println("Should return zero if this is a gutter game");
      Bowling bowling = new Bowling();
      int count = 0;
      while ( count < 10)
      {
         bowling.addScore(0);
         bowling.addScore(0);
         count ++;
      }
      assertEquals("Total should be zero",bowling.calcTotal(),0);

   }
}