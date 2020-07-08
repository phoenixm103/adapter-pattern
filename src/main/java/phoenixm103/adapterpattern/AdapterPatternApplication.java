package phoenixm103.adapterpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import phoenixm103.adapterpattern.adaptee.Adaptee;
import phoenixm103.adapterpattern.adapter.Adapter;
import phoenixm103.adapterpattern.target.ITarget;
@SpringBootApplication
public class AdapterPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterPatternApplication.class, args);
		
		ITarget target=new Adapter(new Adaptee());
		target.request();
	}

}
