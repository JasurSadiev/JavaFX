module com.example.enhanced_tip_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.enhanced_tip_calculator to javafx.fxml;
    exports com.example.enhanced_tip_calculator;
}