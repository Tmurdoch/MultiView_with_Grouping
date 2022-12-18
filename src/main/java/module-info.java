module com.example.multiview_with_grouping {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiview_with_grouping to javafx.fxml;
    exports com.example.multiview_with_grouping;
}