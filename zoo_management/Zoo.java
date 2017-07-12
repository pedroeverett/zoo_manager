package zoo_management;
import behaviours.*;
import java.util.ArrayList;

public class Zoo {

  private String name;
  private double money;
  private int tickets;
  private double ticketPrice;
  private ArrayList<Enclosure> enclosureList;
  private ArrayList<Animal> animalList;
  private ArrayList<Visitor> visitorList;

  public Zoo(String name, double money, int tickets, double ticketPrice) {
    this.name = name;
    this.money = money;
    this.tickets = tickets;
    this.ticketPrice = ticketPrice;
    this.enclosureList = new ArrayList<Enclosure>();
    this.animalList = new ArrayList<Animal>();
    this.visitorList = new ArrayList<Visitor>();
  }

  public String getName() {
    return this.name;
  }

  public double getMoney() {
    return this.money;
  }

  public int getTicketsAvailable() {
    return this.tickets;
  }

  public double getTicketPrice() {
    return this.ticketPrice;
  }

  public int getNumberAnimals() {
    return this.animalList.size();
  }

  public int getNumberEnclosures() {
    return this.enclosureList.size();
  }

  public int getNumberVisitors() {
    return this.visitorList.size();
  }

  public void addAnimalToList(Animal animal) {
    this.animalList.add(animal);
  }

  public void addEnclosureToList(Enclosure enclosure) {
    this.enclosureList.add(enclosure);
  }
  
  public void addVisitorToList(Visitor visitor) {
    this.visitorList.add(visitor);
  }

  public double discountPrice(Visitor visitor) {
    if (visitor.getAge() <= 6 || visitor.getAge() >= 60) {
      double discountPrice = this.ticketPrice - (this.ticketPrice * 0.5);
      return discountPrice;
    }
    return this.ticketPrice;
  }

  public void sellTicket(Visitor visitor) {
    if(this.tickets >=1) {
      this.tickets -= 1;
      addVisitorToList(visitor);
      this.money += discountPrice(visitor);
    }
  }

  public int removeVisitorByName(Visitor visitor) {
    this.visitorList.remove(visitor);
    return getNumberVisitors();
  }

  public boolean checkAnimalIsInTheList(Animal thatAnimal) {
    for(Animal animal : animalList) {
      animal = thatAnimal;
      return true;
    }
    return false;
  }

  public void removeAnimalByName(Animal animal) {
    this.animalList.remove(animal);
  }

  public void sellAnimal(Animal animal) {
    if(checkAnimalIsInTheList(animal) == true && animal.sellable() == true) {
      removeAnimalByName(animal);
      this.money += animal.getPrice();
    }
  }

  public int numberEmptyEnclosures() {
    int count = 0;
    for(Enclosure enclosure : enclosureList ) {
      if(enclosure.getNumberAnimalsInCage() == 0) {
        count++;
      }
    }
    return count;
  }
  
}