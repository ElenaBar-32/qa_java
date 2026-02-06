import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionSexTest {

    @Mock
    private Feline feline;

    private final String invalidSex;

    public LionSexTest(String invalidSex) {
        this.invalidSex = invalidSex;
    }
    @Parameterized.Parameters (name = "Пол: {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"123"},
                {null},
                {"Львенок"},

        };
    }
    @Before
        public void init () {
            MockitoAnnotations.initMocks(this);
        }

        @Test(expected = Exception.class)
        public void throwExceptionForInvalidSex () throws Exception {
            new Lion(invalidSex, feline);
        }
    }
