package phoenixm103.demoBusiness.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.demoBusiness.adaptee.CustomerAdaptee;
import phoenixm103.demoBusiness.target.CustomerTarget;

public class CustomerAdapter implements CustomerTarget {
	
	
	@Autowired
	private CustomerAdaptee customerAdaptee;
	
	
	
	@Override
	public String getHomeTown() {
		
		return customerAdaptee.getSpecificallyHomeTown();
	}



	public CustomerAdapter(CustomerAdaptee customerAdaptee) {
		super();
		this.customerAdaptee = customerAdaptee;
	}

}
