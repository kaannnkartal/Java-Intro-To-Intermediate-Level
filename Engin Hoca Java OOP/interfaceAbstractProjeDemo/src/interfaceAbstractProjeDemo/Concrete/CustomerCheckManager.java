package interfaceAbstractProjeDemo.Concrete;

import interfaceAbstractProjeDemo.Abstract.ICustomerCheckService;
import interfaceAbstractProjeDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;

	}

}
