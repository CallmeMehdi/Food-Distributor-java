import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commande {

	private List<Food> lesCommandes;
	
	public Commande(){
		lesCommandes =new ArrayList<Food>();
	}

	/**
	 * 
	 * @param coupe
	 */
	public void addFood(Food coupe){
		this.lesCommandes.add(coupe);
	}

	/**
	 * 
	 * @param writer
	 */
	
	public void publieFacture(PrintWriter writer){
		
		float total = 0;
		for (Iterator it = this.lesCommandes.iterator(); it.hasNext();) {
		Food food = (Food) it.next();
		System.out.println(food.description()+" + "+food.cout());
		total = total + food.cout();
		}
		System.out.println(" TOTAL : "+total); 
}


}