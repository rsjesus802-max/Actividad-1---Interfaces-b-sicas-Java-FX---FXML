module com.mycompany.tarea5gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tarea5gastos to javafx.fxml;
    exports com.mycompany.tarea5gastos;
}
