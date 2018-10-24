import org.junit.Test;

import static org.junit.Assert.*;

public class YearsAndDaysTest {

    @Test
    public void calculator() {
        YearsAndDays yd = new YearsAndDays();
        assertEquals(yd.calculator(525600),"525600 minutes = 1 y and 0.0 d");
        assertEquals(yd.calculator(1051200),"1051200 minutes = 2 y and 0.0 d");
        assertEquals(yd.calculator(561600),"561600 minutes = 1 y and 25.0 d");



    }
}