package aggrigation;

public class Test {
	public static void main(String[] args) {
//		Address address=new Address("jaipur");
//		Emp emp= new Emp(111, "Avinash",address);
//		System.out.println(emp);
//		Address address=new Address();
//		address.setCity_name("japur");
		Emp emp= new Emp();
		emp.setEmp_id(111);
		emp.setEmp_name("Avinash");
		//emp.setAddress(address);
		System.out.println(emp.getEmp_id());
		System.out.println(emp.getEmp_name());
		System.out.println(emp.getAddress());
		
		
	}

}
