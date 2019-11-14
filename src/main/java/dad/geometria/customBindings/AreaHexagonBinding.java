package dad.geometria.customBindings;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class AreaHexagonBinding extends DoubleBinding {
	
	private DoubleExpression lado;
	
	
	

	public AreaHexagonBinding(DoubleExpression lado) {
		
		super();
		this.lado = lado;
		bind(this.lado = lado);
	}




	@Override
	protected double computeValue() {			
		return (double)Math.round((((lado.get()*(Math.sqrt(lado.get()*lado.get() - ((lado.get()*lado.get()) / 4))))/2)*6)*100.0)/100.0;
	}

}
