import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class DragonTest {

  Dragon dragon;

  @Before
  public void before() {
    dragon = new Dragon("Dragonis", "Grrrr", 4, 6, 20.00, 10, "Broad Wing");
  }

  @Test
  public void checkHasName() {
    assertEquals("Dragonis", dragon.getName());
  }
}