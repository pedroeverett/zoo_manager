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
  Visitor visitor1;
  Visitor visitor2;
  Visitor visitor3;
  Visitor visitor4;
  Visitor visitor5;

  @Before
  public void before() {
    zoo = new Zoo("Fantasy Zoo", 5000.00, 5, 17.00);
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
    visitor1 = new Visitor("Pedro", 40);
    visitor2 = new Visitor("Liliana", 38);
    visitor3 = new Visitor("Gabriel", 1);
    visitor4 = new Visitor("Laura", 65);
    visitor5 = new Visitor("Justin", 5);
  }

  @Test
  public void checkName() {
    assertEquals("Fantasy Zoo", zoo.getName());
  }

  @Test
  public void checkMoney() {
    assertEquals(5000.00, zoo.getMoney(), 0.01);
  }

  @Test
  public void checkTicketsAvailable() {
    assertEquals(5, zoo.getTicketsAvailable());
  }

  @Test
  public void checkTicketsPrice() {
    assertEquals(17.00, zoo.getTicketPrice(), 0.01);
  }

  @Test
  public void checkAnimalStarEmpty() {
    assertEquals(0, zoo.getNumberAnimals());
  }

  @Test
  public void canAddAnimal() {
    zoo.addAnimalToList(griffin);
    zoo.addAnimalToList(nessy);
    assertEquals(2, zoo.getNumberAnimals());
  }

  @Test
  public void canAddEnclosure() {
    zoo.addEnclosureToList(generalEnclosure);
    zoo.addEnclosureToList(flyEnclosure);
    zoo.addEnclosureToList(swimEnclosure);
    assertEquals(3, zoo.getNumberEnclosures());
  }

  @Test
  public void canAddVisitor() {
    zoo.addVisitorToList(visitor1);
    zoo.addVisitorToList(visitor4);
    assertEquals(2, zoo.getNumberVisitors());
  }

  @Test 
  public void checkDiscountPrice() {
    assertEquals(17.00, zoo.discountPrice(visitor1), 0.01);
    assertEquals(8.50, zoo.discountPrice(visitor5), 0.01);
  }

  @Test
  public void canSellTicketAndAddVisitor() {
    zoo.sellTicket(visitor1);
    zoo.sellTicket(visitor5);
    assertEquals(2, zoo.getNumberVisitors());
    assertEquals(5025.50, zoo.getMoney(), 0.01);
  }

  @Test
  public void checkVisitorCanExit() {
    zoo.sellTicket(visitor1);
    zoo.sellTicket(visitor2);
    zoo.sellTicket(visitor3);
    zoo.sellTicket(visitor4);
    zoo.sellTicket(visitor5);
    assertEquals(4, zoo.removeVisitorByName(visitor3));
  }

}