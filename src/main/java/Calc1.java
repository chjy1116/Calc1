
public class Calc1 {
	private int result = 0;

	public void addfunc(int x, int y) {
		result = x + y;
	}
	
	public void subfunc(int x, int y) {
		result = x - y;
	}
	
	public void mulfunc(int x, int y) {
		x++;
		result = x * y;
	}

	public void divfunc(int x, int y) {
		result = x/ y;
	}
	
	public int getResult() {
		return result;
	}
}
