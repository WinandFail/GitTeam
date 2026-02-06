module com.example._02611 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._02611 to javafx.fxml;
    exports com.example._02611;
}