package java_4;


public class CucurbitaceaeVegetable extends Vegetable{

	public CucurbitaceaeVegetable(String name, double calories) {
		super(name, calories);
		setCategory("Cucurbitaceae vegetables");
	}
	
	public CucurbitaceaeVegetable(String name, double calories, double weight) {
		super(name, calories, weight);
		setCategory("Cucurbitaceae vegetables");
	}
}
