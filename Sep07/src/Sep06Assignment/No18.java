package Sep06Assignment;

public class No18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ShopService {
	private static ShopService instance;

	private ShopService() {
	}

	public static ShopService getIntstance() {
		if (instance == null)
			instance = new ShopService();
		return instance;
	}

}