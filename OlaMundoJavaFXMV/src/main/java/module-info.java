module olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens olamundojavafx to javafx.fxml;
    exports olamundojavafx;
}
