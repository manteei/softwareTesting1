package second;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {
    static DepthFirstSearch depthFirstSearch;
    @ParameterizedTest
    @CsvFileSource(resources = "/search.csv", numLinesToSkip = 1)
     void decomposeToSeriesTest(int n, String comp, int start, String expected) {
        depthFirstSearch = new DepthFirstSearch(n);
        assertEquals(expected, depthFirstSearch.calculate(n, comp, start));
    }
}
