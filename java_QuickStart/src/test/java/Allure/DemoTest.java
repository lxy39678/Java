package Allure;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.*;

public class DemoTest {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();
    @Test
    public void demo1(){
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        assertEquals(1,2);
        assertTrue(false);
        assertEquals(3,4);

    }

    @Test
    public void demo2(){
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
        errorCollector.checkThat(1,equalTo(2));
    }

}
