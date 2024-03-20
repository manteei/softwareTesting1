package third;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OratorTest {

    @Test
    @DisplayName("Check orator's support 1")
    public void testCountSupport_NotMarried_NotSmoking_NotDrinking() {
        Orator orator = new Orator("John", 30, Education.HIGHER, false, false, false, 0);
        assertEquals(0, orator.countSupport(), 0.001);
    }

    @Test
    @DisplayName("Check orator's support 2")
    public void testCountSupport_Married_Smoking_Drinking() {
        Orator orator = new Orator("Jane", 40, Education.COLLEGE, true, true, true, 0.8);
        assertEquals(1.2, orator.countSupport(), 0.001);
    }

    @Test
    @DisplayName("Check orator's support 3")
    public void testCountSupport_NotMarried_NotSmoking_NotDrinking_HigherEducation() {
        Orator orator = new Orator("Mike", 25, Education.HIGHER, false, false, false, 0.9);
        assertEquals(1.8, orator.countSupport(), 0.001);
    }
}
