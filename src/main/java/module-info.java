module com.example.sep3app {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;

  opens com.example.sep3app to javafx.fxml;
  exports com.example.sep3app;
}