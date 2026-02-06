import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock

    private Feline feline;


@Test
public void getKittensTest () throws Exception  {
    Lion lion = new Lion("Самка", feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    int actualKittens = lion.getKittens();
    assertEquals (1, actualKittens);
}

@Test
    public void getFoodTest ()  throws Exception {
    Lion lion = new Lion("Самец", feline);
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
    List<String> actualResult = lion.getFood();
    assertEquals("Некорректный результат вызова метода", expectedFood, actualResult);
}

    @Test
    public void doesHaveManeTest () throws Exception  {
        Lion lion = new Lion("Самец",feline);
        boolean expectedMane = true;
        boolean actualMane = lion.doesHaveMane();
        assertEquals(expectedMane, actualMane);
    }
}

