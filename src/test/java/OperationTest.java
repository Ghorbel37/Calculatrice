import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OperationTest {

    @Test
    void addition() {
        assertEquals(5, Operation.addition(2, 3));
        assertEquals(-1, Operation.addition(2, -3));
        assertEquals(0, Operation.addition(0, 0));
    }

    @Test
    void soustraction() {
        assertEquals(-1, Operation.soustraction(2, 3));
        assertEquals(5, Operation.soustraction(2, -3));
    }

    @Test
    void multiplier() {
        assertEquals(6, Operation.multiplier(2, 3));
        assertEquals(-6, Operation.multiplier(2, -3));
        assertEquals(0, Operation.multiplier(7, 0));
    }

    @Test
    void divisionGivesADecimalResult() {
        assertEquals(2.0 / 3, Operation.division(2, 3), 1e-12);
        assertEquals(2.0, Operation.division(6, 3), 1e-12);
        assertEquals(-2.5, Operation.division(-5, 2), 1e-12);
    }

    @Test
    void divisionByZeroReturnsZero() {
        assertEquals(0.0, Operation.division(5, 0));
    }
}
