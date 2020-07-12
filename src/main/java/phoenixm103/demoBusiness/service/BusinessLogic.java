package phoenixm103.demoBusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import phoenixm103.demoBusiness.adaptee.ECAdaptee;
import phoenixm103.demoBusiness.adaptee.CustomerAdaptee;
import phoenixm103.demoBusiness.adapter.ECAdapter;
import phoenixm103.demoBusiness.adapter.CustomerAdapter;
import phoenixm103.demoBusiness.target.CustomerTarget;
import phoenixm103.demoBusiness.target.ECTarget;
@Service
public class BusinessLogic {
	


	ECTarget target; // ITarget:Adapter--Adptee
	
	CustomerTarget customerTarget; // CustomerTarget:CustomerAdapter--CustomerAdptee
	
	public String getInfoByNid() {
		target=new ECAdapter(new ECAdaptee());
		return target.getInfoByNid();
		
		
	}

	public String getHomeTown() {
		customerTarget=new CustomerAdapter(new CustomerAdaptee());
		return customerTarget.getHomeTown();
	}
	
	
	
}
