package java_4;

public class Potato extends NightshadeVegetable{
	
	/**
	 * Default constructor.
	 */
	public Potato() {
		super("Potato", 77);
	}
	
	/**
	 * Constructor with parameters. Creates a Potato of a given weight.
	 * @param weight the mass of the vegetable that will be created
	 */
	public Potato(double weight) {
		super("Potato", 77, weight);
	}
}
