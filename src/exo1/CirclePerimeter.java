package exo1;

public class CirclePerimeter {

	private float rayon = 0;

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}
	
	public String calculatePerimeter() {
		if(rayon != 0) {
			return (""+2*rayon*Math.PI);
		}else {
			return ("Le rayon n'a pas été indiqué");
		}
	}

}
