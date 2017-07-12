import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class GeneralEnclosureTest {

  GeneralEnclosure generalEnclosure; 
  Unicorn unicorn;
  WereWolf wereWolf;

  @Before
  public void before() {
    generalEnclosure = new GeneralEnclosure("GeneralEnclosure1", EnclosureType.GENERAL, 40.00);
    unicorn = new Unicorn("Flufy", "Prrrrr", 3, 1, 7.00, 2, "White and curly", 4000.00);
    wereWolf = new WereWolf("Grumpy", "Rrrrr", 2, 3, 5.00, 7, "Brown", 2000.00);
  }

  @Test
  public void checkName() {
    assertEquals("GeneralEnclosure1", generalEnclosure.getName() );
  }

  @Test
  public void checkSize() {
    assertEquals(40.00, generalEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkCageStartsEmpty() {
    assertEquals(0, generalEnclosure.getNumberAnimalsInCage());
  }

  @Test 
  public void checkCanAddAnimal() {
    generalEnclosure.addAnimal(wereWolf);
    assertEquals(35.00, generalEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkCanRemoveAnimal() {
    generalEnclosure.addAnimal(unicorn);
    generalEnclosure.addAnimal(wereWolf);
    assertEquals(1, generalEnclosure.removeAnimalByName(unicorn));
  }

  @Test 
  public void checkCannotAddAnimalIfTheyEatEachOther() {
    generalEnclosure.addAnimal(unicorn);
    generalEnclosure.addAnimalIfTheyWontEatEachOther(wereWolf);
    assertEquals(33.00, generalEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkAnimalRampage() {
    generalEnclosure.addAnimal(unicorn);
    generalEnclosure.addAnimal(wereWolf);
    assertEquals(1, generalEnclosure.randomAnimalRampage());
  }
}