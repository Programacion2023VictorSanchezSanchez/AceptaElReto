module com.example.aceptaelreto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aceptaelreto to javafx.fxml;
    exports com.example.aceptaelreto;
}