
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class TestFeline {
Feline feline = new Feline();

@Test
    public void EatMeat() throws Exception {
    List<String>expectedFood = List.of("Животные", "Птицы", "Рыба");
    Assert.assertEquals(expectedFood, feline.eatMeat());
}
@Test
    public void GetFamily(){
    Assert.assertEquals("Кошачьи", feline.getFamily());
}
@Test
    public void GetKittensWithGivenCount(){
    Assert.assertEquals(5,feline.getKittens(5));
}


}
