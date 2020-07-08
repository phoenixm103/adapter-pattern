package phoenixm103.adapterpattern.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import phoenixm103.adapterpattern.adaptee.Adaptee;
import phoenixm103.adapterpattern.target.ITarget;

public class Adapter implements ITarget{
	
	@Autowired
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
	this.adaptee=adaptee;	
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.adaptee.specificrequest();
	}

}
