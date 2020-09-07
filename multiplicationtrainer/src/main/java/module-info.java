module com.myproject.multiplicationtrainer {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.myproject.multiplicationtrainer to javafx.fxml;
    exports com.myproject.multiplicationtrainer;
    exports com.myproject.multiplicationtrainer.fxcontrollers;
    exports com.myproject.multiplicationtrainer.interfaces;
}
