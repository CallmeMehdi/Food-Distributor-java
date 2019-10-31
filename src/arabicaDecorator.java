
public class arabicaDecorator extends BoissonDecorator{
	 public arabicaDecorator(final Boisson b) {
	        super(b);

	    }

	    @Override
	    public float cout() {
	        return b.cout()+(float)0.5;
	    }

	    @Override
	    public String description() {
	        return (b.description()+"Arabica");
	    }
}
