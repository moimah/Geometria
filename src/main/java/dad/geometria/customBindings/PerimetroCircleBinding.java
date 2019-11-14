package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PerimetroCircleBinding extends DoubleBinding {
	
	private DoubleExpression radio; 
	
	
	

	public PerimetroCircleBinding(DoubleExpression radio) {
		super();
		this.radio = radio;
		bind(radio);
	}




	@Override
	protected double computeValue() {
		
		return (double)Math.round(((2*Math.PI)*radio.get())*100)/100;
	}

}
