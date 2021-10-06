module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens com.miProyecto1 to javafx.fxml;
    exports com.miProyecto1;
}