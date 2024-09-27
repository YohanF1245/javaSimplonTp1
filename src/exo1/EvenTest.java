package exo1;

public class EvenTest {
	private int numToTest = 0;

	public int getNumToTest() {
		return numToTest;
	}

	public void setNumToTest(int numToTest) {
		this.numToTest = numToTest;
	}
	
	public String evenOrOdd() {
		if(numToTest %2 == 1) {
			return "impair";
		}else {
			return "pair";
		}
	}
}
