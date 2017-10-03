import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LeroyTest {

	Leroy leroy;
	int x, y;
	
	@Before
	public void setUp() throws Exception {
		x = 6;
		y = 2;
		leroy = new Leroy();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(8, leroy.add(6, 2));
	}

}
