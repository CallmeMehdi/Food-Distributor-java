public class CoullisFraiseDecorator extends CoupeGlaceDecorator {



    public CoullisFraiseDecorator(final CoupeGlace pcoupe) {
        super(pcoupe);

    }

    @Override
    public float cout() {
        return coupe.cout()+(float)1 ;
    }

    @Override
    public String description() {
        return coupe.description()+"au colis de de fraises fraiches" ;
    }
}