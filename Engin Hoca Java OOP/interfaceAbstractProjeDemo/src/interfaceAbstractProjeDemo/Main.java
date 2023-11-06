package interfaceAbstractProjeDemo;

import java.util.Date;

import interfaceAbstractProjeDemo.Abstract.BaseCustomerManager;
import interfaceAbstractProjeDemo.Concrete.NeroCustomerManager;
import interfaceAbstractProjeDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,

		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer("Kaan", "Kartal", new Date(2000, 31, 8), "14981121074");

		System.out.print("xd");
		
	}

}
