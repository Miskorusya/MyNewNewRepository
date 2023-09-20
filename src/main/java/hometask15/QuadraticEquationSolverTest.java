package hometask15;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationSolverTest {

    @Test
    public void testTwoRealRoots() {
        String result = QuadraticEquationSolver.solve(1, -3, 2);
        assertEquals("Рівняння 1.00x^2 + -3.00x + 2.00 = 0 має корені:\n" +
                "x1 = 2.00\n" +
                "x2 = 1.00\n", result);
    }

    @Test
    public void testOneRealRoot() {
        String result = QuadraticEquationSolver.solve(1, -4, 4);
        assertEquals("Рівняння 1.00x^2 + -4.00x + 4.00 = 0 має один корінь:\n" +
                "x1 = 2.00\n", result);
    }

    @Test
    public void testNoRealRoots() {
        String result = QuadraticEquationSolver.solve(1, 2, 5);
        assertEquals("Рівняння не має дійсних коренів", result);
    }
}