
public class TripleChocolat extends CoupeGlace{
	public static final TripleChocolat SINGLETON = new TripleChocolat();
	public TripleChocolat() {
		super();
        super.parfums.add(Parfum.CHOCOBLANC);
        super.parfums.add(Parfum.CHOCOLAIT);
        super.parfums.add(Parfum.CHOCONOIR);
	}
	public float cout() {
		return 5;
	}
	public String description() {
		return ("Triple chocolat " + super.description());
	}
}
