module com.mycompany.tarea4tabla {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tarea4tabla to javafx.fxml;
    exports com.mycompany.tarea4tabla;
}
