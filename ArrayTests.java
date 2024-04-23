import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test
  public void testReverseInPlace2()
  {
    int[] input = { 3,3,3,4,4,4 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 4,4,4,3,3,3 }, input);
  }
  @Test 
  public void testReversedWorking()
  {
    int[] input = { 1,2,3,4,5};
    assertArrayEquals(new int[]{ 5,4,3,2,1}, ArrayExamples.reversed(input));
  }
  @Test 
  public void testReversedNewArray()
  {
    int[] input = { 1,2,3,4,5};
    assertNotSame(input, ArrayExamples.reversed(input));
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
