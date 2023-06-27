module orsegups.tabajara {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens orsegups.tabajara to javafx.fxml;
    exports orsegups.tabajara;

    requires java.sql;
}