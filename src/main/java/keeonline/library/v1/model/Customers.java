package keeonline.library.v1.model;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	private static Customers instance;

	private List<Customer> customers;

	private Customers() {
		super();
		customers = new ArrayList<>();
	}
	
	public static synchronized Customers getInstance() {
		if (instance == null) {
			instance = new Customers();
		}
		return instance;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public synchronized Customer add(Customer c) {
		//TODO: validate customer
		Customer added = new Customer(c.getFirstName(),c.getLastName(),c.getDob().toString(),c.getHouseNumber(),c.getPostCode());
		customers.add(added);
		return added;
	}

	public Customer deleteById(int id) {
		for (Customer p : customers) {
			if (p.getCustomerId() == id) {
				customers.remove(p);
				return p;
			}
		}
		return null;
	}
}
