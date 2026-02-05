

import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest  {
    private Feline feline;

    @Test
    public void getFamilyTest() {
        Feline  feline = new Feline();
        String family = feline.getFamily();
     assertEquals("Кошачьи",family);

    }
    @Test
    public void getKittensDefaultTest () {
        Feline  feline = new Feline();
        assertEquals (1, feline.getKittens());
    }
    @Test
    public void getFoodTest () throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood  = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood= feline.eatMeat();
        assertEquals("Некорректный результат вызова метода", expectedFood, actualFood);
    }
}
