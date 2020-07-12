package phoenixm103.demoBusiness.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.demoBusiness.adaptee.ECAdaptee;
import phoenixm103.demoBusiness.target.ECTarget;

public class ECAdapter implements ECTarget{
	
	@Autowired
	private ECAdaptee adaptee;
	

	
	
	public ECAdapter(ECAdaptee adaptee) {
		this.adaptee=adaptee;	
	}

	@Override
	public String getInfoByNid() {
		// TODO Auto-generated method stub
	
		return adaptee.getSpecificInfoByNid();
		
	}



}
