package zoo_management;
import behaviours.*;

public class Mermaid extends Animal implements Swimmable {

  private String hairColour;

  public Mermaid (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String hairColour) {
    super(name, sound, age, foodLevel, size, dangerLevel);
    this.hairColour = hairColour;
  }

  public String getHairColour() {
    return this.hairColour;
  }

  public String swim() {
    return "Swim down and sit on rocks singing";
  }
}