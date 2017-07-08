package zoo_management;

public abstract class Animal {

  protected String name;
  protected String sound;
  protected int age;
  protected int foodLevel;
  protected double size;
  protected int dangerLevel;

  public Animal(String name, String sound, int age, int foodLevel, double size, int dangerLevel) {
    this.name = name;
    this.sound = sound;
    this.age = age;
    this.foodLevel = foodLevel;
    this.size = size;
    this.dangerLevel = dangerLevel;
  }

  public String getName() {
    return this.name;
  }

  public String canMakeSound() {
    return this.sound;
  }

  public int getAge() {
    return this.age;
  }

  public int getFoodLevel() {
    return this.foodLevel;
  }

  public double getSize() {
    return this.size;
  }

  public int getDangerLevel() {
    return this.dangerLevel;
  }


}