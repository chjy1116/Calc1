import static org.junit.Assert.*;

import org.junit.Test;

public class testCalc1 {
@Test
public void testaddfunc() {
	Calc1 calc = new Calc1();
	calc.addfunc(10, 20);
	assertEquals(30, calc.getResult());
}
}
