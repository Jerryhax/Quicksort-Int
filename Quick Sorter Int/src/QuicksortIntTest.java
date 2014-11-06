import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class QuicksortIntTest extends QuicksortInt
	{
	static int [ ] a = {4, 8, 1, 3, 0, 2, 8, 8, 9 ,5, 3};
	static int [ ] sortedA = {0, 1, 2, 3, 3, 4, 5, 8, 8, 8, 9};

	@Test
	public void test()
		{
		//Method 1: hard-coding
		assertArrayEquals(sortedA, QuicksortInt.qsort(a));
		//Method 2: trusting built-in sorter
		Arrays.sort(a);
		assertArrayEquals(a, QuicksortInt.qsort(a));
		}
	}

