package zoo_management;
import behaviours.*;

public class SeaSerpent extends Animal implements Swimmable {

  public SeaSerpent (String name, String sound, int age, int foodLevel, double size, int dangerLevel, double price) {
    super(name, sound, age, foodLevel, size, dangerLevel, price);
  }

  public String swim() {
    return "Swim up and down";
  }

}