package zoo_management;
import behaviours.*;
import java.util.ArrayList;

public class SwimEnclosure extends Enclosure {

  private ArrayList<Swimmable> cage;

  public SwimEnclosure (String name, EnclosureType type, double size) {
    super(name, type, size);
    this.name = name;
    this.type = type;
    this.size = size;
    this.cage = new ArrayList<Swimmable>();
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

  public void addAnimal(Swimmable animal) {
    double animalSize = animal.getSize();
    if (animalSize <= this.size) {
      this.cage.add(animal);
      this.size -= animalSize;
    }
  }

}