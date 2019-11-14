package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PerimetroTriangleBinding extends DoubleBinding {
	
	private DoubleExpression base;
	private DoubleExpression altura; 
	
	

	public PerimetroTriangleBinding(DoubleExpression base, DoubleExpression altura) {
		super();
		this.base = base;
		this.altura = altura;
		
		bind(this.altura=altura, this.base=base);
	}




	protected double computeValue() {	
				
		return (double)Math.round((base.get() + (2* (Math.sqrt(((base.get()*base.get()) + (altura.get()*altura.get()))))))*100)/100;
	}

}
