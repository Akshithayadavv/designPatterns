module com.example.designpattern2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designpattern2 to javafx.fxml;
    exports com.example.designpattern2;
}