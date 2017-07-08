package zoo_management;
import behaviours.*;

public class Nessy extends Animal implements Swimmable {

  public Nessy (String name, String sound, int age, int foodLevel, double size, int dangerLevel) {
    super(name, sound, age, foodLevel, size, dangerLevel);
  }

  public String swim() {
    return "Swim around the lake and you will never see me";
  }
}