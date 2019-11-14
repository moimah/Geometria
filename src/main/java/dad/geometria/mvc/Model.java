package dad.geometria.mvc;

import dad.geometria.customBindings.GeometryBindings;
import dad.geometria.customBindings.AreaHexagonBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Model {

	// PROPERTIES RECTANGULO
	
	private DoubleProperty db_prop_base_rectangulo = new SimpleDoubleProperty();
	private DoubleProperty db_prop_altura_rectangulo = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper read_area_rectangulo = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper read_perimetro_rectangulo = new ReadOnlyDoubleWrapper();

	// PROPERTIES CIRCULO	
	
	private DoubleProperty db_prop_radio_circulo = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper read_area_circulo = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper read_perimetro_circulo = new ReadOnlyDoubleWrapper();

	// PROPERTIES TRIANGULO	
	
	private DoubleProperty db_prop_base_triangulo = new SimpleDoubleProperty();
	private DoubleProperty db_prop_altura_triangulo = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper read_area_triangulo = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper read_perimetro_triangulo = new ReadOnlyDoubleWrapper();


	// PROPERTIES HEXAGONO
	
	private DoubleProperty db_prop_radio_hexagono = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper read_area_hexagono = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper read_perimetro_hexagono = new ReadOnlyDoubleWrapper();	
	

	//CONSTRUCTOR IMPLEMENTA LAS OPERACIONES DE AREAS  Y PERIMETRO DE CADA FIGURA GEOMETRICA
	//USA LA BINDINGS PERSONALIZADOS DE CALCULO DE FIGURAS GEOMETRICAS

	public Model() {
	
		
		//AREA DE RECTANGULO
		read_area_rectangulo.bind(GeometryBindings.areaRectangle(db_prop_base_rectangulo, db_prop_altura_rectangulo));
		//PERIMETRO DE RECTANGULO
		read_perimetro_rectangulo.bind(GeometryBindings.perimetroRectangle(db_prop_base_rectangulo, db_prop_altura_rectangulo));	
		
		//AREA DE CIRCULO
		read_area_circulo.bind(GeometryBindings.areaCircle(db_prop_radio_circulo));
		//PERIMETRO DE CIRCULO
		read_perimetro_circulo.bind(GeometryBindings.perimetroCircle(db_prop_radio_circulo));
		
		//AREA DE TRIANGULO
		read_area_triangulo.bind(GeometryBindings.areaTriangle(db_prop_base_triangulo, db_prop_altura_triangulo));
		//PERIMETRO DE TRIANGULO
		read_perimetro_triangulo.bind(GeometryBindings.perimetroTriangle(db_prop_base_triangulo, db_prop_altura_triangulo));
		
		// AREA DEL HEXAGONO
		read_area_hexagono.bind(GeometryBindings.areaHexagon(db_prop_radio_hexagono));
		//PERIMETRO DE HEXAGONO
		read_perimetro_hexagono.bind(GeometryBindings.perimetroHexagon(db_prop_radio_hexagono));
				

	}


	public final DoubleProperty db_prop_base_rectanguloProperty() {
		return this.db_prop_base_rectangulo;
	}
	


	public final double getDb_prop_base_rectangulo() {
		return this.db_prop_base_rectanguloProperty().get();
	}
	


	public final void setDb_prop_base_rectangulo(final double db_prop_base_rectangulo) {
		this.db_prop_base_rectanguloProperty().set(db_prop_base_rectangulo);
	}
	


	public final DoubleProperty db_prop_altura_rectanguloProperty() {
		return this.db_prop_altura_rectangulo;
	}
	


	public final double getDb_prop_altura_rectangulo() {
		return this.db_prop_altura_rectanguloProperty().get();
	}
	


	public final void setDb_prop_altura_rectangulo(final double db_prop_altura_rectangulo) {
		this.db_prop_altura_rectanguloProperty().set(db_prop_altura_rectangulo);
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_area_rectanguloProperty() {
		return this.read_area_rectangulo.getReadOnlyProperty();
	}
	


	public final double getRead_area_rectangulo() {
		return this.read_area_rectanguloProperty().get();
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_perimetro_rectanguloProperty() {
		return this.read_perimetro_rectangulo.getReadOnlyProperty();
	}
	


	public final double getRead_perimetro_rectangulo() {
		return this.read_perimetro_rectanguloProperty().get();
	}
	


	public final DoubleProperty db_prop_radio_circuloProperty() {
		return this.db_prop_radio_circulo;
	}
	


	public final double getDb_prop_radio_circulo() {
		return this.db_prop_radio_circuloProperty().get();
	}
	


	public final void setDb_prop_radio_circulo(final double db_prop_radio_circulo) {
		this.db_prop_radio_circuloProperty().set(db_prop_radio_circulo);
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_area_circuloProperty() {
		return this.read_area_circulo.getReadOnlyProperty();
	}
	


	public final double getRead_area_circulo() {
		return this.read_area_circuloProperty().get();
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_perimetro_circuloProperty() {
		return this.read_perimetro_circulo.getReadOnlyProperty();
	}
	


	public final double getRead_perimetro_circulo() {
		return this.read_perimetro_circuloProperty().get();
	}
	


	public final DoubleProperty db_prop_base_trianguloProperty() {
		return this.db_prop_base_triangulo;
	}
	


	public final double getDb_prop_base_triangulo() {
		return this.db_prop_base_trianguloProperty().get();
	}
	


	public final void setDb_prop_base_triangulo(final double db_prop_base_triangulo) {
		this.db_prop_base_trianguloProperty().set(db_prop_base_triangulo);
	}
	


	public final DoubleProperty db_prop_altura_trianguloProperty() {
		return this.db_prop_altura_triangulo;
	}
	


	public final double getDb_prop_altura_triangulo() {
		return this.db_prop_altura_trianguloProperty().get();
	}
	


	public final void setDb_prop_altura_triangulo(final double db_prop_altura_triangulo) {
		this.db_prop_altura_trianguloProperty().set(db_prop_altura_triangulo);
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_area_trianguloProperty() {
		return this.read_area_triangulo.getReadOnlyProperty();
	}
	


	public final double getRead_area_triangulo() {
		return this.read_area_trianguloProperty().get();
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_perimetro_trianguloProperty() {
		return this.read_perimetro_triangulo.getReadOnlyProperty();
	}
	


	public final double getRead_perimetro_triangulo() {
		return this.read_perimetro_trianguloProperty().get();
	}
	


	public final DoubleProperty db_prop_radio_hexagonoProperty() {
		return this.db_prop_radio_hexagono;
	}
	


	public final double getDb_prop_radio_hexagono() {
		return this.db_prop_radio_hexagonoProperty().get();
	}
	


	public final void setDb_prop_radio_hexagono(final double db_prop_radio_hexagono) {
		this.db_prop_radio_hexagonoProperty().set(db_prop_radio_hexagono);
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_area_hexagonoProperty() {
		return this.read_area_hexagono.getReadOnlyProperty();
	}
	


	public final double getRead_area_hexagono() {
		return this.read_area_hexagonoProperty().get();
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty read_perimetro_hexagonoProperty() {
		return this.read_perimetro_hexagono.getReadOnlyProperty();
	}
	


	public final double getRead_perimetro_hexagono() {
		return this.read_perimetro_hexagonoProperty().get();
	}
	


	

	
}