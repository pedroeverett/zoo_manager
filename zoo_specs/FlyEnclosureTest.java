import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class FlyEnclosureTest {

  FlyEnclosure flyEnclosure; 
  Griffin griffin;
  Manticore manticore;
  Dragon dragon;

  @Before
  public void before() {
    flyEnclosure = new FlyEnclosure("FlyEnclosure1", EnclosureType.FLY, 50.00);
    griffin = new Griffin("Grinoidis", "Griiiiii", 10, 3, 10.00, 8, "Feather Wing");
    manticore = new Manticore("Manty", "Miiiirrrr", 8, 1, 12.00, 7, "Medium Wing");
    dragon = new Dragon("Dragonis", "Draarrr", 4, 6, 20.00, 10, "Broad Wing");
  }

  @Test
  public void checkName() {
    assertEquals("FlyEnclosure1", flyEnclosure.getName() );
  }

  @Test
  public void checkSize() {
    assertEquals(50.00, flyEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkCageStartsEmpty() {
    assertEquals(0, flyEnclosure.getNumberAnimalsInCage());
  }

  @Test 
  public void checkCanAddAnimal() {
    flyEnclosure.addAnimal(griffin);
    assertEquals(40.00, flyEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkCanRemoveAnimal() {
    flyEnclosure.addAnimal(dragon);
    flyEnclosure.addAnimal(griffin);
    flyEnclosure.addAnimal(manticore);
    assertEquals(2, flyEnclosure.removeAnimalByName(griffin));
  }

  @Test 
  public void checkCannotAddAnimalIfTheyEatEachOther() {
    flyEnclosure.addAnimal(dragon);
    flyEnclosure.addAnimalIfTheyWontEatEachOther(manticore);
    assertEquals(30.00, flyEnclosure.getSize(), 0.01);
  }

  @Test
  public void checkAnimalRampage() {
    flyEnclosure.addAnimal(dragon);
    flyEnclosure.addAnimal(manticore);
    assertEquals(1, flyEnclosure.randomAnimalRampage());
  }


}