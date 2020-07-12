package phoenixm103.demoBusiness.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.demoBusiness.adaptee.Adaptee;
import phoenixm103.demoBusiness.target.ITarget;

public class Adapter implements ITarget{
	
	@Autowired
	private Adaptee adaptee;
	

	
	
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;	
	}

	@Override
	public String getInfoByNid() {
		// TODO Auto-generated method stub
		return adaptee.getSpecificInfoByNid();
		
	}

	@Override
	public void getInfoByMobile() {
		// TODO Auto-generated method stub
		
	}

}
