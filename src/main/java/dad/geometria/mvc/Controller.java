package dad.geometria.mvc;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.InputMethodEvent;
import javafx.util.converter.NumberStringConverter;

public class Controller {

	Model model = new Model();
	View view = new View();

	public Controller() {
		
		
		
		//BINDINGS Y LISTENERS DE: RECTANGULO	
		
		//Bindings			
		
		Bindings.bindBidirectional(view.getTxt_altura_rectangulo().textProperty(), model.db_prop_altura_rectanguloProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getTxt_base_rectangulo().textProperty(), model.db_prop_base_rectanguloProperty(), new NumberStringConverter());
		view.getLbl_area_rectangulo().textProperty().bind(model.read_area_rectanguloProperty().asString()); //Bindeo de area
		view.getLbl_perimetro_rectangulo().textProperty().bind(model.read_perimetro_rectanguloProperty().asString()); //Bindeo de perimetro
				
		
		//Listeners para dibujar la figura, esta a la escucha de cambios en el area para actualizar la forma
		model.read_area_rectanguloProperty().addListener((o, ov, nv) -> onDibujarRectangulo(nv));
		

		//BINDINGS Y LISTENERS DE: CIRCULO
		
		
		//Bindings
		Bindings.bindBidirectional(view.getTxt_radio_circulo().textProperty(), model.db_prop_radio_circuloProperty(), new NumberStringConverter());
		view.getLbl_area_circulo().textProperty().bind(model.read_area_circuloProperty().asString()); //Bindeo de area
		view.getLbl_perimetro_circulo().textProperty().bind(model.read_perimetro_circuloProperty().asString()); //Bindeo de perimetro
			
		
		//Listeners para dibujar la figura, esta a la escucha de cambios en el area para actualizar la forma
		model.read_area_circuloProperty().addListener((o, ov, nv) -> onDibujarCirculo(nv));
		
		
		//BINDINGS Y LISTENERS DE TRIANGULO
		
				
		//Bindings
		Bindings.bindBidirectional(view.getTxt_base_triangulo().textProperty(), model.db_prop_base_trianguloProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getTxt_altura_triangulo().textProperty(), model.db_prop_altura_trianguloProperty(), new NumberStringConverter());
		view.getLbl_area_triangulo().textProperty().bind(model.read_area_trianguloProperty().asString()); //Bindeo de area
		view.getLbl_perimetro_triangulo().textProperty().bind(model.read_perimetro_trianguloProperty().asString()); //Bindeo de perimetro
		
		//Listeners para dibujar la figura, esta a la escucha de cambios en el area para actualizar la forma
		model.read_area_trianguloProperty().addListener((o, ov, nv) -> onDibujarTriangulo(nv)); 
		
//		//BINDINGS Y LISTENERS DE HEXAGONO: 		
	
		//Bindings
		Bindings.bindBidirectional(view.getTxt_radio_hexagono().textProperty(), model.db_prop_radio_hexagonoProperty(), new NumberStringConverter());
		view.getLbl_area_hexagono().textProperty().bind(model.read_area_hexagonoProperty().asString());//Bindeo de area
		view.getLbl_perimetro_hexagono().textProperty().bind(model.read_perimetro_hexagonoProperty().asString()); //Bindeo de perimetro
		
		//Listeners para dibujar la figura, esta a la escucha de cambios en el area para actualizar la forma
		model.read_area_hexagonoProperty().addListener((o, ov, nv) -> onDibujarHexagono(nv));
			


	}

	
	 /**
	 * Metodo que solo dibuja la figura  
	 * si cumple un tamaño determinado
	 * Mensaje de alerta si no se puede dibujar
	 * @param nv
	 */  
	private void onDibujarRectangulo(Number nv) {
				
		//Condicional para que no se pase la dimensión a la de pantalla		
		if(model.getDb_prop_altura_rectangulo()>600 || model.getDb_prop_base_rectangulo()>600) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Geometría");
			alert.setHeaderText("Atención");
			alert.setContentText("No se pueden dibujar figuras tan grandes");

			alert.showAndWait();
		}else {				
			view.getRectangulo().setHeight(model.getDb_prop_altura_rectangulo());
			view.getRectangulo().setWidth(model.getDb_prop_base_rectangulo());
	}
		
	}
	
	
	 /**
	 * Metodo que solo dibuja la figura  
	 * si cumple un tamaño determinado
	 * Mensaje de alerta si no se puede dibujar
	 * @param nv
	 */  
private void onDibujarCirculo(Number nv) {
		
		if(model.getDb_prop_radio_circulo()>300) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Geometría");
			alert.setHeaderText("Atención");
			alert.setContentText("No se pueden dibujar figuras tan grandes");
			alert.showAndWait();
		}else {			
			view.getCirculo().setRadius(model.getDb_prop_radio_circulo());
			
	}
		
	}



/**
* Metodo que solo dibuja la figura  
* si cumple un tamaño determinado
* Mensaje de alerta si no se puede dibujar
* @param nv
*/  
private void onDibujarTriangulo(Number nv) {

		if (model.getDb_prop_altura_triangulo() > 600 || model.getDb_prop_base_triangulo() > 600) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Geometría");
			alert.setHeaderText("Atención");
			alert.setContentText("No se pueden dibujar figuras tan grandes");

			alert.showAndWait();
		} else {
			view.getTriangulo().setHeight(model.getDb_prop_altura_triangulo());
			view.getTriangulo().setBase(model.getDb_prop_base_triangulo());
		}
	}


/**
* Metodo que solo dibuja la figura  
* si cumple un tamaño determinado
* Mensaje de alerta si no se puede dibujar
* @param nv
*/  
private void onDibujarHexagono(Number nv) {
	
	if(model.getDb_prop_radio_hexagono()>300) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Geometría");
		alert.setHeaderText("Atención");
		alert.setContentText("No se pueden dibujar figuras tan grandes");
		alert.showAndWait();
	}else {			
		view.getHexagono().setRadius(model.getDb_prop_radio_hexagono());
		
}
	
}



	public View getView() {
		return view;
	}

}
