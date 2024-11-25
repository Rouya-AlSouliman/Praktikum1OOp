package factory;

import java.io.IOException;

public class ConcreteCreatorAB  extends Creator{

	@Override
	public Product factoryMethod(String typ) throws IOException {
		
		if(typ.equals("csv")) {
		return new ConcreteProductA();
	}
		else {
			return new ConcreteProductB();
		}
	
	
	}

}
