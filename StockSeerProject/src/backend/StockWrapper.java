package backend;

public class StockWrapper extends Object {
	private int volume;
	private double price;
	private String initial;
	private String fullname;

	////////////////////////////////////////////////////////////
	// Getter - Setter
	////////////////////////////////////////////////////////////
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/////////////////////////////////////////////////////////
	// Constructor
	/////////////////////////////////////////////////////////
	public StockWrapper() {
		volume = -1;
		price = -1;
		initial = "NULL";
		fullname = "Null";
		System.out.println("Empty Stock Wrapper created");
	}

	public StockWrapper(String initial, String fullname) {
		this.initial = initial;
		this.fullname = fullname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((initial == null) ? 0 : initial.hashCode());
		return result;
	}

	/**
	 * compare 2 stocks based on initial AND fullname
	 * 
	 * @param obj
	 *            stockWrapper object
	 * @return true if two stocks have same initials and fullnames
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockWrapper other = (StockWrapper) obj;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (initial == null) {
			if (other.initial != null)
				return false;
		} else if (!initial.equals(other.initial))
			return false;
		return true;
	}

}
