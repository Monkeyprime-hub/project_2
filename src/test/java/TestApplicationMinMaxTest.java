import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestApplicationMinMaxTest {

    private static TestApplicationMinMax testApplicationMinMaxInstance;

    @Before
    public  void before() {
        System.out.println("Before running...");
        testApplicationMinMaxInstance = new TestApplicationMinMax();
    }
    @Test
    public void maxTest() {
        int[] values = {1,2,3,4,5,6,7};
        int result = testApplicationMinMaxInstance.getMax(values);
        Assert.assertEquals(7, result);
        System.out.println(result);
    }

    @Test
    public void minTest() {
        int[] values = {1,2,3,4,5,6,7};
        int result = testApplicationMinMaxInstance.getMin(values);
        Assert.assertEquals(1, result);
        System.out.println(result);
    }
}