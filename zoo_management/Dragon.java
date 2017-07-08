package zoo_management;
import behaviours.*;

public class Dragon extends Animal implements Flyable {

  private String wingType;

  public Dragon (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String wingType) {
    super(name, sound, age, foodLevel, size, dangerLevel)
    this.wingType = wingType;
  }

  public string getWingType() {
    return wingType;
  }
}
