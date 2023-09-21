package hometask15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testTwoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        double[] expectedRoots = { 2.0, 1.0 };
        double[] actualRoots = equation.solve();
        assertArrayEquals(expectedRoots, actualRoots, 0.001); // Перевірка з точністю до 0.001
    }

    @Test
    void testOneRealRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, -2, 1);
        double[] expectedRoots = { 1.0 };
        double[] actualRoots = equation.solve();
        assertArrayEquals(expectedRoots, actualRoots, 0.001);
    }

    @Test
    void testNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 5);
        double[] expectedRoots = {}; // Пустий масив для відсутності дійсних коренів
        double[] actualRoots = equation.solve();
        assertArrayEquals(expectedRoots, actualRoots, 0.001);
    }
}