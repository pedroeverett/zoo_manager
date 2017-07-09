package zoo_management;
import behaviours.*;
import java.util.ArrayList;

public class Zoo {

  private String name;
  private double money;
  private ArrayList<Enclosure> enclosureList;
  private ArrayList<Animal> animalList;

  public Zoo(String name, double money) {
    this.name = name;
    this.money = money;
    this.enclosureList = new ArrayList<Enclosure>();
    this.animalList = new ArrayList<Animal>();
  }

  public String getName() {
    return this.name;
  }

  public double getMoney() {
    return this.money;
  }

  public int getNumberAnimals() {
    return this.animalList.size();
  }

  public int getNumberEnclosures() {
    return this.enclosureList.size();
  }

  public void addAnimalToList(Animal animal) {
    this.animalList.add(animal);
  }

  public void addEnclosureToList(Enclosure enclosure) {
    this.enclosureList.add(enclosure);
  }


}