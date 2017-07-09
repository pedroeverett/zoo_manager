package zoo_management;

public abstract class Enclosure {

  protected String name;
  protected EnclosureType type;
  protected double size;

  public Enclosure(String name, EnclosureType type, double size) {
    this.name = name;
    this.type = type;
    this.size = size;
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

}