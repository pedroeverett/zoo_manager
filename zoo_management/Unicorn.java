package zoo_management;
import behaviours.*;

public class Unicorn extends Animal  {

  private String horn;

  public Unicorn (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String horn) {
    super(name, sound, age, foodLevel, size, dangerLevel);
    this.horn = horn;
  }

  public String getHorn() {
    return this.horn;
  }

}