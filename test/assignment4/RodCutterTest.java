package assignment4;

import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public class RodCutterTest extends TestCase {

    private RodCutter rodCutter;
    private List<Integer> prices = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 9, 9, 10);

    protected RodCutter createRodCutter() {
        return new RodCutter();
    }

    protected void setUp() {
        rodCutter = createRodCutter();
    }

    public void testCanary() {
        assertTrue(true);
    }

    public void testPriceAndCutsForLength0() {
        assertEquals(Arrays.asList(0), rodCutter.cutRod(0, prices));
    }

    public void testPriceAndCutsForLength1() {
        assertEquals(Arrays.asList(1, 1), rodCutter.cutRod(1, prices));
    }

    public void testPriceAndCutsForLength2() {
        assertEquals(Arrays.asList(2, 1, 1), rodCutter.cutRod(2, prices));
    }

    public void testPriceAndCutsForLength4() {
        assertEquals(Arrays.asList(4, 1, 1, 1, 1), rodCutter.cutRod(4, prices));
    }

    public void testPriceAndCutsForLength7() {
        assertEquals(Arrays.asList(7, 1, 1, 1, 1, 1, 1, 1), rodCutter.cutRod(7, prices));
    }

    public void testPriceAndCutsForLength11() {
        assertEquals(Arrays.asList(12, 1, 1, 1, 8), rodCutter.cutRod(11, prices));
    }

    public void testPriceAndCutsForLength16() {
        assertEquals(Arrays.asList(18, 8, 8), rodCutter.cutRod(16, prices));
    }
}