import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void should_be_equal_1() {
    Task task = new Task();

    boolean compareResult = task.compare("Alegria","alergia");
    Assert.assertTrue("Comparando os valores \"Alegria\" e \"alergia\": ", compareResult);

    compareResult = task.compare("regalia","galeria");
    Assert.assertTrue("Comparando os valores \"regalia\" e \"galeria\": ", compareResult);

  }
}