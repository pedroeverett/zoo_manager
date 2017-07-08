package zoo_management;
import behaviours.*;

public abstract class Animal implements Sellable{

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

  public Boolean sellable() {
    if (this.age < 5) {
      return true;
    }
    return false;
  }


}