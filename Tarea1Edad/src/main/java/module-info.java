module com.mycompany.tarea1edad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tarea1edad to javafx.fxml;
    exports com.mycompany.tarea1edad;
}
