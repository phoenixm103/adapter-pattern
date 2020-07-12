package phoenixm103.demoBusiness.adaptee;

import org.springframework.web.client.RestTemplate;

import phoenixm103.demoBusiness.ecmessage.ECMessage;

public class Adaptee {
	
	

	public String getSpecificInfoByNid() {
		System.out.println("Specific Info");
		
		
		RestTemplate restTemplate=new RestTemplate();
		ECMessage eCMessage=restTemplate.getForObject("http://localhost:6095/ecmessage",ECMessage.class );
		
		return eCMessage.getMessage();
	}
}
