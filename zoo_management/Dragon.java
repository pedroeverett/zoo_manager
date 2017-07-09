package zoo_management;
import behaviours.*;

public class Dragon extends Animal implements Flyable {

  private String wingType;

  public Dragon (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String wingType, double price) {
    super(name, sound, age, foodLevel, size, dangerLevel, price);
    this.wingType = wingType;
  }

  public String getWingType() {
    return this.wingType;
  }

  public String fly() {
    return "Fly high high";
  }
}
