import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class DragonTest {

  Dragon dragon;

  @Before
  public void before() {
    dragon = new Dragon("Dragonis", "Draarrr", 4, 6, 20.00, 10, "Broad Wing");
  }

  @Test
  public void checkHasName() {
    assertEquals("Dragonis", dragon.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Draarrr", dragon.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(4, dragon.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(6, dragon.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(20.00, dragon.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(10, dragon.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertTrue(dragon.sellable());
  }

  @Test
  public void checkWingType() {
    assertEquals("Broad Wing", dragon.getWingType());
  }

  @Test
  public void  checkFlyable() {
    assertEquals("Fly high high", dragon.fly());
  }

  @Test
  public void candFeedAnimal() {
    dragon.feedAnimal(10);
    assertEquals(16, dragon.getFoodLevel());
    }
}