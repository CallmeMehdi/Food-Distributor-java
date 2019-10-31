public abstract class CoupeGlaceDecorator extends CoupeGlace {

          protected  CoupeGlace coupe;

          public CoupeGlaceDecorator (final  CoupeGlace pcoupe){
           coupe = pcoupe;
          }

          public  float cout(){
              return (float)0.1;
          };

    @Override
    public String description() {
        return super.description();
    }
}

