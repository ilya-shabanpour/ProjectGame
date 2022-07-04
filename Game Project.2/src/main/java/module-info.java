module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.GameProject2 to javafx.fxml;
    exports com.example.GameProject2;
}