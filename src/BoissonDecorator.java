public abstract class BoissonDecorator extends Boisson {

          protected  Boisson b;

          public BoissonDecorator (final  Boisson b){
           this.b= b;
          }

          public  float cout(){
              return (float)0.1;
          };

    @Override
    public String description() {
        return ("Boisson");
    }
}

