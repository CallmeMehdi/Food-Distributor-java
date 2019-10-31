

public class FruitsRouges extends CoupeGlace {
public static final FruitsRouges SINGLETON = new FruitsRouges();
public FruitsRouges() {
	this.parfums.add(Parfum.FRAISE);
	this.parfums.add(Parfum.FRAMBOISE);
	this.parfums.add(Parfum.CASSIS);
}
	public float cout() {
		return 6;
	}
	public String description() {
		return "Fruits Rouges " + super.description();
	}
}
