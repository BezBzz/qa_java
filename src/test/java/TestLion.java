import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;




public class TestLion {
    Feline feline;


    @Before
    public void setUp() {
        feline =Mockito.mock(Feline.class);
    }
    @Test
    public void LionHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
    @Test
    public void LionNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
    @Test
    public void LionGetFood()throws Exception {
        Lion lion = new Lion("Самец",feline);
        List<String> expectedFood = List.of("Хищник");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, lion.getFood());
    }

}
