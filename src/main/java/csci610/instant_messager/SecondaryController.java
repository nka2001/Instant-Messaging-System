package csci610.instant_messager;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {


    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}