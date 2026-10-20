module com.mycompany.tarea3cifras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tarea3cifras to javafx.fxml;
    exports com.mycompany.tarea3cifras;
}
