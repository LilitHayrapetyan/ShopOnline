import enums.ShippingType;

public class ShippingAddress {

	ShippingType shiptype;
	String country;
	String street;
	String home;
	int apt;
	public ShippingType getShiptype() {
		return shiptype;
	}
	public void setShiptype(ShippingType shiptype) {
		this.shiptype = shiptype;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
	}
	public ShippingAddress(ShippingType shiptype, String country, String street, String home, int apt) {
		super();
		this.shiptype = shiptype;
		this.country = country;
		this.street = street;
		this.home = home;
		this.apt = apt;
	}
	public ShippingAddress(String country) {
		super();
		this.country = country;
	}
}
