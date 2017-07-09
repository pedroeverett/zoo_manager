package zoo_management;
import behaviours.*;
import java.util.ArrayList;

public class Zoo {

  private String name;
  private double money;
  private ArrayList<Enclosure> enclosure;
  private ArrayList<Animal> animal;

  public Zoo(String name, double money) {
    this.name = name;
    this.money = money;
    this.enclosure = new ArrayList<Enclosure>();
    this.animal = new ArrayList<Animal>();
  }

  public String getName() {
    return this.name;
  }

  public double getMoney() {
    return this.money;
  }



}