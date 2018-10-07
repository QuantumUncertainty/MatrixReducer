package matrixreducer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixAlgorithmsTest {
    
    public MatrixAlgorithmsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toReducedRowEchelonForm method, of class MatrixTests.
     */
    @Test
    public void testToReducedRowEchelonForm() {
        double[][] expected = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        double[][] actual = MatrixAlgorithms.toReducedRowEchelonFormTest1();
        Assert.assertArrayEquals(expected, actual);
    }
    
}
