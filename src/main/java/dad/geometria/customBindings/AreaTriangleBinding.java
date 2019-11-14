package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class AreaTriangleBinding extends DoubleBinding {
	
	private DoubleExpression base;
	private DoubleExpression altura;
	
	
	
	

	public AreaTriangleBinding(DoubleExpression base, DoubleExpression altura) {
		super();
		this.base = base;
		this.altura = altura;
		
		bind(this.base = base, this.altura = altura);
	}





	@Override
	protected double computeValue() {
		
		return (double)Math.round(((base.get()*altura.get())/2)*100.0)/100.0;
	}

}
