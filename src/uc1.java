import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC1Test {

    @Test
    void testEquality_SameValue() {
        UC1.Feet a = new UC1.Feet(1.0);
        UC1.Feet b = new UC1.Feet(1.0);

        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
    }

    @Test
    void testEquality_DifferentValue() {
        UC1.Feet a = new UC1.Feet(1.0);
        UC1.Feet b = new UC1.Feet(2.0);

        assertFalse(a.equals(b), "1.0 ft should not equal 2.0 ft");
    }

    @Test
    void testEquality_NullComparison() {
        UC1.Feet a = new UC1.Feet(1.0);

        assertFalse(a.equals(null), "Value should not equal null");
    }

    @Test
    void testEquality_SameReference() {
        UC1.Feet a = new UC1.Feet(1.0);

        assertTrue(a.equals(a), "Object should equal itself");
    }

    @Test
    void testEquality_NonNumericInput() {
        UC1.Feet a = new UC1.Feet(1.0);
        String nonNumeric = "not a number";

        assertFalse(a.equals(nonNumeric), "Feet should not equal non-Feet object");
    }
}