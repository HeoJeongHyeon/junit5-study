package heo.junit5study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test")
public class CalculatorTest {

    Caclulator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Caclulator();
    }

    @Test
    @DisplayName("success plus Test")
    void plus() {
        assertEquals(4, calculator.add(1, 3));
    }

    @Test
    @DisplayName("false plus Test")
    void wrongPlus() {
        assertEquals(4, calculator.add(1, 2));

    }
}
