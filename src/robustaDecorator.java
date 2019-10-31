
public class robustaDecorator extends BoissonDecorator{
	 public robustaDecorator(final Boisson b) {
	        super(b);

	    }

	    @Override
	    public float cout() {
	        return b.cout()+(float)0.8;
	    }

	    @Override
	    public String description() {
	        return (b.description()+"Robusta");
	    }
}
