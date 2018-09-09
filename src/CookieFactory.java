// Cookie Factory - Where new cookies are identified and made
public class CookieFactory {
	
	public Cookie bakeCookie (String type) {
		
		Cookie cookie = null;
		
		if (type.equals("Sugar")) {
			cookie = new SugarCookie();
			
		} else if (type.equals("Chocolate Chip")) {
			cookie = new ChocolateChipCookie();
			
		} else if (type.equals("Peanut Butter")) {
			cookie = new PeanutButterCookie();
			
		} else if (type.equals("Ginger Snap")) {
			cookie = new GingerSnapCookie();
			
		}
		return cookie;
	}
}
