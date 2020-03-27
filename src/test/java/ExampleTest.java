import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    private Example example;

    @Before
    public void setup() {
        example = new Example();
    }

    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", example.getMessage(false));
    }

}
