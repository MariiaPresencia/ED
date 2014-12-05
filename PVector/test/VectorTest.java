import static org.junit.Assert.*;

import org.junit.Test;


public class VectorTest {

	@Test
	public void testMin(){
//		int [] v= new int[]{7,8,9,10,5,2,12};
//		int menor= Vector.min(v);
//		assertEquals(2,menor);
		assertEquals(2,Vector.min(new int[]{7,8,9,10,5,2,12}));
		assertEquals(5, Vector.min(new int[]{7,8,9,10,5,12,12}));
		assertEquals(7, Vector.min(new int[]{7,8,9,10,15,12,12}));
		}

	@Test
	public void testIndexOf(){
		int[] v = new int[]{12,13,15,7,24,52};
//		int value = 12;
		assertEquals(0,Vector.indexOf(v, 12));
		assertEquals(3, Vector.indexOf(v, 7));
		assertEquals(1, Vector.indexOf(v, 13));
		assertEquals(-1, Vector.indexOf(v, 100));
		
	}
}
