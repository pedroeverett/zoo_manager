import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class SwimEnclosureTest {

  SwimEnclosure swimEnclosure; 
  SeaSerpent seaSerpent;

  @Before
  public void before() {
    swimEnclosure = new SwimEnclosure("SwimEnclosure1", EnclosureType.SWIM, 60.00);
    seaSerpent = new SeaSerpent("Serpentine", "Fssss", 30, 2, 20.00, 10);
  }

  @Test
  public void checkName() {
    assertEquals("SwimEnclosure1", swimEnclosure.getName() );
  }

  @Test
  public void checkSize() {
    assertEquals(60.00, swimEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkCageStartsEmpty() {
    assertEquals(0, swimEnclosure.getNumberAnimalsInCage());
  }

  @Test 
  public void checkCanAddAnimal() {
    swimEnclosure.addAnimal(seaSerpent);
    assertEquals(40.00, swimEnclosure.getSize(), 0.01);
  }
}