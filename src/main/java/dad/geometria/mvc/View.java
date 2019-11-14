package dad.geometria.mvc;

import java.text.DecimalFormat;
import java.text.ParsePosition;

import dad.geometria.shapes.Hexagon;
import dad.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class View extends TabPane {

	/// COMPONENTES DE TAB RECTANGULO

	TextField txt_base_rectangulo;
	TextField txt_altura_rectangulo;
	Rectangle rectangulo;
	Button btn_calcular_rectangulo;
	Label lbl_area_rectangulo;
	Label lbl_perimetro_rectangulo;

	// COMPONENTES DE TAB CIRCULO

	TextField txt_radio_circulo;
	Button btn_calcular_circulo;
	Circle circulo;
	Label lbl_area_circulo;
	Label lbl_perimetro_circulo;

	// COMPONENTES DE TAB TRIANGULO

	TextField txt_base_triangulo;
	TextField txt_altura_triangulo;
	Triangle triangulo;
	Button btn_calcular_triangulo;
	Label lbl_area_triangulo;
	Label lbl_perimetro_triangulo;

	// COMPONENTES DE TAB HEXAGONO

	TextField txt_radio_hexagono;
	Button btn_calcular_hexagono;
	Hexagon hexagono;
	Label lbl_area_hexagono;
	Label lbl_perimetro_hexagono;

	public View() {
		super();

		/////// CONFIGURACION DE TAB RECTANGULO

		Label lbl_base_rectangulo = new Label("Introduce Base");
		lbl_base_rectangulo.setMinWidth(100);
		lbl_base_rectangulo.setMaxWidth(100);
		txt_base_rectangulo = new TextField();
		txt_base_rectangulo.setMinWidth(60);
		txt_base_rectangulo.setMaxWidth(60);
		textFieldFormmater(txt_base_rectangulo); //Formater solo númerico y comas		
		HBox box_base_rectangulo = new HBox(lbl_base_rectangulo, txt_base_rectangulo);
		box_base_rectangulo.setAlignment(Pos.CENTER);

		Label lbl_altura_rectangulo = new Label("Introduce Altura");
		lbl_altura_rectangulo.setMinWidth(100);
		lbl_altura_rectangulo.setMaxWidth(100);
		txt_altura_rectangulo = new TextField();
		txt_altura_rectangulo.setMinWidth(60);
		txt_altura_rectangulo.setMaxWidth(60);
		textFieldFormmater(txt_altura_rectangulo); //Formater solo númerico y comas
		HBox box_altura_rectangulo = new HBox(lbl_altura_rectangulo, txt_altura_rectangulo);
		box_altura_rectangulo.setAlignment(Pos.CENTER);

		rectangulo = new Rectangle();
		rectangulo.setFill(Color.FIREBRICK);
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);

		Label lbl_text_area_rectangulo = new Label("Área");
		lbl_text_area_rectangulo.setMinWidth(100);
		lbl_text_area_rectangulo.setMaxWidth(100);
		lbl_area_rectangulo = new Label();
		lbl_area_rectangulo.setMinWidth(60);
		//lbl_area_rectangulo.setMaxWidth(60);
		lbl_area_rectangulo.setStyle("-fx-font-weight: bold");
		HBox box_area_rectangulo = new HBox(lbl_text_area_rectangulo, lbl_area_rectangulo);
		box_area_rectangulo.setAlignment(Pos.CENTER);

		Label lbl_text_perimetro_rectangulo = new Label("Perímetro");
		lbl_text_perimetro_rectangulo.setMinWidth(100);
		lbl_text_perimetro_rectangulo.setMaxWidth(100);
		lbl_perimetro_rectangulo = new Label();
		lbl_perimetro_rectangulo.setMinWidth(60);
		//lbl_perimetro_rectangulo.setMaxWidth(60);
		lbl_perimetro_rectangulo.setStyle("-fx-font-weight: bold");
		HBox box_perimetro_rectangulo = new HBox(lbl_text_perimetro_rectangulo, lbl_perimetro_rectangulo);
		box_perimetro_rectangulo.setAlignment(Pos.CENTER);

		GridPane pane_rectangulo = new GridPane();

		pane_rectangulo.addRow(0, box_base_rectangulo);
		pane_rectangulo.addRow(1, box_altura_rectangulo);
		pane_rectangulo.addRow(2, rectangulo);
		pane_rectangulo.addRow(3, box_area_rectangulo);
		pane_rectangulo.addRow(4, box_perimetro_rectangulo);

		ColumnConstraints[] colsRectangulo = { new ColumnConstraints(), new ColumnConstraints() };

		GridPane.setHalignment(rectangulo, HPos.CENTER);
		
		
		pane_rectangulo.setAlignment(Pos.CENTER);
		pane_rectangulo.setHgap(15);
		pane_rectangulo.setVgap(5);

		Tab tab_rectangulo = new Tab("Rectangulo");
		tab_rectangulo.setContent(pane_rectangulo);

		/////// CONFIGURACION DE TAB CIRCULO

		Label lbl_radio_circulo = new Label("Introduce radio");
		lbl_radio_circulo.setMinWidth(100);
		lbl_radio_circulo.setMaxWidth(100);
		txt_radio_circulo = new TextField();
		txt_radio_circulo.setMinWidth(60);
		txt_radio_circulo.setMaxWidth(60);
		textFieldFormmater(txt_radio_circulo); //Formater solo númerico y comas
		HBox box_radio_circulo = new HBox(lbl_radio_circulo, txt_radio_circulo);
		box_radio_circulo.setAlignment(Pos.CENTER);

		circulo = new Circle();
		circulo.setFill(Color.CORAL);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);

		Label lbl_text_area_circulo = new Label("Área");
		lbl_text_area_circulo.setMinWidth(100);
		lbl_text_area_rectangulo.setMaxWidth(100);
		lbl_area_circulo = new Label();
		lbl_area_circulo.setMinWidth(60);
		//lbl_area_circulo.setMaxWidth(60);
		lbl_area_circulo.setStyle("-fx-font-weight: bold");
		HBox box_area_circulo = new HBox(lbl_text_area_circulo, lbl_area_circulo);
		box_area_circulo.setAlignment(Pos.CENTER);

		Label lbl_text_perimetro_circulo = new Label("Perímetro");
		lbl_text_perimetro_circulo.setMinWidth(100);
		lbl_text_perimetro_circulo.setMaxWidth(100);
		lbl_perimetro_circulo = new Label();
		lbl_perimetro_circulo.setMinWidth(60);
		//lbl_perimetro_circulo.setMaxWidth(60);
		lbl_perimetro_circulo.setStyle("-fx-font-weight: bold");
		HBox box_perimetro_circulo = new HBox(lbl_text_perimetro_circulo, lbl_perimetro_circulo);
		box_perimetro_circulo.setAlignment(Pos.CENTER);

		GridPane pane_circulo = new GridPane();

		pane_circulo.addRow(0, box_radio_circulo);
		pane_circulo.addRow(1, circulo);
		pane_circulo.addRow(2, box_area_circulo);
		pane_circulo.addRow(3, box_perimetro_circulo);

		ColumnConstraints[] colsCirculo = { new ColumnConstraints(), new ColumnConstraints() };

		GridPane.setHalignment(circulo, HPos.CENTER);

		pane_circulo.setAlignment(Pos.CENTER);
		pane_circulo.setHgap(15);
		pane_circulo.setVgap(5);

		Tab tab_circulo = new Tab("Circulo");
		tab_circulo.setContent(pane_circulo);

		/////// CONFIGURACION DE TAB TRIANGULO

		Label lbl_base_triangulo = new Label("Introduce Base");
		lbl_base_triangulo.setMinWidth(100);
		lbl_base_triangulo.setMaxWidth(100);
		txt_base_triangulo = new TextField();
		txt_base_triangulo.setMinWidth(60);
		txt_base_triangulo.setMaxWidth(60);
		textFieldFormmater(txt_base_triangulo); //Formater solo númerico y comas
		HBox box_base_triangulo = new HBox(lbl_base_triangulo, txt_base_triangulo);
		box_base_triangulo.setAlignment(Pos.CENTER);

		Label lbl_altura_triangulo = new Label("Introduce Altura");
		lbl_altura_triangulo.setMinWidth(100);
		lbl_altura_triangulo.setMaxWidth(100);
		txt_altura_triangulo = new TextField();
		txt_altura_triangulo.setMinWidth(60);
		txt_altura_triangulo.setMaxWidth(60);
		textFieldFormmater(txt_altura_triangulo); //Formater solo númerico y comas
		HBox box_altura_triangulo = new HBox(lbl_altura_triangulo, txt_altura_triangulo);
		box_altura_triangulo.setAlignment(Pos.CENTER);

		triangulo = new Triangle();
		triangulo.setFill(Color.ORCHID);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);

		Label lbl_text_area_triangulo = new Label("Área");
		lbl_text_area_triangulo.setMinWidth(100);
		lbl_text_area_rectangulo.setMaxWidth(100);
		lbl_area_triangulo = new Label();
		lbl_area_triangulo.setMinWidth(60);
		//lbl_area_triangulo.setMaxWidth(60);
		lbl_area_triangulo.setStyle("-fx-font-weight: bold");
		HBox box_area_triangulo = new HBox(lbl_text_area_triangulo, lbl_area_triangulo);
		box_area_triangulo.setAlignment(Pos.CENTER);

		Label lbl_text_perimetro_triangulo = new Label("Perímetro");
		lbl_text_perimetro_triangulo.setMinWidth(100);
		lbl_text_perimetro_triangulo.setMaxWidth(100);
		lbl_perimetro_triangulo = new Label();
		lbl_perimetro_triangulo.setMinWidth(60);
		//lbl_perimetro_triangulo.setMaxWidth(60);
		lbl_perimetro_triangulo.setStyle("-fx-font-weight: bold");
		HBox box_perimetro_triangulo = new HBox(lbl_text_perimetro_triangulo, lbl_perimetro_triangulo);
		box_perimetro_triangulo.setAlignment(Pos.CENTER);

		GridPane pane_triangulo = new GridPane();

		pane_triangulo.addRow(0, box_base_triangulo);
		pane_triangulo.addRow(1, box_altura_triangulo);
		pane_triangulo.addRow(2, triangulo);
		pane_triangulo.addRow(3, box_area_triangulo);
		pane_triangulo.addRow(4, box_perimetro_triangulo);

		ColumnConstraints[] colsTriangulo = { new ColumnConstraints(), new ColumnConstraints() };

		GridPane.setHalignment(triangulo, HPos.CENTER);

		pane_triangulo.setAlignment(Pos.CENTER);
		pane_triangulo.setHgap(15);
		pane_triangulo.setVgap(5);

		Tab tab_triangulo = new Tab("Triangulo");
		tab_triangulo.setContent(pane_triangulo);

		/////// CONFIGURACION DE TAB HEXAGONO

		Label lbl_radio_hexagono = new Label("Introduce lado");
		lbl_radio_hexagono.setMinWidth(100);
		lbl_radio_hexagono.setMaxWidth(100);
		txt_radio_hexagono = new TextField();
		txt_radio_hexagono.setMinWidth(60);
		txt_radio_hexagono.setMaxWidth(60);
		textFieldFormmater(txt_radio_hexagono); //Formater solo númerico y comas
		HBox box_radio_hexagono = new HBox(lbl_radio_hexagono, txt_radio_hexagono);
		box_radio_hexagono.setAlignment(Pos.CENTER);

		hexagono = new Hexagon();
		hexagono.setFill(Color.FORESTGREEN);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);

		Label lbl_text_area_hexagono = new Label("Área");
		lbl_text_area_hexagono.setMinWidth(100);
		lbl_text_area_hexagono.setMaxWidth(100);
		lbl_area_hexagono = new Label();
		lbl_area_hexagono.setMinWidth(60);
		//lbl_area_hexagono.setMaxWidth(60);
		lbl_area_hexagono.setStyle("-fx-font-weight: bold");
		HBox box_area_hexagono = new HBox(lbl_text_area_hexagono, lbl_area_hexagono);
		box_area_hexagono.setAlignment(Pos.CENTER);

		Label lbl_text_perimetro_hexagono = new Label("Perímetro");
		lbl_text_perimetro_hexagono.setMinWidth(100);
		lbl_text_perimetro_hexagono.setMaxWidth(100);
		lbl_perimetro_hexagono = new Label();
		lbl_perimetro_hexagono.setMinWidth(60);
		//lbl_perimetro_hexagono.setMaxWidth(60);
		lbl_perimetro_hexagono.setStyle("-fx-font-weight: bold");
		HBox box_perimetro_hexagono = new HBox(lbl_text_perimetro_hexagono, lbl_perimetro_hexagono);
		box_perimetro_hexagono.setAlignment(Pos.CENTER);

		GridPane pane_hexagono = new GridPane();

		pane_hexagono.addRow(0, box_radio_hexagono);
		pane_hexagono.addRow(1, hexagono);
		pane_hexagono.addRow(2, box_area_hexagono);
		pane_hexagono.addRow(3, box_perimetro_hexagono);

		ColumnConstraints[] colsHexagono = { new ColumnConstraints(), new ColumnConstraints() };

		GridPane.setHalignment(hexagono, HPos.CENTER);

		pane_hexagono.setAlignment(Pos.CENTER);
		pane_hexagono.setHgap(15);
		pane_hexagono.setVgap(5);

		Tab tab_hexagono = new Tab("Hexagono");
		tab_hexagono.setContent(pane_hexagono);

		this.getTabs().add(tab_rectangulo);
		this.getTabs().add(tab_circulo);
		this.getTabs().add(tab_triangulo);
		this.getTabs().add(tab_hexagono);

	}
	
	/**
	* Metodo tipo TextFormater  
	* se encarga de que solo se puedan introducir
	* valores de coma flotante en los textfield
	* @param TextField txt
	*/ 
	
	public void textFieldFormmater(TextField txt) {
		DecimalFormat format = new DecimalFormat("#.0");
		txt.setTextFormatter(new TextFormatter<>(c -> {
			if (c.getControlNewText().isEmpty()) {
				return c;
			}
			ParsePosition parsePosition = new ParsePosition(0);
			Object object = format.parse(c.getControlNewText(), parsePosition);

			if (object == null || parsePosition.getIndex() < c.getControlNewText().length()) {
				return null;
			} else {
				return c;
			}
		}));
	}
	
	

	public TextField getTxt_base_rectangulo() {
		return txt_base_rectangulo;
	}

	public TextField getTxt_altura_rectangulo() {
		return txt_altura_rectangulo;
	}

	public Rectangle getRectangulo() {
		return rectangulo;
	}

	public Button getBtn_calcular_rectangulo() {
		return btn_calcular_rectangulo;
	}

	public Label getLbl_area_rectangulo() {
		return lbl_area_rectangulo;
	}

	public Label getLbl_perimetro_rectangulo() {
		return lbl_perimetro_rectangulo;
	}

	public TextField getTxt_radio_circulo() {
		return txt_radio_circulo;
	}

	public Button getBtn_calcular_circulo() {
		return btn_calcular_circulo;
	}

	public Circle getCirculo() {
		return circulo;
	}

	public Label getLbl_area_circulo() {
		return lbl_area_circulo;
	}

	public Label getLbl_perimetro_circulo() {
		return lbl_perimetro_circulo;
	}

	public TextField getTxt_base_triangulo() {
		return txt_base_triangulo;
	}

	public TextField getTxt_altura_triangulo() {
		return txt_altura_triangulo;
	}

	public Triangle getTriangulo() {
		return triangulo;
	}

	public Button getBtn_calcular_triangulo() {
		return btn_calcular_triangulo;
	}

	public Label getLbl_area_triangulo() {
		return lbl_area_triangulo;
	}

	public Label getLbl_perimetro_triangulo() {
		return lbl_perimetro_triangulo;
	}

	public TextField getTxt_radio_hexagono() {
		return txt_radio_hexagono;
	}

	public Button getBtn_calcular_hexagono() {
		return btn_calcular_hexagono;
	}

	public Hexagon getHexagono() {
		return hexagono;
	}

	public Label getLbl_area_hexagono() {
		return lbl_area_hexagono;
	}

	public Label getLbl_perimetro_hexagono() {
		return lbl_perimetro_hexagono;
	}

}
