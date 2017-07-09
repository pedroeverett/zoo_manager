package zoo_management;
import behaviours.*;
import java.util.ArrayList;
import java.util.Random;

public class FlyEnclosure extends Enclosure {

  private ArrayList<Flyable> cage;

  public FlyEnclosure (String name, EnclosureType type, double size) {
    super(name, type, size);
    this.name = name;
    this.type = type;
    this.size = size;
    this.cage = new ArrayList<Flyable>();
  }

  public String getName() {
    return this.name;
  }

  public EnclosureType getType() {
    return this.type;
  }

  public double getSize() {
    return this.size;
  }

  public int getNumberAnimalsInCage() {
    return this.cage.size();
  }

  public void addAnimal(Flyable animal) {
    double animalSize = animal.getSize();
    if (animalSize <= this.size) {
      this.cage.add(animal);
      this.size -= animalSize;
    }
  }

  public int removeAnimalByName(Flyable animal) {
    this.cage.remove(animal);
    return getNumberAnimalsInCage();
  }

  public int removeAnimalByIndex(int index) {
    this.cage.remove(index);
    return getNumberAnimalsInCage();
  }

  public void addAnimalIfTheyWontEatEachOther(Flyable newAnimal) {
    double animalSize = newAnimal.getSize();
    for (Flyable animal : cage)
    if (animalSize <= this.size && animal.getDangerLevel() == newAnimal.getDangerLevel()) {
      this.cage.add(newAnimal);
      this.size -= animalSize;
    }
  }

  public int randomAnimalRampage() {
      Random ramp = new Random();
      int cageSize = this.getNumberAnimalsInCage();
      int index = ramp.nextInt(cageSize);
      removeAnimalByIndex(index);
      return getNumberAnimalsInCage();
  }

}