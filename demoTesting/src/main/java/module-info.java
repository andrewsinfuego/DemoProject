module com.example.demotesting {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demotesting to javafx.fxml;
    exports com.example.demotesting;
    exports com.example.demotesting.controller;
    opens com.example.demotesting.controller to javafx.fxml;
}