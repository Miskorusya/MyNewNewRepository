package hometask15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testTwoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        String result = equation.solve();
        assertEquals("Рівняння 1.00x^2 + -3.00x + 2.00 = 0 має корені:\n" +
                "x1 = 2.00\n" +
                "x2 = 1.00", result);
    }

    @Test
    void testOneRealRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, -2, 1);
        String result = equation.solve();
        assertEquals("Рівняння 1.00x^2 + -2.00x + 1.00 = 0 має один корінь:\n" +
                "x1 = 1.00", result);
    }

    @Test
    void testNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 5);
        String result = equation.solve();
        assertEquals("Рівняння не має дійсних коренів.", result);
    }
}