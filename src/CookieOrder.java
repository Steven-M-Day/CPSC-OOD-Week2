// Cookie Order - The order for the cookies and the desired toppings
public class CookieOrder {

	public static void main(String[] args) {
		CookieFactory factory = new CookieFactory();
		CookieStore store = new CookieStore(factory);

		Cookie cookie = store.orderCookie("Sugar");
		System.out.println("");
		System.out.println(cookie);
 
		cookie = store.orderCookie("Peanut Butter");
		System.out.println("");
		System.out.println(cookie);
		
		cookie = store.orderCookie("Chocolate Chip");
		System.out.println("");
		System.out.println(cookie);
		
		cookie = store.orderCookie("Ginger Snap");
		System.out.println("");
		System.out.println(cookie);
	}
}
