package third;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    @DisplayName("Check education 1")
    public void testEduPoints_SchoolEducation() {
        Person person = new Person("Alice", 25, Education.SCHOOL_EDUCATION);
        assertEquals(1.0, person.eduPoints());
    }

    @Test
    @DisplayName("Check education 2")
    public void testEduPoints_CollegeEducation() {
        Person person = new Person("Bob", 30, Education.COLLEGE);
        assertEquals(1.5, person.eduPoints());
    }

    @Test
    @DisplayName("Check education 3")
    public void testEduPoints_IncompleteHigherEducation() {
        Person person = new Person("Charlie", 35, Education.INCOMPLETE_HIGHER);
        assertEquals(1.8, person.eduPoints());
    }

    @Test
    @DisplayName("Check education 4")
    public void testEduPoints_HigherEducation() {
        Person person = new Person("David", 40, Education.HIGHER);
        assertEquals(2.0, person.eduPoints());
    }

}
