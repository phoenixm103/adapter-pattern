package phoenixm103.demoBusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import phoenixm103.demoBusiness.adaptee.Adaptee;
import phoenixm103.demoBusiness.adapter.Adapter;
import phoenixm103.demoBusiness.target.ITarget;
@Service
public class BusinessLogic {
	
	//@Autowired
	//Adapter adapter;

	ITarget target;
	
	public String getInfoByNid() {
		target=new Adapter(new Adaptee());
		
		return target.getInfoByNid();
		//adapter.getInfoByNid();
	
		
	}
	
	
	
}
