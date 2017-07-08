package zoo_management;
import behaviours.*;

public class Griffin extends Animal implements Flyable {

  private String wingType;

  public Griffin (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String wingType) {
    super(name, sound, age, foodLevel, size, dangerLevel);
    this.wingType = wingType;
  }

  public String getWingType() {
    return this.wingType;
  }

  public String fly() {
    return "Fly high and near";
  }
}