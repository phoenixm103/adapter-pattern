package phoenixm103.demoBusiness.adaptee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import phoenixm103.demoBusiness.sender.RabbitMQSender;

public class CustomerAdaptee {

	@Autowired
	private RabbitMQSender rabbitMQSender;
	
	public String getSpecificallyHomeTown() {
		System.out.println("Specific HomeTown Info");
		RestTemplate restTemplate=new RestTemplate();
		String hometown=restTemplate.getForObject("http://localhost:6096/hometown",String.class );
		return hometown;
	}
	
	public void sendMessageThroughRabbitMQ(String message) {
		System.out.println("Working");
		rabbitMQSender.send(message);
	}
}