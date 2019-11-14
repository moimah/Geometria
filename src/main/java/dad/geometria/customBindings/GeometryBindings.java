package dad.geometria.customBindings;

import javafx.beans.binding.DoubleExpression;

public class GeometryBindings {
	
	//AREAS
	
	public static AreaRectangleBinding  areaRectangle(DoubleExpression x, DoubleExpression w) {
		return new AreaRectangleBinding(x, w);
	}
	
	public static AreaTriangleBinding  areaTriangle(DoubleExpression x, DoubleExpression w) {
		return new AreaTriangleBinding(x, w);
	}
	
	public static AreaCircleBinding  areaCircle(DoubleExpression x) {
		return new AreaCircleBinding(x);
	}
	
	public static AreaHexagonBinding  areaHexagon(DoubleExpression x) {
		return new AreaHexagonBinding(x);
	}
	
	//PERIMETROS
	
	public static PerimetroRectangleBinding  perimetroRectangle(DoubleExpression x, DoubleExpression w) {
		return new PerimetroRectangleBinding(x, w);
	}
	
	public static PerimetroTriangleBinding  perimetroTriangle(DoubleExpression x, DoubleExpression w) {
		return new PerimetroTriangleBinding(x, w);
	}
	
	public static PerimetroCircleBinding  perimetroCircle(DoubleExpression x) {
		return new PerimetroCircleBinding(x);
	}
	
	public static PerimetroHexagonBinding  perimetroHexagon(DoubleExpression x) {
		return new PerimetroHexagonBinding(x);
	}
	
	
	
	
	
	
	
	

	
	
}
