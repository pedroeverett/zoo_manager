package zoo_management;

public class Visitor {

  protected String name;
  protected int age;
  

  public Visitor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

}