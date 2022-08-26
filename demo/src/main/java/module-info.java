module com.pack.project1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pack.project1 to javafx.fxml;
    exports com.pack.project1;
}
