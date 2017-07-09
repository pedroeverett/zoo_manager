package zoo_management;
import behaviours.*;

public class Nessy extends Animal implements Swimmable {

  public Nessy (String name, String sound, int age, int foodLevel, double size, int dangerLevel, double price) {
    super(name, sound, age, foodLevel, size, dangerLevel, price);
  }

  public String swim() {
    return "Swim around and you will never see me";
  }
}