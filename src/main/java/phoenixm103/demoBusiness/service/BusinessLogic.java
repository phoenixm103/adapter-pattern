package phoenixm103.demoBusiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import phoenixm103.demoBusiness.adaptee.ECAdaptee;
import phoenixm103.demoBusiness.adaptee.RabbitMQAdaptee;
import phoenixm103.demoBusiness.adaptee.CustomerAdaptee;
import phoenixm103.demoBusiness.adapter.ECAdapter;
import phoenixm103.demoBusiness.adapter.RabbitMQAdapter;
import phoenixm103.demoBusiness.adapter.CustomerAdapter;
import phoenixm103.demoBusiness.target.CustomerTarget;
import phoenixm103.demoBusiness.target.ECTarget;
import phoenixm103.demoBusiness.target.RabbitMQTarget;
@Service
public class BusinessLogic {
	

	RabbitMQTarget rabbitmqTarget;
	
	ECTarget target; // ECTarget:ECAdapter--ECAdptee
	
	CustomerTarget customerTarget; // CustomerTarget:CustomerAdapter--CustomerAdptee
	
	public String getInfoByNid() {
		target=new ECAdapter(new ECAdaptee());
		return target.getInfoByNid();
		
		
	}

	public String getHomeTown() {
		customerTarget=new CustomerAdapter(new CustomerAdaptee());
		return customerTarget.getHomeTown();
	}

	public void publishMessage(String message) {
		rabbitmqTarget=new RabbitMQAdapter(new RabbitMQAdaptee());
		rabbitmqTarget.publishMessage(message);
	}
	
	
	
}
