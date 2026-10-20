module com.mycompany.tarea2dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tarea2dinero to javafx.fxml;
    exports com.mycompany.tarea2dinero;
}
