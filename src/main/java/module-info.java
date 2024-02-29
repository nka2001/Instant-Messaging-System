module csci610.instant_messager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens csci610.instant_messager to javafx.fxml;
    exports csci610.instant_messager;
}
