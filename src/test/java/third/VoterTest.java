package third;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoterTest {

    @Test
    @DisplayName("Check shout 1")
    public void testShout_WithPositiveCriticalThinking() {
        Voter voter = new Voter("Alice", 30, Education.HIGHER, 10, 0.5);
        assertEquals(10, voter.shout(), 0.001);
    }

    @Test
    @DisplayName("Check shout 2")
    public void testShout_WithZeroCriticalThinking() {
        Voter voter = new Voter("Bob", 35, Education.COLLEGE, 8, 0.1);
        assertEquals(1.2, voter.shout(), 0.001);
    }

    @Test
    @DisplayName("Check shout 3")
    public void testShout_WithNegativeCriticalThinking() {
        Voter voter = new Voter("Charlie", 40, Education.SCHOOL_EDUCATION, 6, 0.3);
        assertEquals(1.799, voter.shout(), 0.001);
    }
}
