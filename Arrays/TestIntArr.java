package Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestIntArr {


    @Test
    public void testIntArr(){
        IntArr intArr = new IntArr();

        assertEquals(intArr.getIntArr()[0], 1);
        assertEquals(intArr.getIntArr()[1], 2);
        assertEquals(intArr.getIntArr()[2], 3);
        assertEquals(intArr.getIntArr()[3], 4);
        assertEquals(intArr.getIntArr()[4], 5);
    }
}
