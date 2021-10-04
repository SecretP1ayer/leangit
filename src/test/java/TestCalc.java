import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
    @Test
    public void  test_add(){

        assertEquals(Calc.add(1,1),2);

    }
    @Test
    public  void  test_subtract(){

        assertEquals(Calc.subtract(1,1),0);

    }
}

