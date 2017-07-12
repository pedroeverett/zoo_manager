package zoo_management;
import java.util.ArrayList;
import java.util.Random;

public class GeneralEnclosure extends Enclosure {

  private ArrayList<Animal> cage;

  public GeneralEnclosure (String name, EnclosureType type, double size) {
    super(name, type, size);
    this.cage = new ArrayList<Animal>();
  }

  public int getNumberAnimalsInCage() {
    return this.cage.size();
  }

  public void addAnimal(Animal animal) {
    double animalSize = animal.getSize();
    if (animalSize <= this.size) {
      this.cage.add(animal);
      this.size -= animalSize;
    }
  }

  public int removeAnimalByName(Animal animal) {
    this.cage.remove(animal);
    return getNumberAnimalsInCage();
  }

  public int removeAnimalByIndex(int index) {
    this.cage.remove(index);
    return getNumberAnimalsInCage();
  }

  public void addAnimalIfTheyWontEatEachOther(Animal newAnimal) {
    double animalSize = newAnimal.getSize();
    for (Animal animal : cage)
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