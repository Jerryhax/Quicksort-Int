import static org.junit.Assert.*;
import org.junit.Test;

public class QuicksortIntTest extends QuicksortInt
	{
	static int a[] = {4, 8, 1, 3, 0, 2, 8, 8, 9 ,5, 3};

	@Test
	public void test()
		{
		QuicksortInt.qsort(a);

		}

	}
