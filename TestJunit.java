import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
	
   public void testAdd() {
      String str = "Hello World!";
      assertEquals("Hello World!",str);
   }

}