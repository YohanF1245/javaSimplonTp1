package exo1;

public class AgeTest {
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String majorityTest() {
		if (age >= 18) {
			return "majeur";
		}else {
			return "mineur";
		}
	}
	
}
