module com.example.algorithmtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.algorithmtest to javafx.fxml;
    exports com.example.algorithmtest;
}
