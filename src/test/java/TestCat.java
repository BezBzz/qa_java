import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;


public class TestCat {
    Feline feline;
    @Before
    public void SetUp(){
        feline = Mockito.mock(Feline.class);
    }
    @Test
    public void getSound(){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catGetFood() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные","Птицы","Рыбы");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, cat.getFood());
    }

}
