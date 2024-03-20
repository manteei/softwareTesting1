package third;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    @Test
    @DisplayName("Check influence 1")
    public void testGetInfluenceOfOrator_PositiveRespect() {
        Orator orator = new Orator("John", 50, Education.SCHOOL_EDUCATION, true, true, true, 0.5); // Создаем оратора с положительным уровнем уважения
        Event event = new Event("Elections", "Elections 2024", 5, orator);
        assertEquals(2.5, event.getInfluenceOfOrator(), 0.001);
    }

    @Test
    @DisplayName("Check influence 2")
    public void testGetInfluenceOfOrator_ZeroRespect() {
        Orator orator = new Orator("John", 50, Education.COLLEGE, false, false, false, 0); // Создаем оратора с нулевым уровнем уважения
        Event event = new Event("Elections", "Elections 2024", 2, orator);
        assertEquals(2, event.getInfluenceOfOrator(), 0.001);
    }

    @Test
    @DisplayName("Check influence 3")
    public void testGetInfluenceOfOrator_NegativeRespect() {
        Orator orator = new Orator("John", 50, Education.HIGHER, true, false, false, 1); // Создаем оратора с отрицательным уровнем уважения
        Event event = new Event("Elections", "Elections 2024", 4, orator);
        assertEquals(8, event.getInfluenceOfOrator(), 0.001);
    }
}
