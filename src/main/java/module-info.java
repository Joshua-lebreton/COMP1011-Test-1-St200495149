module com.example.test1comp1011section2200495149 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.test1comp1011section2200495149 to javafx.fxml;
    exports com.example.test1comp1011section2200495149;
}