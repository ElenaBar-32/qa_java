
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)

public class TestParameterized {
    private final String sex;
    private final boolean expectedMane;


    public TestParameterized(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters(name = "Пол: {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest()  throws Exception {
        Lion lion = new Lion(sex);
        boolean actualMane = lion.doesHaveMane();
        assertEquals(expectedMane, actualMane);
    }
  @Test (expected = Exception.class)
  public void getManeTestException () throws Exception {
      Lion lion = new Lion("Львенок");
       System.out.println("Используйте допустимые значения пола животного - самец или самка");

 }
}
