import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class UnicornTest {

  Unicorn unicorn;

  @Before
  public void before() {
    unicorn = new Unicorn("Flufy", "Prrrrr", 3, 1, 7.00, 2, "White and curly");
  }

  @Test
  public void checkHasName() {
    assertEquals("Flufy", unicorn.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Prrrrr", unicorn.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(3, unicorn.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(1, unicorn.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(7.00, unicorn.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(2, unicorn.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertTrue(unicorn.sellable());
  }

  @Test
  public void checkHorn() {
    assertEquals("White and curly", unicorn.getHorn());
  }

}