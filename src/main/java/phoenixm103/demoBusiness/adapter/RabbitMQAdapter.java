package phoenixm103.demoBusiness.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.demoBusiness.adaptee.RabbitMQAdaptee;
import phoenixm103.demoBusiness.target.RabbitMQTarget;

public class RabbitMQAdapter implements RabbitMQTarget {
	
	@Autowired
	private RabbitMQAdaptee rabbitMQAdaptee;

	public RabbitMQAdapter(RabbitMQAdaptee rabbitMQAdaptee) {
		super();
		this.rabbitMQAdaptee = rabbitMQAdaptee;
	}

	@Override
	public void publishMessage(String message) {
		// TODO Auto-generated method stub
		rabbitMQAdaptee.publishSpecificMessage(message);
	}
}
