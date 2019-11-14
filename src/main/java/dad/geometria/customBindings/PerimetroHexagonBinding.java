package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class PerimetroHexagonBinding extends DoubleBinding {

	private DoubleExpression lado; 
	
	
	
	
	public PerimetroHexagonBinding(DoubleExpression lado) {
		super();
		this.lado = lado;
		bind(lado);
	}




	@Override
	protected double computeValue() {		
		return (double)Math.round((lado.get() * 6)*100)/100;		
	}

}
