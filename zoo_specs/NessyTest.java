import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class NessyTest {

  Nessy nessy;

  @Before
  public void before() {
    nessy = new Nessy("Nessy", "Glup glup Gluuupp", 2000, 5, 30.00, 5, 9000.00);
  }

  @Test
  public void checkHasName() {
    assertEquals("Nessy", nessy.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Glup glup Gluuupp", nessy.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(2000, nessy.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(5, nessy.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(30.00, nessy.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(5, nessy.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertFalse(nessy.sellable());
  }

  @Test
  public void  checkSwimmable() {
    assertEquals("Swim around and you will never see me", nessy.swim());
  }

  @Test
  public void candFeedAnimal() {
    nessy.feedAnimal(10);
    assertEquals(15, nessy.getFoodLevel());
    }
}