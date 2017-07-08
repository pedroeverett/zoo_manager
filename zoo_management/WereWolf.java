package zoo_management;

public class WereWolf extends Animal  {

  private String furColour;

  public WereWolf (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String furColour) {
    super(name, sound, age, foodLevel, size, dangerLevel);
    this.furColour = furColour;
  }

  public String getFurColour() {
    return this.furColour;
  }

}