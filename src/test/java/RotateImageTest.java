import junit.framework.TestCase;

import java.util.Arrays;

public class RotateImageTest extends TestCase {

    public void testExample1() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Main.Solution.rotate(matrix);
        int[][] expectedPrices = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        assertEquals(Arrays.deepToString(expectedPrices), Arrays.deepToString(matrix));
    }
}
