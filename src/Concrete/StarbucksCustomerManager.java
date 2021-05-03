package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Veritaban�na kaydedildi : "+ customer.getFirstName());
		}else {
			System.out.println("Ge�erli bir ki�i de�il");
		}
		
		
		
	}

	
	
	

}
