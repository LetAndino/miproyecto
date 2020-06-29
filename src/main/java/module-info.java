module edu.snpp.miproyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.snpp.miproyecto to javafx.fxml;
    exports edu.snpp.miproyecto;
}
