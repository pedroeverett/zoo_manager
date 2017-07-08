import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class ManticoreTest {

  Manticore manticore;

  @Before
  public void before() {
    manticore = new Manticore("Manty", "Miiiirrrr", 8, 1, 12.00, 7, "Medium Wing");
  }

  @Test
  public void checkHasName() {
    assertEquals("Manty", manticore.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("Miiiirrrr", manticore.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(8, manticore.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(1, manticore.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(12.00, manticore.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(7, manticore.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertFalse(manticore.sellable());
  }

  @Test
  public void checkWingType() {
    assertEquals("Medium Wing", manticore.getWingType());
  }

  @Test
  public void  checkFlyable() {
    assertEquals("Fly high and far away", manticore.fly());
  }

}