import static org.junit.Assert.*;
import org.junit.*;
import zoo_management.*;

public class VisitorTest {

  Visitor visitor;

  @Before
  public void before() {
    visitor = new Visitor("Pedro", 40);
  }

  @Test
  public void checkName() {
    assertEquals("Pedro", visitor.getName());
  }

  @Test
  public void checkAge() {
    assertEquals(40, visitor.getAge(), 0.01);
  }
}