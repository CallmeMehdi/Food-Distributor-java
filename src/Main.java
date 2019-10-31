import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
    	
    	Commande cmd = new Commande();
    	CoupeGlace Triple = new TripleChocolat();
    	CoupeGlace TripleChantilly = new ChantillyDecorator(Triple);
    	/* Un coupe fruites rouges avec sauce chocolat */
    	cmd.addFood(new SauceChocolatDecorator(new FruitsRouges()));
    	/* Un coupe Triple chocolat avec Chantilly */
    	cmd.addFood(TripleChantilly);
    	/* un café arabica */
    	cmd.addFood(new robustaDecorator(new Cafe()));
    	/* chocolat chaud */
    	cmd.addFood(new ChocolatChaud());
    	PrintWriter writer = new PrintWriter(System.out);
    	cmd.publieFacture(writer);
    }
}
