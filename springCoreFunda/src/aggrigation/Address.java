package aggrigation;

public class Address {
	private String city_name;
	
//	Address(String city_name){
//		this.city_name=city_name;
//	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	@Override
	public String toString() {
		return "Address [city_name=" + city_name + "]";
	}

	
	
//	@Override
//	public String toString() {
//		return "Address [city_name=" + city_name + "]";
//	}
	

}
