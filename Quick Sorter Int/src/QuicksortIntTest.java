import static org.junit.Assert.*;
import org.junit.Test;

public class QuicksortIntTest extends QuicksortInt
	{
	static int [ ] a = {4, 8, 1, 3, 0, 2, 8, 8, 9 ,5, 3};
	static int [ ] sortedA = {0, 1, 2, 3, 3, 4, 5, 8, 8, 8, 9};

	@Test
	public void test()
		{
		assertArrayEquals(sortedA, QuicksortInt.qsort(a));
		}
	}
