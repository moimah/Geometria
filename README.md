# Inicio sesión MVC 🚀

Aplicación JavaFX que calcula el área de figuras geométricas y las dibuja en pantalla.

 
### Polygon
 
 Hace uso de la clase  javafx.scene.shape.Polygon para trabajar con polígonos existentes(rectángulo, círculo...) 
 
 Además, se crean nuevas figuras implementado dicha clase (Hexágono y triángulo)

 
### CustomBindigs

Se crea un paquete que contiene bindings personalizados para el cálculo de áreas y perímetros de las figuras geométricas.
El cual hace más cómodo los bindeos desde el model de MVC



### View - características y métodos de interés a ser reutilizados: 

- La clase padre es un TabPane, el cual contiene tabs con GridPanes
- Los GridPane incorporan HBoxs con el contenido de sus elementos para centrar correctamente los componentes
- Cada GridPane contiene además una figura gemétrica
- Dentro del view, encontramos un método "textFieldFormmater()" el cual se encarga de formatear los textfield, para que solo admitan valores en coma flotante.
