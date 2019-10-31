public class ChantillyDecorator extends CoupeGlaceDecorator {



    public ChantillyDecorator(final CoupeGlace pcoupe) {
        super(pcoupe);

    }

    @Override
    public float cout() {
        return coupe.cout()+(float)0.5;
    }

    @Override
    public String description() {
        return (coupe.description()+"chantilly");
    }
}
