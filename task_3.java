import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
 @RunWith(Parameterized.class)
public class CheckIsAdultTest {

  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
        this.age=age;
        this.result=result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
            { 18, true},
            { 19, true},
            { 15, false},
            { 21, true},
     };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	int age = 25;
    boolean isAdult = program.checkIsAdult(age);

    assertEquals("Должно вернуться true, так как пользователю 18 лет", true, isAdult);
	}
}
