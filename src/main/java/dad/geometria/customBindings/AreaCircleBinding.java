package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class AreaCircleBinding extends DoubleBinding {
	
	private DoubleExpression radio;
	
	
	

	public AreaCircleBinding(DoubleExpression radio) {
		super();
		this.radio = radio;
		bind(radio);
	}




	@Override
	protected double computeValue() {
		
		return (double)Math.round((Math.PI*(radio.get()*radio.get()))*100.0)/100.0;
	}

}
