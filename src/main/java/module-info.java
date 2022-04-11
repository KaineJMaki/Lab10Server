module com.example.lab10server {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab10server to javafx.fxml;
    exports com.example.lab10server;
}