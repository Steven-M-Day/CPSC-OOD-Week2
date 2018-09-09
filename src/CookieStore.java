// Cookie Store - Where the order for the cookies are organized and sent to factory
public class CookieStore {

	CookieFactory factory;
	 
	public CookieStore(CookieFactory factory) { 
		this.factory = factory;
	}
 
	public Cookie orderCookie(String type) {
		Cookie cookie;
 
		cookie = factory.bakeCookie(type);
 
		cookie.announce();
		cookie.prepare();
		cookie.bake();
		cookie.cool();
		cookie.box();

		return cookie;
	}
}
