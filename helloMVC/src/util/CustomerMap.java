package util;

import java.util.HashMap;
import java.util.Map;

import beans.Customer;

public class CustomerMap {
	private Map<String, Customer> customers;

	public CustomerMap() {
		customers = new HashMap<String, Customer>();

		addCustomer(new Customer("id001", "1234", "Alice", "alice@gmail.com"));
		addCustomer(new Customer("id002", "1234", "Bob", "bob@gmail.com"));
		addCustomer(new Customer("id003", "1234", "Charlie", "charlie@gmail.com"));
		addCustomer(new Customer("id004", "1234", "David", "david@gmail.com"));
		addCustomer(new Customer("id005", "1234", "Shanon", "shanon@gmail.com"));
		addCustomer(new Customer("id006", "1234", "Trudy", "trudy@gmail.com"));
		addCustomer(new Customer("id007", "1234", "June", "june@gmail.com"));
	}

	private void addCustomer(Customer customer) {
		// id를 키값으로
		customers.put(customer.getId(), customer);
	}

	public int checkCustomer(Customer c, String pw) {
		if (c != null) {
			if (pw.equals(customers.get(c.getId()).getPw())) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	public Customer findCustomer(String id) {
		if (id != null) {
			return customers.get(id.toLowerCase());
		} else {
			return null;
		}
	}

}
