module com.example.dummies_book6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.dummies_book6 to javafx.fxml;
    exports com.example.dummies_book6;
    exports com.example.dummies_book6.chapter1;
    opens com.example.dummies_book6.chapter1 to javafx.fxml;
    exports com.example.dummies_book6.chapter2;
    opens com.example.dummies_book6.chapter2 to javafx.fxml;
    exports com.example.dummies_book6.chapter3;
    opens com.example.dummies_book6.chapter3 to javafx.fxml;
    exports com.example.dummies_book6.chapter4;
    opens com.example.dummies_book6.chapter4 to javafx.fxml;
    exports com.example.dummies_book6.chapter5;
    opens com.example.dummies_book6.chapter5 to javafx.fxml;
    exports com.example.dummies_book6.chapter6;
    opens com.example.dummies_book6.chapter6 to javafx.fxml;

}