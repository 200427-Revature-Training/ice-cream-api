package com.revature.models;

public class IceCream {

	private int id;
	private String flavor;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IceCream [id=" + id + ", flavor=" + flavor + ", price=" + price + "]";
	}
	public IceCream(int id, String flavor, double price) {
		super();
		this.id = id;
		this.flavor = flavor;
		this.price = price;
	}
	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
