import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
	
   public void testAdd() {
      String str = "First Junit Test";
      assertEquals("First Junit Test",str);
   }
}