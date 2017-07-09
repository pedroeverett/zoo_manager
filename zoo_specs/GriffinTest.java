import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class GriffinTest {

  Griffin griffin;

  @Before
  public void before() {
    griffin = new Griffin("Grinoidis", "Griiiiii", 10, 3, 10.00, 8, "Feather Wing", 3000.00);
  }

  @Test
  public void checkHasName() {
    assertEquals("Grinoidis", griffin.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Griiiiii", griffin.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(10, griffin.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(3, griffin.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(10.00, griffin.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(8, griffin.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertFalse(griffin.sellable());
  }

  @Test
  public void checkWingType() {
    assertEquals("Feather Wing", griffin.getWingType());
  }

  @Test
  public void  checkFlyable() {
    assertEquals("Fly high and near", griffin.fly());
  }

  @Test
  public void candFeedAnimal() {
    griffin.feedAnimal(10);
    assertEquals(13, griffin.getFoodLevel());
    }

}