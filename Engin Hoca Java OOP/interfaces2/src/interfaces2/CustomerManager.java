package interfaces2;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		// İş kodları yazılır.
		customerDal.Add();
		
	}
}
