import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class MermaidTest {

  Mermaid mermaid;

  @Before
  public void before() {
    mermaid = new Mermaid("Gina", "La la LAAAAAA", 15, 3, 5.00, 2, "Blond", 1500.00);
  }

  @Test
  public void checkHasName() {
    assertEquals("Gina", mermaid.getName());
  }

  @Test
  public void checkCanMakeSound() {
    assertEquals("La la LAAAAAA", mermaid.getSound());
  }

  @Test
  public void checkAge() {
    assertEquals(15, mermaid.getAge());
  }

  @Test
  public void checkFoodLevel() {
    assertEquals(3, mermaid.getFoodLevel());
  }

  @Test
  public void checkSize() {
    assertEquals(5.00, mermaid.getSize(), 0.01);
  }

  @Test
  public void checkDangerLevel() {
    assertEquals(2, mermaid.getDangerLevel());
  }

  @Test
  public void checkCanBeSold() {
    assertFalse(mermaid.sellable());
  }

  @Test
  public void checkHairColour() {
    assertEquals("Blond", mermaid.getHairColour());
  }

  @Test
  public void  checkSwimmable() {
    assertEquals("Swim down and sit on rocks singing", mermaid.swim());
  }

  @Test
  public void candFeedAnimal() {
    mermaid.feedAnimal(10);
    assertEquals(13, mermaid.getFoodLevel());
  }
}