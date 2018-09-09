// Cookie - This is the process needed to create a cookie from the ground up
import java.util.ArrayList;

abstract public class Cookie {
	String name;
	String dough;
	ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}
	
	public void announce() {
		System.out.println("-- " + name + " ORDERED! --");
	}

	public void prepare() {
		System.out.println("Preparing: " + name);
	}

	public void bake() {
		System.out.println("Baking:    " + name);
	}

	public void cool() {
		System.out.println("Cooling:   " + name);
	}

	public void box() {
		System.out.println("Boxing:    " + name);
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append("Toppings: \n");
		for (String topping : toppings) {
			display.append("- " + topping + "\n");
		}
		return display.toString();
	}
}
