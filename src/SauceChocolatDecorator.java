public class SauceChocolatDecorator extends CoupeGlaceDecorator {



    public SauceChocolatDecorator(final CoupeGlace pcoupe) {
        super(pcoupe);

    }

    @Override
    public float cout() {
        return coupe.cout()+(float)0.7;
    }

    @Override
    public String description() {
        return (coupe.description()+"et la sauce chocolat");
    }
}
