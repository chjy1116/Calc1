import static org.junit.Assert.*;

import org.junit.Test;

public class testCalc1 {
@Test
public void testaddfunc() {
	Calc1 calc = new Calc1();
	calc.addfunc(10, 20);
	assertEquals(30, calc.getResult());
}

@Test
public void testsubfunc() {
	Calc1 calc = new Calc1();
	calc.subfunc(20, 10);
	assertEquals(10, calc.getResult());
}

@Test
public void testmulfunc() {
	Calc1 calc = new Calc1();
	calc.mulfunc(10, 20);
	assertEquals(200, calc.getResult());
}

}
