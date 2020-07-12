package phoenixm103.demoBusiness.adaptee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import phoenixm103.demoBusiness.ecmessage.ECMessage;
import phoenixm103.demoBusiness.sender.RabbitMQSender;

public class RabbitMQAdaptee {
	
	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	public String getSpecificInfoByNid() {
		System.out.println("Specific Info");
		
		
		RestTemplate restTemplate=new RestTemplate();
		ECMessage eCMessage=restTemplate.getForObject("http://localhost:6095/ecmessage",ECMessage.class );
		
		return eCMessage.getMessage();
	}

	public void publishSpecificMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
		rabbitMQSender.send(message);
	}
}
