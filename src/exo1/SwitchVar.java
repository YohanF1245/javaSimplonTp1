package exo1;

public class SwitchVar {
	int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void switchValues() {
		int temp = a;
		a = b;
		b = temp;
	}
}
