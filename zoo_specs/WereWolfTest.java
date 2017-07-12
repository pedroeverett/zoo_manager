import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class WereWolfTest {

  WereWolf wereWolf;

  @Before
  public void before() {
    wereWolf = new WereWolf("Grumpy", "Rrrrr", 2, 3, 5.00, 7, "Brown", 2000.00);
  }

  @Test
  public void checkHasName() {
    assertEquals("Grumpy", wereWolf.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Rrrrr", wereWolf.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(2, wereWolf.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(3, wereWolf.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(5.00, wereWolf.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(7, wereWolf.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertTrue(wereWolf.sellable());
  }

  @Test
  public void checkFurColour() {
    assertEquals("Brown", wereWolf.getFurColour());
  }

  @Test
  public void candFeedAnimal() {
    wereWolf.feedAnimal(10);
    assertEquals(13, wereWolf.getFoodLevel());
  }

}