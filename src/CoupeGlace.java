import java.util.List;
import java.util.*;

public abstract class CoupeGlace implements Food{
		protected List<Parfum> parfums= new ArrayList<Parfum>();
		protected CoupeGlace() {}
		public String description() {
			StringBuffer sb = new StringBuffer("");
			for(Iterator it = parfums.iterator();it.hasNext();) {
			sb.append(it.next().toString());
			sb.append(" ");
		}
			
		return sb.toString();
		}
		public abstract float cout();

}
