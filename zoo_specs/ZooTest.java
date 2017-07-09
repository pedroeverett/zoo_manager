import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class ZooTest {

  Zoo zoo;
  FlyEnclosure flyEnclosure; 
  GeneralEnclosure generalEnclosure;
  SwimEnclosure swimEnclosure; 
  SeaSerpent seaSerpent;
  Nessy nessy; 
  Unicorn unicorn;
  WereWolf wereWolf;
  Griffin griffin;
  Manticore manticore;
  Dragon dragon;

  @Before
  public void before() {
    zoo = new Zoo("Fantasy Zoo", 5000.00);
    generalEnclosure = new GeneralEnclosure("GeneralEnclosure1", EnclosureType.GENERAL, 40.00);
    swimEnclosure = new SwimEnclosure("SwimEnclosure1", EnclosureType.SWIM, 60.00);
    flyEnclosure = new FlyEnclosure("FlyEnclosure1", EnclosureType.FLY, 50.00);
    griffin = new Griffin("Grinoidis", "Griiiiii", 10, 3, 10.00, 8, "Feather Wing");
    manticore = new Manticore("Manty", "Miiiirrrr", 8, 1, 12.00, 7, "Medium Wing");
    dragon = new Dragon("Dragonis", "Draarrr", 4, 6, 20.00, 10, "Broad Wing");
    seaSerpent = new SeaSerpent("Serpentine", "Fssss", 30, 2, 20.00, 10);
    nessy = new Nessy("Nessy", "Glup glup Gluuupp", 2000, 5, 30.00, 5);
    unicorn = new Unicorn("Flufy", "Prrrrr", 3, 1, 7.00, 2, "White and curly");
    wereWolf = new WereWolf("Grumpy", "Rrrrr", 2, 3, 5.00, 7, "Brown");
  }

  @Test
  public void checkName() {
    assertEquals("Fantasy Zoo", zoo.getName());
  }

  @Test
  public void checkMoney() {
    assertEquals(5000.00, zoo.getMoney(), 0.01);
  }


}