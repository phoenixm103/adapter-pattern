package phoenixm103.demoBusiness.adaptee;

import org.springframework.web.client.RestTemplate;
public class CustomerAdaptee {

	public String getSpecificallyHomeTown() {
		System.out.println("Specific HomeTown Info");
		
		
		RestTemplate restTemplate=new RestTemplate();
		String hometown=restTemplate.getForObject("http://localhost:6096/hometown",String.class );
		
		return hometown;
	}
	
}