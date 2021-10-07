package Sep07Assignment;

public class Stock {

	static final String stockInfo = "CODE";
	static int seq = 0;
	private String name;
	private String no;
	private int qty;

	{
		seq++;
		no = stockInfo + "-" + String.format("%03d", seq);
	}

	public Stock(String name, int qty) {
		this.name = name;
		this.qty = qty;

		// seq++;
		// no = name + "-" + String.format("%03d", seq);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return ("Stock Name: " + name + "\nStock Number: " + no + "\nStock Quantity: " + qty);

	}

}
