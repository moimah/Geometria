package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PerimetroRectangleBinding extends DoubleBinding {

	private DoubleExpression base; 
	private DoubleExpression altura;
	
	

	public PerimetroRectangleBinding(DoubleExpression base, DoubleExpression altura) {
		super();
		this.base = base;
		this.altura = altura;
		
		bind(this.base = base, this.altura=altura);
	}



	protected double computeValue() {		
		return (double)Math.round(((base.get()*2)+(altura.get()*2))*100)/100;
	}

}
