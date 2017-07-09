import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class SeaSerpentTest {

  SeaSerpent seaSerpent;

  @Before
  public void before() {
    seaSerpent = new SeaSerpent("Serpentine", "Fssss", 30, 2, 20.00, 10, 8000.00);
  }

  @Test
  public void checkHasName() {
    assertEquals("Serpentine", seaSerpent.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Fssss", seaSerpent.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(30, seaSerpent.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(2, seaSerpent.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(20.00, seaSerpent.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(10, seaSerpent.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertFalse(seaSerpent.sellable());
  }

  @Test
  public void  checkSwimmable() {
    assertEquals("Swim up and down", seaSerpent.swim());
  }

  @Test
  public void candFeedAnimal() {
    seaSerpent.feedAnimal(10);
    assertEquals(12, seaSerpent.getFoodLevel());
    }
}