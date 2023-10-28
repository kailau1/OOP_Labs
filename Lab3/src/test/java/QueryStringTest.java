import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueryStringTest {

    private QueryString test1;
    private QueryString test2;
    private QueryString test3;

    @BeforeEach
    void setUp() {
        // Setup common data for tests
        test1 = new QueryString("name=Alice&age=19&country=UK");
        test2 = new QueryString("message=Hello%2C+world%21");
        test3 = new QueryString("");
    }

    @Test
    void testGetParameter() {
        assertEquals("Alice", test1.getParameter("name"));
        assertEquals("19", test1.getParameter("age"));
        assertEquals("UK", test1.getParameter("country"));
        assertNull(test1.getParameter("occupation"));
        assertNull(test3.getParameter("name"));
        assertEquals("Hello, world!", test2.getParameter("message"));
    }

    @Test
    void testHasParameter() {
        assertTrue(test1.hasParameter("name"));
        assertTrue(test1.hasParameter("age"));
        assertTrue(test1.hasParameter("country"));
        assertFalse(test1.hasParameter("count"));
        assertFalse(test1.hasParameter("occupation"));
        assertFalse(test3.hasParameter("name"));
    }

    @Test
    void testGetParameterOffset() {
        assertEquals(0, test1.getParameterOffset("name"));
        assertEquals(11, test1.getParameterOffset("age"));
        assertEquals(-1, test1.getParameterOffset("occupation"));
    }

    @Test
    void testDecode() {
        assertEquals("Hello, world!", test2.decode("Hello%2C+world%21"));
    }
}
