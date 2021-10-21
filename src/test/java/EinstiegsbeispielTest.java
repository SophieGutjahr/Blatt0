import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EinstiegsbeispielTest {


    Einstiegsbeispiel skalarproduct = new Einstiegsbeispiel();

    @Test
    public void ergebnisRichtig1(){
        int []a = {1,1,1,1,1,1};
        int []b = {2,2,2,2,2,2};
        int ergebnis = 12;
        assertEquals(skalarproduct.getInnerProdukt(a,b),ergebnis);

    }
    @Test
    public void ErgebnisRichtig2(){
        int [] c= {1,1,1,1};
        int [] d = {3,3,3,3};
        assertEquals(12,skalarproduct.getInnerProdukt(c,d));
    }
    @Test
    

}