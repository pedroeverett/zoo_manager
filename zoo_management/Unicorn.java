package zoo_management;

public class Unicorn extends Animal  {

  private String horn;

  public Unicorn (String name, String sound, int age, int foodLevel, double size, int dangerLevel, String horn, double price) {
    super(name, sound, age, foodLevel, size, dangerLevel, price);
    this.horn = horn;
  }

  public String getHorn() {
    return this.horn;
  }

}